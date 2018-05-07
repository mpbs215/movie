package kosta.ridonbox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.ridonbox.model.dto.ModelAndView;

/**
 * 메인 영화정보 페이지 이동시 사용하는 Action
 * 요청값 X
 * 응답값: 현재영화정보
 */
public class InfoAction implements Action {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ModelAndView mv = new ModelAndView();

		return mv;
	}

}
