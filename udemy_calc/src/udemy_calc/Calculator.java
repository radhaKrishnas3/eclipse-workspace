package udemy_calc;

public class Calculator {
	/**
	 * className = TheDarkNight
	 * methodName - theDarkNight
	 * @param args
	 */
	public void add() {
		System.out.println("adding some numbers");
	}
	
	public void subtract() {
		System.out.println("subtarct some numbers");
	}
	
	public void multiply() {
		System.out.println("multiply some numbers");
	}
	
	public void divide() {
		System.out.println("divide some numbers");
	}
	
	public Calculator() {
		System.out.println("calling constructor");
	}
	
	public static void main(String[] args) {
		
//		String val = "Hello";
//		
//		
//		new Calculator();
//		new Calculator().add();
//		new Calculator().subtract();
		
		Calculator calc = new Calculator();
		calc.add();
		calc.subtract();
		calc.multiply();
		calc.divide();
		
		
		
		
		
	}

}
