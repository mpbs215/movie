package kosta.ridonbox.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.ridonbox.model.dto.ModelAndView;
import kosta.ridonbox.model.dto.MovieScreenDTO;
import kosta.ridonbox.model.service.AdminService;
import kosta.ridonbox.model.service.AdminServiceImpl;

public class AdminRegistAction implements Action {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ModelAndView mv = new ModelAndView();
		AdminService service = new AdminServiceImpl();
		try {
			List<MovieScreenDTO> list=service.movieList();
			request.setAttribute("list", list);
		} catch (SQLException e) {
			mv.setPath("web/error.jsp");
			request.setAttribute("errorMsg", e.getMessage());
		}
		mv.setPath("web/adminRegist.jsp");
		return mv;
	}

}