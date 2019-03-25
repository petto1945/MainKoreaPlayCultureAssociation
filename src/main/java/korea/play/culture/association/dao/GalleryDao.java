package korea.play.culture.association.dao;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

@Repository("GalleryDao")
public class GalleryDao {
	
	@Autowired
	MongoOperations mongo;
	
	/**
	 * 겔러리 게시판 처음 조회
	 * @param request
	 * @return result;
	 * @throws Exception
	 */
	public HashMap<String, Object> galleryFind(HashMap<String, Object> request) throws Exception {
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		return result;
	}
	
	/**
	 * 겔러리 게시판 글쓰기
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> galleryInsert(HashMap<String, Object> request) throws Exception {
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		return result;
	}
	
	/**
	 * 겔러리 게시판 수정하기
	 * @param request
	 * @return result
	 * @throws Exception
	 */
	public HashMap<String, Object> galleryUpdate(HashMap<String, Object> request) throws Exception {
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		return result;
	}
	
	/**
	 * 겔러리 게시판 삭제
	 * @param request
	 * @return result
	 * @throws Exception
	 */
	public HashMap<String, Object> galleryRemove(HashMap<String, Object> request) throws Exception {
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		return result;
	}

}
