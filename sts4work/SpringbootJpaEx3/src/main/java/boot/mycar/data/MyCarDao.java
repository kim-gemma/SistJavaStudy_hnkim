package boot.mycar.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyCarDao {

	@Autowired
	MycarDaoInter carInter;
	
	//insert
	public void InsertMycar(MyCarDto dto)
	{
		carInter.save(dto);  //id타입의 유무에 따서서 자동으로 insert,update인지 처리해준다
	}
	
	//전체출력
	public List<MyCarDto> getAllDatas()
	{
		return carInter.findAll();
	}
	
	//수정
	//num에 대한 하나의 dto
	public MyCarDto getData(Long num)
	{
		return carInter.getById(num);
	}
	
	//수정
	public void updateCar(MyCarDto dto)
	{
		carInter.save(dto); //num을 포함하고 있으므로 update 수정됨
	}
	
	//삭제
	public void deleteCar(Long num)
	{
		carInter.deleteById(num);
	}
	
}
