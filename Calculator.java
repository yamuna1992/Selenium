package Week3.Day1;

public class Calculator {

	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}

	public void multiply(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	public void multiply(int num1, double num2) {
		System.out.println(num1 * num2);

	}
	
	public void subtract(int num1, int num2) {
		System.out.println(num1 - num2);

	}
	
	public void subtract(double num1, double num2) {
		System.out.println(num1 - num2);
	}
	
	public void divide(int num1, int num2) {
		System.out.println(num1 / num2);

	}
	
	public void divide(double num1, int num2) {
		System.out.println(num1 / num2);

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(3, 3);
		calc.add(3, 3, 3);
		calc.subtract(6, 3);
		calc.subtract(689.76, 6);
		calc.divide(9, 3);
		calc.divide(563829.45, 3);
		calc.multiply(3, 3);
		calc.multiply(5, 892.34);
		

	}

}
