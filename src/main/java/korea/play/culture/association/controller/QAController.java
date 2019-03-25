package korea.play.culture.association.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import korea.play.culture.association.service.QAService;

@RestController
@RequestMapping("/qacontroller")
public class QAController {
	
	@Autowired
	QAService qa;
	
	// /qacontroller/qalist
	@RequestMapping("/qalist")
	public ModelAndView mainTest() {
		ModelAndView view = new ModelAndView();
		view.setViewName("test/qaList");
		return view;
	}
	
	public HashMap<String, Object> qaFind(){
		HashMap<String, Object> result = new HashMap<String, Object>();
		try {
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
