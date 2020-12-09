package kr.or.test;

import java.util.Calendar;

/**
 * 외부 enum클래스를 이용해서 열거형 자료형 테스트
 * @author 김다혜
 *
 */
public class Step3 {

	public static void main(String[] args) {
		//메인 메서드-스레드시작.
		Week today = null;//Week자료형용 today변수생성/선언
		//String today2 = null;//String자료형용 today2변수생성
		//MemberVO memberVO = new MemberVO();
		//MemberVO 자료형용 memberVO객체변수/오브젝트선언
		//현재 날짜가 무슨요일인지 한글로 확인하는 프로그램
		Calendar calendar = Calendar.getInstance();//오브젝트선언 calendar객체변수=인스턴스변수
		//calendar오브젝트에서 현재 요일을 반환받기(1~7까지반환)
		int intWeek = calendar.get(Calendar.DAY_OF_WEEK);
		switch(intWeek) {
		case 1:
			today = Week.월; break;//브레이크는 case문장을 빠져나가는 명령
		case 2:
			today = Week.화; break;//Week자료형에 바로접근하는 방법 Week.
		case 3:
			today = Week.수; break;
		case 4:
			today = Week.목; break;
		case 5:
			today = Week.금; break;
		case 6:
			today = Week.토; break;
		case 7:
			today = Week.일; break;
		}

		System.out.println("오늘 요일은: " + today + "요일입니다.");
	}

}
