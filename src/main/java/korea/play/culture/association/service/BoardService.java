package korea.play.culture.association.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import korea.play.culture.association.dao.BoardDao;

@Service("BoardService")
public class BoardService {

	@Autowired
	private BoardDao boardDao;

	/**
	 * 게시판 조
	 * @param request
	 * @return
	 */
	@SuppressWarnings("null")
	public HashMap<String, Object> boardFind(HashMap<String, Object> request) {
		HashMap<String, Object> result = boardDao.boardFind(request);
		
		if(result == null && result.isEmpty()) {
			result.put("", "");
			result.put("", "");
			result.put("", "");
			result.put("", "");
			result.put("", "");
		}
		
		return result;
	}
	
	/**
	 * 게시판 저장 
	 * @param request
	 * @return
	 */
	@SuppressWarnings("null")
	public HashMap<String, Object> boardSave(HashMap<String, Object> request) {
		HashMap<String, Object> result = boardDao.boardFind(request);
		
		if(result == null && result.isEmpty()) {
		}
		
		return result;
	}
	
	/**
	 * 게시판 수정 
	 * @param request
	 * @return
	 */
	@SuppressWarnings("null")
	public HashMap<String, Object> boardEdit(HashMap<String, Object> request) {
		HashMap<String, Object> result = boardDao.boardFind(request);
		
		if(result == null && result.isEmpty()) {
		}
		
		return result;
	}
	
	/**
	 * 게시판 삭제 
	 * @param request
	 * @return
	 */
	@SuppressWarnings("null")
	public HashMap<String, Object> boardRemove(HashMap<String, Object> request) {
		HashMap<String, Object> result = boardDao.boardFind(request);
		
		if(result == null && result.isEmpty()) {
		}
		
		return result;
	}

}
