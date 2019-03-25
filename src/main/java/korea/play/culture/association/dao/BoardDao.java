package korea.play.culture.association.dao;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

@Repository("BoardDao")
public class BoardDao {
	
	@Autowired
	MongoOperations mongo;
	
	/**
	 * 게시판 조
	 * @param request
	 * @return HashMap<String, Object>
	 */
	public HashMap<String, Object> boardFind(HashMap<String, Object> request) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		return result;
	}
	
	/**
	 * 게시판 저
	 * @param request
	 * @return HashMap<String, Object>
	 */
	public HashMap<String, Object> boardSave(HashMap<String, Object> request) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		return result;
	}
	
	/**
	 * 게시판 수
	 * @param request
	 * @return HashMap<String, Object>
	 */
	public HashMap<String, Object> boardEdit(HashMap<String, Object> request){
		HashMap<String, Object> result = new HashMap<String, Object>();
		return result;
	}
	
	/**
	 * 게시판 삭
	 * @param request
	 * @return HashMap<String, Object>
	 */
	public HashMap<String, Object> boardRemove(HashMap<String, Object> request){
		HashMap<String, Object> result = new HashMap<String, Object>();
		return result;
	}
}
