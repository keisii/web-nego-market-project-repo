package kr.co.tj.recordservice.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long cid;
	private String username;
	private String title;
	private String content;
	private Date createDate;
} 
