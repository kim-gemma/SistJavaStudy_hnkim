package com.boot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.boot.dto.InfoDto;

@Controller
@RequestMapping("/my")
public class FormReadController {

	//폼읽의 컬럼을 각각읽어서 result1,2,3로 보낸다
	
	//폼1-->result1
	@PostMapping("/read1")
	public ModelAndView read1(@RequestParam String name,
			@RequestParam int java,
			@RequestParam int spring)
	{
		ModelAndView model=new ModelAndView();
		//request에 저장
		model.addObject("name", name);
		model.addObject("java", java);
		model.addObject("spring", spring);
		model.addObject("tot", spring+java);
		model.addObject("avg", (java+spring)/2.0);
		
		//forward
		model.setViewName("result/result1");
		
		return model;
	}
	
	//폼2==>result2
	@PostMapping("/read2")
	public String read2(@ModelAttribute InfoDto dto)
	{
		return "result/result2";
	}
	
	//폼3==>result3
	//map으로 읽을경우 폼의 name이  key값으로, 입력값이 value값으로 들어간다
	@PostMapping("/read3")
	public ModelAndView read3(@RequestParam Map<String, String> map)
	{
		ModelAndView model=new ModelAndView();
		
		model.addObject("name", map.get("irum"));
		model.addObject("blood", map.get("blood"));
		model.addObject("handp", map.get("hp"));
		
		model.setViewName("result/result3");
		return model;
	}
}
