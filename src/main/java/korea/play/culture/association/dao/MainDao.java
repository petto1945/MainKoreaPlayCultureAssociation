package korea.play.culture.association.dao;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

@Repository("MainDao")
public class MainDao {
	
	@Autowired
	MongoOperations mongo;
	
	/**
	 * 공지사항
	 * @return HashMap<String, Object>
	 */
	public HashMap<String, Object> notice(){
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		return result;
	}
	
	/**
	 * 자료실(갤러리)
	 * @return HashMap<String, Object>
	 */
	public HashMap<String, Object> refRoom(){
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		return result;
	}
}
