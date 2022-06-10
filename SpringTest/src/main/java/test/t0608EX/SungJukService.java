package test.t0608EX;

public class SungJukService {
	public void tot(int kor, int eng, int mat) {
		System.out.println("총점 : " + (kor + eng + mat));
	}

	public void avg(int kor, int eng, int mat) {
		System.out.println("평균 : " + ((kor + eng + mat) / 3));
	}

	public void jumsu(String name, int kor, int eng, int mat, String soon) {
		int tot = kor + eng + mat;
		int avg = tot / 3;
		String grd = "";
		if (avg >= 90) {
			grd = "A";
		} else if (avg >= 80) {
			grd = "B";
		} else if (avg >= 70) {
			grd = "C";
		} else if (avg >= 60) {
			grd = "D";
		} else {
			grd = "F";
		}

		System.out.println( name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + tot + "\t" + avg + "\t" + grd + "\t" + soon);
	}
}
