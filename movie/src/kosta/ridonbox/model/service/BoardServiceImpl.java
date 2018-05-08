package kosta.ridonbox.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.ridonbox.model.dao.BoardDAOImpl;
import kosta.ridonbox.model.dto.BoardDTO;

public class BoardServiceImpl {
	public List<BoardDTO> boardList() throws SQLException{
		BoardDAOImpl dao = new BoardDAOImpl();

		List<BoardDTO> list=dao.boardList();
		if(list==null || list.size()==0) {
			throw new SQLException("��ȸ�� �Խù��� �����ϴ�.");
		}
		return list;	
	}
}