package org.edu.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.edu.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//스프링에서 사용가능한 클래스를 빈(커피Bean)이라고 하고, @Contorller 클래스를 사용하면 됨.
@Controller
public class AdminController {
	
	@RequestMapping(value="/admin/board/board_list",method=RequestMethod.GET)
	public String board_list() {
		return "admin/board/board_list";
		
	}
	
	//메서드 오버로딩(예/ 동여상로딩중...,로딩된매개변수가 다르면, 메서드이름을 중복가능합니다.)
	@RequestMapping(value="/admin/member/member_write",method=RequestMethod.POST)
	public String member_write(@RequestParam("user_name") String user_name) {
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
	public String member_list(Model model) {
		String[][] members = {
				{"admin","찐관리자","admin@abc.com","true","2020-12-04","ROLE_ADMIN"},
				{"user","일반사용자","user@abc.com","false","2020-12-04","ROLE_USER"}
		};
		//{"user_id":"admin","user_name":"관리자",...} 해시#데이터타입<키, 값(Value)>(그물-낚시)
		//Map타입이 부모, HashMap타입이 자식클래스, 관례적으로 사용, paramMap오브젝트의 확장하기 편하도록 하기위해서 상속
		//Map타입을  상속받아서, HashMap타입의 오브젝트를 생성하는 방식.
		Map<String, Integer> mapTest = new HashMap<String, Integer>();
		String ageValue = "40";
		int ageValue2 = 40;
		mapTest.put("ageValue2", ageValue2);
		mapTest.put("age", Integer.parseInt(ageValue));//제네릭타입을 사용하면, 여기처럼 parseInt형변환
		//제네릭타입의 근본목적은 데이터타입에대해서 명시적인 코딩을 해서 코드를 단순화시키기 위해서 사용.
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("user_id", "admin");
		paramMap.put("user_name", "관리자");
		paramMap.put("age", 40);
		System.out.println("해시데이터타입 출력" + paramMap);
		
		//members 2차원배열 변수를 MemberVO 클래스형 오브젝트로 members_array 변경(아래)
		MemberVO members_input = new MemberVO();
		members_input.setUser_id("admin");
		members_input.setUser_name("찐찐관리자");
		members_input.setEmail("admin@abc.com");
		members_input.setEnabled(true);//enabled 데이터형(타입)이 boolean형이기 때문에 true,false
		Date toDay = new Date();//자바의 Date클래스를 이용해서 현재 날짜(시간)을 가진 toDay변수를 생성.
		members_input.setReg_date(toDay);//reg_date 데이터타입이 Date형이기 때문에 java의 날짜데이터를 입력
		members_input.setLevels("ROLE_ADMIN");
		members_input.setPoint(10);//point는 데이터타입이Integer형이기 때문에 숫자를 입력.
		//위  members_input 오브젝트에는 1개의 라인만 입력되어있어서, 이오브젝트를 배열오브젝트에 저장(아래)
		MemberVO[] members_array = new MemberVO[2];
		members_array[0] = members_input;
		members_array[1] = members_input;		
		//-----------------------------------------------------------
		//실제 코딩에서는 배열타입으로 보내지 않고, List타입(목록)으로 model이용해서 jsp로 보냅니다.
		List members_list =  Arrays.asList(members_array);
		List m_list = null;
		//위에서만든 members_array클래스 오브젝트로 변경
		//위에서 데이터타입연습으로 총 3가지 테이터 타입을 확인했음.
		System.out.println("List타입의 오브젝트 클래스내용을 출력" + members_list.toString());
		model.addAttribute("members", members_list);//members2차원배열을 members_array클래스오브젝트로 변경
		return "admin/member/member_list";//member_list.jsp로 members변수명으로 데이터를 전달.
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String admin() {
		return "admin/home";		
	}

}
