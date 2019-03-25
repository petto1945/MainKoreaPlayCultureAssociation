package korea.play.culture.association.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import korea.play.culture.association.dao.GalleryDao;

@Service("GalleryService")
public class GalleryService {
	
	@Autowired
	GalleryDao	gallery;
	
	/**
	 * 겔러리 게시판 처음 조회
	 * @param request
	 * @return result
	 * @throws Exception
	 */
	public HashMap<String, Object> galleryFind(HashMap<String, Object> request) throws Exception{
		HashMap<String, Object> result = new HashMap<String, Object>();
		HashMap<String, Object> reDao = gallery.galleryFind(request);
		
		
		return result;
	}
	
	/**
	 * 겔러이 게시판 글쓰기
	 * @param request
	 * @return result
	 * @throws Exception
	 */
	public HashMap<String, Object> galleryInsert(HashMap<String, Object> request) throws Exception {
		HashMap<String, Object> result = new HashMap<String, Object>();
		HashMap<String, Object> reDao = gallery.galleryInsert(request);
		
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
		HashMap<String, Object> reDao = gallery.galleryUpdate(request);
		
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
		HashMap<String, Object> reDao = gallery.galleryRemove(request);
		
		return result;
	}

}
