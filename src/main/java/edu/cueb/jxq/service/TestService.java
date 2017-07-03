package edu.cueb.jxq.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by jiangxingqi on 2017/6/29.
 */
@Service
public class TestService {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insert(Map map){
        DBCollection collection = mongoTemplate.getCollection("test");
        DBObject obj=  new BasicDBObject(map);
        collection.insert(obj);
    }

}
