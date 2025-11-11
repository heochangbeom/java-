package com.example.demo.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyService;
import com.example.demo.board.service.ReplyVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class ReplyServiceImpl implements ReplyService {

	private final ReplyMapper ReplyMapper;
	
	@Override
	public ReplyVO getReply(Long bno) {
		return ReplyMapper.getReply(bno);
	}
	
	@Override
	public int insert(ReplyVO Reply) {
		return ReplyMapper.insert(Reply);
	}

	@Override
	public int delete(Long rno) {
		return ReplyMapper.delete(rno);
	}

	@Override
	public int update(ReplyVO reply) {
		return 0;
	}

	@Override
	public List<ReplyVO> getList(Long bno) {
		return ReplyMapper.getList(bno);
	}
	
}
