package net.hb.day14;

public class Testdouble {

	public static void main(String[] args) {
		//실수=소숫점이있는경우,자바에서 실수타입은 double권장=8Byte
		//실수=소숫점이있는경우,자바에서 실수타입은 float권장=4Byte
		double piA=3.141592;
		double rateA=1023.75; //환율
		System.out.println(piA);
		System.out.println(rateA);
		System.out.println();
		
		float piB=3.141592F;
		float rateB=1023.75234545F; //환율
		System.out.println(piB);
		System.out.println(rateB);
		
		System.out.println();
		System.out.println("우리나라");
		System.out.println("금수강산");
		System.out.println("화려강산");
	}

}
