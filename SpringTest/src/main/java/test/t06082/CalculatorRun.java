package test.t06082;

import java.util.Scanner;

public class CalculatorRun {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		CalculatorVO vo = new CalculatorVO();
		
		System.out.print("첫번쨰 수 : ");
		vo.setSu1(sc.nextInt());
		System.out.print("두번쨰 수 : ");
		vo.setSu2(sc.nextInt());
		
		CalculatorService service = new CalculatorService();
		
		service.add(vo.getSu1(), vo.getSu2());
		service.sub(vo.getSu1(), vo.getSu2());
		service.mul(vo.getSu1(), vo.getSu2());
		service.div(vo.getSu1(), vo.getSu2());
		
		sc.close();
	}
}
