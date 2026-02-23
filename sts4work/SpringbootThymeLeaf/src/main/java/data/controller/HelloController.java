package data.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import data.dto.ShopDto;

@Controller
public class HelloController {

	
	List<ShopDto> list =new ArrayList<>();
	
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/hello1")
	public String hello1(Model model) {
		System.out.println("heloo~~~");
		model.addAttribute("message", "have a nice day");
		model.addAttribute("today", new Date());
		
		ShopDto dto=ShopDto.builder()
				.num(100)
				.sangpum("노트북")
				.su(5)
				.dan(250000)
				.color("pink")
				.build();
		
		model.addAttribute("dto", dto);
		
		return "hello1";
	}
	
	@GetMapping("/hello2")
	public String hello2(
	        @RequestParam("name") String name,
	        @RequestParam("age") int age,
	        Model model) {

	    model.addAttribute("name", name);
	    model.addAttribute("age", age);

	    return "hello2";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		
		list.add(new ShopDto(1, "텀블러", 10, 280000, "pink"));
		list.add(new ShopDto(2, "진주목걸이", 30, 5080000, "white"));
		list.add(new ShopDto(3, "키보드", 3, 580000, "black"));
		list.add(new ShopDto(4, "볼펜", 200, 3000, "yellow"));
		
		ShopDto dto5 = ShopDto.builder()
				.num(10)
				.sangpum("다이어리")
				.su(55)
				.dan(5800)
				.color("blue")
				.build();
		
		list.add(dto5);
		model.addAttribute("list", list);
		return "list";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam("index") int index, Model model) {
		model.addAttribute("dto", list.get(index));
		return "detailpage";
	}

}
