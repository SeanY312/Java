class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  double approxPI(int N){
    double result = 0;
    for(int x = 0; x < N; x++){
      double t = 1.0/(1 + (x * 2));
      System.out.println("t is " + t);
      result += t;
      System.out.println("Result is " + result);
    }
  return 4 * result;
  }
  void init(){
    approxPI(5);
  }

  
  
  
}