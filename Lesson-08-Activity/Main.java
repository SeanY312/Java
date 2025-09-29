class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}
 String print(String message){
	System.out.println(message);
	return message;
  }
 double FtoC(double f){
	double c = (f - 32) * 5/9;
	System.out.println("The temperature is " + c + " degrees Celsius");
	return c;
 }
 double sphereVolume(double r){
	double v = 4.0 / 3 * 3.14159265359 * Math.pow(r, 3);
	System.out.println("The volume is " + v);
	return v;
 }
 double coneVolume(double radius, double h){
	double v2 = 3.14159265359 * Math.pow(radius, 2) * h / 3.0;
	System.out.println("The volume is " + v2);
	return v2;
 }
 double distance(double x1, double x2, double y1, double y2){
	double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	System.out.println("The distance is " + d);
	return d;
 }
  void init(){
	System.out.println("Enter in your message");
	String message = Input.readString();
  	print(message);
    System.out.println("Enter a temperature in Fahrenheit");
	double f = Input.readDouble();
  	FtoC(f);
	System.out.println("Enter in the radius");
	double r = Input.readDouble();
  	sphereVolume(r);
	System.out.println("Enter in radius");
	double radius = Input.readDouble();
	System.out.println("Enter in height");
	double h = Input.readDouble();
	coneVolume(radius, h);
	System.out.println("Enter in x1");
	double x1 = Input.readDouble();
	System.out.println("Enter in x2");
	double x2 = Input.readDouble();
	System.out.println("Enter in y1");
	double y1 = Input.readDouble();
	System.out.println("Enter in y2");
	double y2 = Input.readDouble();
	distance(x1, x2, y1, y2);
  }
 
}