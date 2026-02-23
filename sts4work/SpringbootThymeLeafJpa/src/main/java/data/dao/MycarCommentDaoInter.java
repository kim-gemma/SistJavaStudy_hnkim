package data.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import data.dto.MycarCommentDto;
import data.dto.MycarDto;
import jakarta.transaction.Transactional;

public interface MycarCommentDaoInter extends JpaRepository<MycarCommentDto, Integer> {
	//@Query:repository에 원하는 쿼리를 작성하게 해주는 어노테이션
		//value속성: 쿼리작성부
		//nativeQuery:jpa에서 지정한 규칙을 모두 무시할수있는 속성
		//@Transactional:update,delete를 할때 표기해줘야 정상실행
		//@Modifying ddl규뮨 사용할때 표시
		
		//num에 해당하는 댓글 목록출력 메서드
		@Query(value = "select * from jpacar_comment where num=:num order by idx desc", nativeQuery = true)
		//@Query("select c from jpacar_comment where c.num=:num order by c.idx desc") ==> jpql
		public List<MycarCommentDto> getMycarCommentList(@Param("num") Long num);
}
