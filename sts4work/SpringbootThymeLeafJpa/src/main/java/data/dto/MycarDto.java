package data.dto;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="jpacar")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class MycarDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long num;
	@Column(name="carname", length=30) //length 생략시 255
	private String carname;
	@Column(length=30)
	private int carprice;
	@Column(length=30)
	private String carcolor;
	@Column(length=100)
	private String carphoto;
	@Column
	private String carquip;
	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp writeday;
}
