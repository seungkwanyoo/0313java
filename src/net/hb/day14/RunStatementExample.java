package net.hb.day14;

public class RunStatementExample { //42페이지

	public static void main(String[] args) {
		//1바이트Byte=8bit 4*8=32bit형
		//변수이름 소문자시작 _ 혹은 숫자
		//기본타입 = primitive타입 double,byte,char,short,int,long,float,boolean
		//접근지정 private, protected자식까지가능, public
		//50페이지 예외처리 try{실행중에러및문법에러}catch(Exception ex){해결}
		
		//int score = 90; //선언및값대입=초기화
		
		int x = 1; //지역변수 x int
		int y = 2; //지역변수 y int
		int result = x + y; //지역변수 result int정수형 나이,점수,번호
		System.out.println("합계=" + result);

	}

}//class END
