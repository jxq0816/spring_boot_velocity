package edu.cueb.jxq.controller;

import edu.cueb.jxq.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Created by jiangxingqi on 2017/6/29.
 */
@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/hello")
	public String hello(Map<String,Object> map){

		testService.insert();

		map.put("name", "姜兴琪");
		map.put("gender","1");//gender:性别，1：男；0：女；
		
		List<Map<String,Object>> friends =new ArrayList<Map<String,Object>>();
		Map<String,Object> friend = new HashMap<String,Object>();
		friend.put("name", "张三");
		friend.put("age", 20);
		friends.add(friend);
		friend = new HashMap<String,Object>();
		friend.put("name", "李四");
		friend.put("age", 22);
		friends.add(friend);
		map.put("friends", friends);
		return "hello";
	}
	
}
