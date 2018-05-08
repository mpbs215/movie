package kosta.ridonbox.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.ridonbox.model.dao.AdminDAOImpl;
import kosta.ridonbox.model.dto.ModelAndView;
<<<<<<< HEAD
import kosta.ridonbox.model.service.AdminService;
import kosta.ridonbox.model.service.AdminServiceImpl;
=======
import kosta.ridonbox.model.dto.MovieDTO;
import kosta.ridonbox.model.service.UserService;
import kosta.ridonbox.model.service.UserServiceImpl;
>>>>>>> branch 'master' of https://github.com/mpbs215/movie

/**
 * 메인 index페이지 이동시 사용하는 Action
 * 요청값 X
 * 응답값: 현재영화정보
 */
public class MainAction implements Action {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UserService service = new UserServiceImpl();
		ModelAndView mv = new ModelAndView();
<<<<<<< HEAD
		mv.setPath("web/index.jsp");
=======
		try {
			List<MovieDTO> movielist =service.showByBoxoffice();
			request.setAttribute("movielist", movielist);
			mv.setPath("web/index.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}
>>>>>>> branch 'master' of https://github.com/mpbs215/movie
		
		return mv;
	}

}
