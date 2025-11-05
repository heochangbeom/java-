package com.mapper;
//DTO, DO, VO

import java.util.Date;
import java.util.List;

import lombok.Data;

//DTO, DO, VO

@Data
public class BoardVO {
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;		//yyyy-MM-dd
	private Date updatedate;
	
	List<ReplyVO> reply;
}
