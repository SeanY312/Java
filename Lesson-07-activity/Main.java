
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
  double x, y;
  System.out.println("Enter x value");
  x = Input.readDouble();
  y = Math.pow(x, 7);
  System.out.println("Y is " + y);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
  double q, z;
  System.out.println("Enter z value");
  z = Input.readDouble();
  q = Math.pow(z, 3) + 5;
  System.out.println("Q is " + q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
double s,r,t;
System.out.println("Enter t");
t = Input.readDouble();
System.out.println("Enter r");
r = Input.readDouble();
s = Math.pow(t, 5) * Math.pow(r+2, 4);
System.out.println("S is " + s);

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
double C,B,A;
System.out.println("Enter B");
B = Input.readDouble();
System.out.println("Enter A");
A = Input.readDouble();
C = Math.sqrt(A+B);
System.out.println("C is " + C);


/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
double x2,x1,y2,y1,d;
System.out.println("Enter x2");
x2 = Input.readDouble();
System.out.println("Enter x1");
x1 = Input.readDouble();
System.out.println("Enter y2");
y2 = Input.readDouble();
System.out.println("Enter y1");
y1 = Input.readDouble();
d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
System.out.println("d is " + d);




/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
double g,deg;
System.out.println("Enter degree");
deg = Input.readDouble();
g = Math.sin(deg);
System.out.println("g is" + g);




/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/
double k,m,n;
System.out.println("Enter m");
m = Input.readDouble();
System.out.println("Enter n");
n = Input.readDouble();
k = Math.pow(m, 5) / Math.sqrt(n+1);
System.out.println("k is " + k);

/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/
double a,b,c,firstX,secondX;
System.out.println("Enter a");
a = Input.readDouble();
System.out.println("Enter b");
b = Input.readDouble();
System.out.println("Enter c");
c = Input.readDouble();
firstX = (b * -1 + Math.sqrt(Math.pow(b, 2) - 4 * a *c)) / (2 * a);
secondX = (b * -1 - Math.sqrt(Math.pow(b, 2) - 4 * a *c)) / (2 * a);
System.out.println("The answers are " + firstX + "and " + secondX);



    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}