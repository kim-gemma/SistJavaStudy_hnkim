package data.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import data.dto.MycarCommentDto;
import data.dto.MycarDto;
import jakarta.transaction.Transactional;


public interface MycarDaoInter extends JpaRepository<MycarDto, Long>{
	
	
	
}
