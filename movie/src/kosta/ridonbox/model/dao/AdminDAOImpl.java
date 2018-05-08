package kosta.ridonbox.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kosta.ridonbox.model.dto.BranchDTO;
import kosta.ridonbox.model.dto.EventDTO;
import kosta.ridonbox.model.dto.MovieDTO;
import kosta.ridonbox.model.dto.ScreenDTO;
import kosta.ridonbox.util.DbUtil;

public class AdminDAOImpl implements AdminDAO {

	@Override
	public int branchInsert(ScreenDTO screenDTO) throws SQLException {

		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("insert into screen_info values(?,?,?,?,?)");
			ps.setString(1, screenDTO.getScreen_num());
			ps.setString(3, screenDTO.getMovie_num());
			ps.setString(3, screenDTO.getTheater_name());
			ps.setString(4, screenDTO.getScreen_date());
			ps.setInt(5, screenDTO.getRev_total());
			result = ps.executeUpdate();

		} finally {
			DbUtil.dbClose(con, ps);
		}

		return result;
	}

	@Override
	public int eventInsert(EventDTO eventDTO) throws SQLException {

		Connection con = null;
		PreparedStatement ps = null;
		String sql = "insert into event values(?,?,?,?,?)";
		int result = 0;

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setInt(1, eventDTO.getEventNo());
			ps.setString(2, eventDTO.getEventTitle());
			ps.setString(3, eventDTO.getContext());
			ps.setString(4, eventDTO.getDate());
			ps.setString(5, eventDTO.getImgsrc());

			result = ps.executeUpdate();
		} finally {
			DbUtil.dbClose(con, ps);
		}
		return result;
	}

	@Override
	public BranchDTO branchUpdate(int branchNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int eventUpdate(EventDTO eventDTO) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "update EVENT set  event_Title=?, event_conts=?, event_date=?, event_path=? where event_num=? ";
		int result = 0;

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1, eventDTO.getEventTitle());
			ps.setString(2, eventDTO.getContext());
			ps.setString(3, eventDTO.getDate());
			ps.setString(4, eventDTO.getImgsrc());
			ps.setInt(5, eventDTO.getEventNo());

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.dbClose(con, ps);
		}
		return result;
	}

	@Override
	public int eventDelete(int eventNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("delete event where event_num=?");

			ps.setInt(1, eventNo);

			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.dbClose(con, ps);
		}
		return result;
	}

	@Override
	public int movieInsert(MovieDTO movieDTO) throws SQLException {

		return 0;
	}

	@Override
	public int movieUpdate(MovieDTO movieNo) throws SQLException {

		return 0;
	}

}
