public class BMICalculator { 
	
	double weight;
	double height;
	double BMI;
	
	public BMICalculator(double w, double h) {
		weight = w;
		height = h;
	}
	public double calculateBMI() {
		return weight / (height + height);
		
	}
	
	public static void main(String[] args) {
		BMICalculator calculator = new BMICalculator(60, 1.70);
		double x = calculator.calculateBMI();
		System.out.println("Your BMI is "+x);
	}
	
	
	
	
	
	}
