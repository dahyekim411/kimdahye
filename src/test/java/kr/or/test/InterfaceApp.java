package kr.or.test;

public class InterfaceApp {

	public static void main(String[] args) {
		//자바프로그램은 항상 main() 진입점에서 실행하시는 겁니다. 단 웹프로그램은 해당안됨.
		AllCalc allCalc = new AllCalc();
		allCalc.add(5, 5);
		allCalc.sub(5, 5);
		allCalc.mul(5, 5);
		allCalc.div(5, 5);
	}

}

//인터페이스 실습(아래)
interface CalcAddSub {
	void add(double dx, double dy);
	void sub(double dx, double dy);
}
interface CalcMulDiv extends CalcAddSub {
	void mul(double dx, double dy);
	void div(double dx, double dy);
}
class AllCalc implements CalcAddSub, CalcMulDiv {

	@Override
	public void mul(double dx, double dy) {
		// TODO Auto-generated method stub
		System.out.println("곱하기 결과는" + dx*dy);
	}

	@Override
	public void div(double dx, double dy) {
		// TODO Auto-generated method stub
		System.out.println("나누기 결과는" + dx/dy);
	}

	@Override
	public void add(double dx, double dy) {
		// TODO Auto-generated method stub
		System.out.println("더하기 결과는" + (dx+dy) );
	}

	@Override
	public void sub(double dx, double dy) {
		// TODO Auto-generated method stub
		System.out.println("빼기결과는" + (dx-dy) );
	}//임플리먼트:구현하다 의미 뒤에있는 클래스명세포기준 구현한다.
	
}