package boot.mycar.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyCarController {
	@Autowired
	MyCarDao dao;
	
		//list  ..시작페이지
		@GetMapping("/mycar/list")
		public ModelAndView list()
		{
			ModelAndView model=new ModelAndView();
			
			List<MyCarDto> list=dao.getAllDatas();
			
			model.addObject("list", list);
			model.addObject("count", list.size());
			
			model.setViewName("carlist");
			return model;
		}

	//폼나오게
	@GetMapping("/mycar/addform")
	public String form1()
	{
		return "addform";
	}
	
	//insert
	@PostMapping("/mycar/insert")
	public String add(@ModelAttribute MyCarDto dto)
	{
		dao.InsertMycar(dto);
		return "redirect:list";
	}
	
	//수정폼띠우기
	@GetMapping("/mycar/updateform")
	public ModelAndView updateform(@RequestParam Long num)
	{
		ModelAndView model=new ModelAndView();
		
		MyCarDto dto=dao.getData(num);
		
		model.addObject("dto", dto);
		
		model.setViewName("updateform");
		return model;
	}
	
	//수정후 리스트로...
	@PostMapping("/mycar/update")
	public String update(@ModelAttribute MyCarDto dto)
	{
		dao.updateCar(dto);
		return "redirect:list";
}
	
	//삭제
	@GetMapping("/mycar/delete")
	public String delete(@RequestParam Long num)
	{
		dao.deleteCar(num);
		return "redirect:list";
	}
	
}
