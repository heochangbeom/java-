package com.yedam.board;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;
import com.yedam.config.DataSourceConfig;
import com.yedam.config.MybatisConfig;
import com.yedam.config.RootConfig;

@SpringJUnitConfig(classes = {DataSourceConfig.class, 
						MybatisConfig.class,
						RootConfig.class})

public class ReplyServiceTest {

	@Autowired
	ReplyService replyService;
	
	@Test
	public void insert() {
	 ReplyVO replyVO = new ReplyVO();
	 replyVO.setReply("댓글등록테스트");
	 replyVO.setReplyer("홍길동");
	 replyVO.setBno(3l);
	 int result = replyService.insert(replyVO);
	 assertEquals(result, 1);
	}
	
	@Test
	public void select() {
	 ReplyVO replyVO = new ReplyVO();
	 replyVO.setBno(13l);
	 int result = replyService.insert(replyVO);
	 assertEquals(result, 1);
	}
	
	@Test
	public void delete() {
	 ReplyVO replyVO = new ReplyVO();
	 replyVO.setRno(15l);
	 int result = replyService.insert(replyVO);
	 assertEquals(result, 1);
	}

}
