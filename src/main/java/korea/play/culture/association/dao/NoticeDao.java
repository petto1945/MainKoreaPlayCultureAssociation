package korea.play.culture.association.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

@Repository("NoticeDao")
public class NoticeDao {
	
	@Autowired
	MongoOperations mongo;
}
