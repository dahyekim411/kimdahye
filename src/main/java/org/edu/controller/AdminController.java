package org.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	
	@RequestMapping(value="/admin/board/board_list",method=RequestMethod.GET)
	public String board_list() {
		return "admin/board/board_list";
		
	}
	
	@RequestMapping(value="/admin/member/member_write",method=RequestMethod.POST)
	public String member_write_do() {
		//아래 GET방식의 폼 출력화면에서 데이터 전송받은 내용을 처리하는 바인딩.
		//DB 입력/출력/삭제/수정 처리-다음에...
		return "redirect:/admin/member/member_list";
	}
	
	@RequestMapping(value="/admin/member/member_write",method=RequestMethod.GET)
	public String member_write() {
		return "admin/member/member_write";
	}
	
	//member_list.jsp에서 데이터를 수신하는 역할 @RequestParam("키값") 리퀘스트파라미터 클래스 사용
	//현재컨트롤러 클래스에서 jsp로 데이터를 보내는 역할 Model 클래스 사용.
	//member_list ->@RequestParam("user_id"), Model송신 -> member_view.jsp
	@RequestMapping(value="/admin/member/member_view",method=RequestMethod.GET)
	public String member_view(@RequestParam("user_id") String user_id, Model model) {
		//위에서 수신한 user_id를 member_view.jsp로 보냅니다.(아래)
		//멤버리스트클릭이 "1명멤버내용주세요"요청해서 그 요청을 컨트롤러에서 수신.
		model.addAttribute("user_id2", user_id + " 님");
		return "admin/member/member_view";
	}
	
	@RequestMapping(value="/admin/member/member_list",method=RequestMethod.GET)
	public String member_list() {
		return "admin/member/member_list";
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String admin() {
		return "admin/home";		
	}

}
