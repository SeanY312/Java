class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  double approxPI(int N){
    double result = 0;
    for(int x = 0; x < N; x++){
      double t = 1 + (x * 2);
      if(x%2 == 1){
        result -= (1 / t);
        System.out.println("t is " + t);
        System.out.println("Result is " + result);
      }else{
        result += (1 / t);
        System.out.println("t is " + t);
        System.out.println("Result is " + result);}
    }
  System.out.println("Pi is about " + (4 * result));
  return 4 * result;
  }
  void init(){
    approxPI(5);
  }

  
  
  
}