package boot.board.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {
	@Autowired
	BoardDaoInter inter;
	
	//insert
	public void insertBoard(BoardDto dto) {
		
		inter.save(dto);
	}
	
	//전체목록
	public List<BoardDto> getAllDatas(){
		return inter.findAll(Sort.by(Sort.Direction.DESC));
		//최신글이 위로 올라오게 정렬
		
	}
	
}
