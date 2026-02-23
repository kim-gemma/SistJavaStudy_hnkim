package com.boot.data;

import java.util.List;
import java.util.Vector;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.test.ShopDto;
import com.boot.test.TestDto;

@Controller
public class TestController {

	@GetMapping("/test")
	@ResponseBody
	public TestDto hello()
	{
		TestDto dto=new TestDto();
		
		dto.setName("김용희");
		dto.setAddr("인천시 남동구");
		return dto;
	}
	
	
	@GetMapping("/shop/list")
	public @ResponseBody List<ShopDto> list()
	{
		List<ShopDto> list=new Vector<>();
		
		ShopDto s1=new ShopDto();
		
		s1.setSangpum("아이폰17");
		s1.setSu(42);
		s1.setDan(1500000);
		list.add(s1);
		
		ShopDto s2=new ShopDto();
		
		s1.setSangpum("갤럭시");
		s1.setSu(50);
		s1.setDan(1400000);
		list.add(s2);
		
		return list;
	}
}
