package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@GetMapping("/list")
	public ModelAndView list()
	{
		ModelAndView mview=new ModelAndView();
		mview.addObject("name", "쌍용교육센터");
		mview.addObject("addr", "서울시 강남구");
		
		mview.setViewName("list"); //board/list
		
		return mview;
	}
}
