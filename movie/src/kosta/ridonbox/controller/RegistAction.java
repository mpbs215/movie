package kosta.ridonbox.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.ridonbox.model.dto.ModelAndView;

/**
 * ȸ�����Խ� ����ϴ� Action
 * ��û��: ȸ����������
 * ���䰪: X
 */
public class RegistAction implements Action {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ModelAndView mv = new ModelAndView();

		return mv;
	}

}