package test.t06081;

public class CalculatorRun {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.setSu1(100);
		calculator.setSu2(200);
		
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}
