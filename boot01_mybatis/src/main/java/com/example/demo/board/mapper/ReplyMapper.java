package com.example.demo.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.service.ReplyVO;

@Mapper
public interface ReplyMapper {

	//단건조회
	ReplyVO getReply(Long rno);

	//등록
	int insert(ReplyVO Reply);

	//삭제
	int delete(Long rno);
	
	List<ReplyVO> getList(Long bno);


}
