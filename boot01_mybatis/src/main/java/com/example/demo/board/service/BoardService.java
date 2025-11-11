package com.example.demo.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface BoardService {

		//등록
		int insert(BoardVO board);
		
		//수정
		int update(BoardVO board);

		//삭제
		int delete(Map<String, Object> map);

		//단건조회
		BoardVO getBoard(Long bno);

		//전체조회
		List<BoardVO> getList();

		List<BoardVO> getListByWriter(BoardVO board);	
		
		//페이징-전체건수조회
	}
