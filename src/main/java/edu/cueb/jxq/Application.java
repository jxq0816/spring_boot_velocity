package edu.cueb.jxq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by jiangxingqi on 2017/6/17.
 */
@SpringBootApplication
@ImportResource("classpath:/config/mongo.xml")
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class Application{
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
