package com.mapper;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:/spring/datasource-context.xml")
public class BoardMapperTest {

	@Autowired
	BoardMapper boardMapper;

	@Disabled
	@Test
	void 전체조회() {
		// given

		// when
		List<BoardVO> list = boardMapper.getList();

		// then
		assertEquals(list.get(0).getWriter(), "user02");

		for (BoardVO board : list) {
			System.out.println(board.getBno() + ":" + board.getTitle());
			for (ReplyVO reply : board.getReply())
				System.out.println("reply.getReply 확인:============= " + reply.getReply());
		}

		System.out.println(list);
	}
	@Disabled
	@Test
	void 등록() {
		// given
		BoardVO board = new BoardVO();
		board.setTitle("스프링");
		board.setContent("등록테스트");
		board.setWriter("user03");
		// when
		int result = boardMapper.insert(board);

		// then
		assertEquals(result, 1);

	}
	
	@Disabled
	@Test
	void 수정() {
		// given
		BoardVO board = new BoardVO();
		board.setBno(7l);
		board.setTitle("수정스프링");
		board.setContent("수정테스트");
		// when
		int result = boardMapper.update(board);

		// then
		assertEquals(result, 1);

	}
	@Test
	void 삭제() {
		// given
		Long bno = 4l;

		// when
		int result = boardMapper.delete(bno);

		// then
		assertEquals(result, 1);

	}
}
