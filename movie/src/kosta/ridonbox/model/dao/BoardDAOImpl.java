package kosta.ridonbox.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kosta.ridonbox.model.dto.BoardDTO;
import kosta.ridonbox.util.DbUtil;

public class BoardDAOImpl {

	public List<BoardDTO> boardList() throws SQLException {
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		List<BoardDTO> list = new ArrayList<>();

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("select*from board");
			rs = ps.executeQuery();

			int boardNum = rs.getInt(1);
			while (rs.next()) {
				String id = rs.getString(2);
				String boardTitle = rs.getString(3);
				String boardConts = rs.getString(4);
				String reply = rs.getString(5);
				String boardDate = rs.getString(6);
				String boardPassword = rs.getString(7);

				list.add(new BoardDTO(boardNum, id, boardTitle, boardConts, reply, boardDate, boardPassword));
			}
		} finally {
			DbUtil.dbClose(con, ps, rs);
		}
		return list;
	}
}