package korea.play.culture.association.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

@Repository("QADao")
public class QADao {
	
	@Autowired
	MongoOperations mongo;
}
