package kr.or.member;

import kr.or.member.MemberVO;

public class MemberService {
	public void printMember(MemberVO[] members) {
		//서비스 구현메서드 내용(아레) 향상된 for반복문 사용
		int cnt=0;
		for(MemberVO member:members) {//members여러 레코드중 1개의 레코드를 member오브젝트객체로 대입
			//여기서 member[0]=MemberVO member -> members[1]=MemberVO member -> members[2]
			//MemberVO클래스형데이터타입을 member
			cnt = cnt + 1;
			System.out.println(cnt + "번째 레코드는" + member.toString());
		}
		//비지니스 로직에서 처리하는 내용은=데이터를 가공한다.(아래)
		//위처럼 데이터 select해서 가져오기, insert입력하기, update수정하기
		//delete삭제하기 => CRUD를 구현하는 내용
	}
}

