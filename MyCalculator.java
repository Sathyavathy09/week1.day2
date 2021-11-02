package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
	
		Calculator calc = new Calculator();
		System.out.println("Addition: " +calc.add(25, 35, 60));
		System.out.println("Sybtraction: " +calc.sub(80, 20));
		System.out.println("Multiplication: " +calc.mul(625, 40));
		System.out.println("Division: " +calc.divide(25, 5));

	}

}
