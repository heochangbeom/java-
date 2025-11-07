package com.yedam.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ReplyService {

		//등록
		int insert(ReplyVO reply);
		
		//수정
		int update(ReplyVO reply);

		//삭제
		int delete(Long rno);

		//단건조회
		ReplyVO getReply(Long bno);

		List<ReplyVO> getList(Long bno);

		
		//페이징-전체건수조회
	}
