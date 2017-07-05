package edu.cueb.jxq.controller;

import edu.cueb.jxq.service.TestService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
/**
 * Created by jiangxingqi on 2017/6/29.
 */
@Controller
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/index")
	public ModelAndView hello(){
		ModelAndView mv = new ModelAndView("index");
		Map<String,Object> user=new HashedMap();
		user.put("name", "jiangxing");
		user.put("gender","1");//gender:性别，1：男；0：女；
		//testService.insert(user);
		mv.addObject("user",user);
		return mv;
	}
	
}
