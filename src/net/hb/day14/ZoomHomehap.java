package net.hb.day14;

public class ZoomHomehap {

	public static void main(String[] args) {
		int hap = 0;
		int kor = 90;
		int eng = 85;
		double avg=0.0;
		String info="안내", msg="안내", result="안내";
		
		hap = kor + eng;
		System.out.println("총점= " + hap);
		avg = hap / 2;
		System.out.println("평균= " + avg);
		
		if(avg>=70) {
			System.out.println("축합격");
			}
		else{System.out.println("재시험");}
		

	}

}
