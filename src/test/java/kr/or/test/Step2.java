package kr.or.test;
/**
 * 클래스자료형
 * @author 김다혜
 *
 */
class MemberVO {
	//멤버변수 만들기(아래)
	private String name;
	private int age;
	private String phoneNum;
	//멤버변수는 보안때문에 private로 만들었으나 get,set은 public으로 생성합니다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "디버그용 MemberVO [name=" + name + ", age=" + age + ", phoneNum=" + phoneNum + "]";
	}
	
}

class MemberService {//이 서비스 클래스에서는 회원출력에 관련된 메서드를 모아 놓습니다.(아래)
	public void printMember(MemberVO[] members) {
		//서비스 구현메서드 내용(아레) 향상된 for반복문 사용
		int cnt=0;
		for(MemberVO member:members) {//members여러 레코드중 1개의 레코드를 member오브젝트객체로 대입
			cnt = cnt + 1;
			System.out.println(cnt + "번째 레코드는" + member.toString());
		}
		
	}
}

public class Step2 {


	public static void main(String[] args) {
		// 실행메서드
		MemberVO memberVO = new MemberVO();
		memberVO.setName("홍길동");
		memberVO.setAge(45);
		memberVO.setPhoneNum("123-4567-8910");
		MemberVO memberVO2 = new MemberVO();
		memberVO2.setName("성춘향");
		memberVO2.setAge(18);
		memberVO2.setPhoneNum("111-2222-3333");
		MemberVO memberVO3 = new MemberVO();
		memberVO3.setName("각시탈");
		memberVO3.setAge(28);
		memberVO3.setPhoneNum("222-2222-2222");
		//위 각각 3개의 레코드를 1군데 담을 배열 클래스오브젝트를 하나 생성
		MemberVO[] members = new MemberVO[3];
		members[0] = memberVO;
		members[1] = memberVO2;
		members[2] = memberVO3;
		//전에 사용했던 출력보다는 개선된 방식으로 출력(아래) MemberService 서비스전용 클래스
		MemberService memberService = new MemberService();//자바 오브젝트객체 생성하는방법
		memberService.printMember(members);//서비스클래스의 메서드호출
	}

}
