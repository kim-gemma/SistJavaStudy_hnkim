package data.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import data.dao.MycarDao;
import data.dao.MycarDaoInter;
import data.dto.MycarDto;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor // final Nonull
public class MycarController {

    private final MycarDaoInter mycarDaoInter;
	
	
	private final MycarDao mycardao;

	
	@GetMapping("/")
	public String start() {
		return "redirect:list";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		
		List<MycarDto> list=mycardao.getAllCars();
		//request저장
		model.addAttribute("list", list);
		model.addAttribute("totalcount", list.size());
		
		
		//포워드
		return "mycar/mycarlist";
	}
	
	//입력폼이동
	@GetMapping("/addcar")
	public String addform() {
		return "mycar/addform";
	}
	
	@PostMapping("/insert")
	public String insert(@ModelAttribute MycarDto dto,
			@RequestParam("carupload") MultipartFile carupload,
			HttpSession session) {
		
		String realpath= session.getServletContext().getRealPath("/carsave");
		System.out.println(realpath);
		
		String uploadname= carupload.getOriginalFilename();
		
		dto.setCarphoto(uploadname);
		try {
			carupload.transferTo(new File(realpath+"\\"+ uploadname));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mycardao.insertMycar(dto);
		
		return "redirect:list";
	}
	
	//detail
	@GetMapping("/detail")
	public String detail(@RequestParam ("num") Long num,
			Model model) {
		
		MycarDto dto=mycardao.getData(num);
		model.addAttribute("dto", dto);
		return "mycar/mycardetail";
	}
	
	//수정폼이동
	@GetMapping("/updateform")
	public String uform(@RequestParam("num") Long num, Model model) {
		MycarDto dto= mycardao.getData(num);
		
		model.addAttribute("dto", dto);
		
		return "mycar/updateform";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute MycarDto dto,
			@RequestParam("carupload") MultipartFile carupload,
			HttpSession session) {
		
		String realpath= session.getServletContext().getRealPath("/carsave");
		System.out.println(realpath);
		
		String uploadname= carupload.getOriginalFilename();
		
		dto.setCarphoto(uploadname);
		try {
			carupload.transferTo(new File(realpath+"\\"+ uploadname));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mycardao.update(dto);
		
		return "redirect:list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("num") Long num,
			HttpSession session) {
		
		MycarDto dto= mycardao.getData(num);
		String realPath= session.getServletContext().getRealPath("/carsave");
		File file= new File(realPath +"\\"+dto.getCarphoto());
		
		if(file.exists()) {
			file.delete();
		}
		
		mycardao.delete(num);
		return "redirect:list";
	}
}
