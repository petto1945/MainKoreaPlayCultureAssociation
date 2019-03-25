package korea.play.culture.association.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import korea.play.culture.association.service.GalleryService;

@RestController
@RequestMapping("/gallerycontroller")
public class GalleryController {
	
	@Autowired
	GalleryService gallery;
	
	@RequestMapping("/gallerylist")
	public ModelAndView mainTest() {
		ModelAndView view = new ModelAndView();
		view.setViewName("test/galleryList");
		return view;
	}
	
	/**
	 * 겔러리 처음 조회
	 * @return result
	 */
	public HashMap<String, Object> galleryFind(HashMap<String, Object> request) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		try {
			System.out.println("request : " + request);
			result = gallery.galleryFind(request);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("result : " + result);
		return result;
	}
	
	/**
	 * 겔러리 게시판 글쓰기
	 * @param request
	 * @return result
	 */
	public HashMap<String, Object> galleryInsert(HashMap<String, Object> request){
		HashMap<String, Object> result = new HashMap<String, Object>();
		try {
			System.out.println("request : " + request);
			result = gallery.galleryInsert(request);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("result : " + result);
		return result;
	}
	
	/**
	 * 겔러리 게시판 수정
	 * @param request
	 * @return result
	 */
	public HashMap<String, Object> galleryUpdate(HashMap<String, Object> request){
		HashMap<String, Object> result = new HashMap<String, Object>();
		try {
			System.out.println("request : " + request);
			result = gallery.galleryUpdate(request);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("result : " + result);
		return result;
	}
	
	/**
	 * 겔러리 게시판 삭제
	 * @param request
	 * @return result
	 */
	public HashMap<String, Object> galleryRemove(HashMap<String, Object> request){
		HashMap<String, Object> result = new HashMap<String, Object>();
		try {
			System.out.println("request : " + request);
			result = gallery.galleryUpdate(request);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("result : " + result);
		return result;
	}
}
