package korea.play.culture.association.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import korea.play.culture.association.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	/**
	 * 게시판 조회
	 * @param request
	 * @return ModelAndView
	 */
	@RequestMapping(value="/boardfind", method=RequestMethod.POST)
	public ModelAndView boardfind(@RequestParam HashMap<String, Object> request) {
		ModelAndView view = new ModelAndView();
		
		try {
			HashMap<String, Object> result = boardService.boardFind(request);
			if(result != null && !result.isEmpty()) {
				 view.addAllObjects(result);
			} 
		} catch(Exception e) {
			e.getMessage();
		}
		
		return view;
	}
	
	/**
	 * 게시판 저
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/boardsave", method=RequestMethod.POST)
	public ModelAndView boardSave(@RequestParam HashMap<String, Object> request) {
		ModelAndView view = new ModelAndView();
		
		try {
			
		} catch(Exception e) {
			
		}
		
		return view;
	}
	
	/**
	 * 게시판 삭
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/boardremove", method=RequestMethod.POST)
	public ModelAndView boardRemove(@RequestParam HashMap<String, Object> request) {
		ModelAndView view = new ModelAndView();
		
		try {
			
		} catch(Exception e) {
			
		}
		
		return view;
	}
	
	/**
	 * 게시판 수
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/boardedit", method=RequestMethod.POST)
	public ModelAndView boardEdit(@RequestParam HashMap<String, Object> request) {
		ModelAndView view = new ModelAndView();
		
		try {
			
		} catch(Exception e) {
			
		}
		
		return view;
	}
	
	@RequestMapping(value = "testing", method=RequestMethod.POST)
	public void testing(@RequestBody HashMap<String, Object> request) {
		System.out.println("=========== requst : " + request);
		try {
			CloseableHttpClient httpclient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost("http://localhost:8019/common/stats/userconn");
			List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			String data = "바보멍청";
			nvps.add(new BasicNameValuePair("param1", data));
//			httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
			HttpEntityEnclosingRequestBase method = httpPost;
			method.setEntity(new StringEntity(data,"UTF-8"));
			CloseableHttpResponse response = httpclient.execute(method);
			try {
				System.out.println(response.getStatusLine());
				System.out.println(EntityUtils.toString(response.getEntity()));
				HttpEntity entity = response.getEntity();
				EntityUtils.consume(entity);
			} catch(Exception e) {
				response.close();
			}
			
            response.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
