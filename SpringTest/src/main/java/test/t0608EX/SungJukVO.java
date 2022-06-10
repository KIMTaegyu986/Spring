package test.t0608EX;
public class SungJukVO {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private SungJukService SungJukService = new SungJukService();
	private int tot;
	private String soon;
	public String getSoon() {
		return soon;
	}

	public void setSoon(String soon) {
		this.soon = soon;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public void setSungJukService(SungJukService sungJuckService) {
		this.SungJukService = sungJuckService;
	}

	public void jumsu() {
		SungJukService.jumsu(name, kor, eng, mat, soon);
	}

}
