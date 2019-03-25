package korea.play.culture.association.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import korea.play.culture.association.service.NoticeService;

@RestController
@RequestMapping("/noticecontroller")
public class NoticeController {
	
	@Autowired
	NoticeService notice;
	
	public HashMap<String, Object> noticeFind() {
		HashMap<String, Object> result = new HashMap<String, Object>();
		try {
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
