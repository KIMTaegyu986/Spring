package test.t0608EX;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SungJukRun {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("xml/t0608_ExBeans.xml");

		String jumsu = "";

		System.out.println("성명\t국어\t영어\t수학\t총점\t평균\t학점\t순위");
		System.out.println("=================================================================");
		SungJukVO vo = (SungJukVO) ctx.getBean("vo");
		vo.setTot(vo.getKor() + vo.getEng() + vo.getMat());
		SungJukVO vo1 = (SungJukVO) ctx.getBean("vo1");
		vo1.setTot(vo1.getKor() + vo1.getEng() + vo1.getMat());
		SungJukVO vo2 = (SungJukVO) ctx.getBean("vo2");
		vo2.setTot(vo2.getKor() + vo2.getEng() + vo2.getMat());

		int[] cos = { vo.getTot(), vo1.getTot(), vo2.getTot() };

		for (int i = 0; i < cos.length; i++) {
			for (int j = 0; j < cos.length; j++) {
				int temp;
				if (cos[i] > cos[j]) {
					temp = cos[i];
					cos[i] = cos[j];
					cos[j] = temp;
				}
			}
		}
		for (int i = 0; i < cos.length; i++) {
			if (cos[i] == vo.getTot()) {
				vo.setSoon(i + 1 + "등");
			} else if (cos[i] == vo1.getTot()) {
				vo1.setSoon(i + 1 + "등");
			} else if (cos[i] == vo2.getTot()) {
				vo2.setSoon(i + 1 + "등");
			}
		}

		vo.jumsu();
		vo1.jumsu();
		vo2.jumsu();

	}
}
