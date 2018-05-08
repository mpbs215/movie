package kosta.ridonbox.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.ridonbox.model.dto.MemberDTO;
import kosta.ridonbox.model.dto.ModelAndView;
import kosta.ridonbox.model.service.UserService;
import kosta.ridonbox.model.service.UserServiceImpl;


/**
 * 회원가입시 사용하는 Action
 * 요청값: 회원가입정보
 * 응답값: X
 */
public class RegistAction implements Action {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserService userService = new UserServiceImpl();
		ModelAndView mv = new ModelAndView();
		MemberDTO memberDTO = null;
		int re = 0;
		
		String userName = request.getParameter("Username");
		String passWord = request.getParameter("Password");
		String passWord2 = request.getParameter("Password2");
		String email = request.getParameter("Email");
		String phone = request.getParameter("Phone");
		if( passWord.equals(passWord2) ) {
			String memberPwd = passWord;
			Date date = new Date();
			String joinDate = date.toLocaleString();
			memberDTO = new MemberDTO(userName, memberPwd, email, phone, joinDate);
			
		} else {
			System.out.println("비밀번호확인해주세요");
			mv.setPath("web/index.jsp");
			return mv;
		}
		
		try {
			re = userService.joinMember(memberDTO);
			if(re==0) {
				System.out.println("회원가입오류");
			} else {
				System.out.println("회원가입을 축하합니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setPath("web/index.jsp");
		return mv;
	}

}
