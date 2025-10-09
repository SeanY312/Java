
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}
	double gpa(double GPA){
		if (GPA > 90)
			return GPA *1.1;
		else
		    return GPA;
	}
	boolean isGraduating(int grade, int credits){
		if (grade == 12 && credits >= 44)
			return true;
		else
			return false;
	}
	String BMI(double weight, double height){
		double bmi = weight * 703 / height / height;
		if (bmi <= 18.4)
			return "Underweight";
		else if(bmi > 18.4 && bmi <= 24.9)
			return "Normal";
		else if(bmi > 24.9 && bmi <= 39.9)
			return "Overweight";
		else
			return "Obese";
	}
	double shippingCost(double weight){
		if (weight <= 10)
			return 0;
		else if(weight > 10 && weight <= 15)
			return 5;
		else if(weight > 15 && weight <= 25)
			return 10;
		else
			return 10 + 0.02 * (weight - 25);
	}
	boolean blueOrViolet(double frequency){
		if (frequency >= 600 && frequency <= 670)
			return true;
		else if(frequency >= 700 && frequency <= 750)
			return true;
		else
			return false;
	}
	void init(){
		System.out.println(gpa(92));
		System.out.println(gpa(84));
		if (isGraduating(12, 60) == true)
			System.out.println("Student is Graduating");
		else 
			System.out.println("Student is NOT Graduating");
		if (isGraduating(11,60) == true)
			System.out.println("Student is Graduating");
		else 
			System.out.println("Student is NOT Graduating");
		if (isGraduating(12,30) == true)
			System.out.println("Student is Graduating");
		else 
			System.out.println("Student is NOT Graduating");
		System.out.println(BMI(90,72));
		System.out.println(BMI(100,60));
		System.out.println(BMI(200,60));
		System.out.println(BMI(400,5));
		System.out.println(shippingCost(0));
		System.out.println(shippingCost(12.5));
		System.out.println(shippingCost(20));
		System.out.println(shippingCost(30));
		System.out.println(blueOrViolet(610));
		System.out.println(blueOrViolet(710));
		System.out.println(blueOrViolet(810));
   

  }

 
  
}