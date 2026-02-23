package data.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import data.dto.MycarDto;
import lombok.AllArgsConstructor;

@Repository //스프링 Bean 등록
@AllArgsConstructor //다생성해서 받겠다~~ autowire말고~?
public class MycarDao {
	
	
	MycarDaoInter daoInter;
	public void insertMycar(MycarDto dto) {
		daoInter.save(dto); //save는 dto에 num값이 포함유무에 따라 insert,update
	}
	
	public List<MycarDto> getAllCars(){
		
		//return daoInter.findAll()//전체 데이터 반환
		return daoInter.findAll(Sort.by(Sort.Direction.DESC,"carprice")); //가격비싼거부터
	}
	
	//num에 해당하는 dto반환
	public MycarDto getData(Long num) {
		return daoInter.getReferenceById(num);
	}
	
	//delete
	public void delete(Long num) {
		daoInter.deleteById(num);
	}
	
	//update
	public void update(MycarDto dto ) {
		daoInter.save(dto);//num이 포함된
	}
}
