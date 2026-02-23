package data.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import data.dto.MycarCommentDto;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MycarCommentDao {

	private final MycarCommentDaoInter commentDaoInter;
	
	//댓글저장
	public void insertComment(MycarCommentDto dto) {
		commentDaoInter.save(dto);
		
	}
	
	//댓글출력
	public List<MycarCommentDto> getMycarComment(Long num){
		return commentDaoInter.getMycarCommentList(num);
	}
}
