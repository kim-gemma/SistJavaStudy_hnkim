package data.dto;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="jpa_comment")
public class MycarCommentDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idx;
	
	@JoinColumn(name="num")
	@OnDelete(action = OnDeleteAction.CASCADE) //부모데이터 지우면 댓글도 지워지는거
	@ManyToOne //여러개가 하나를 참조 해당 엔티니 테이블에 외래키 존재
	private MycarDto mycar;
	
	@Column
	private String comment;
	
	@CreationTimestamp
	@Column(updatable = false)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private Timestamp writeday;
	
	@Transient //테이블에 컬럼으로는 생성되지 않고 객체에서만 사용 가능한 변수
	private int commentcount;
	
	@Transient
	private String message;
}
