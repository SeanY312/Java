class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  void spaces(int N){
    for (int x=0; x <= N; x++){
      System.out.print(" ");
    }
    System.out.print("DONE");
  }
  double harmonic(int N){
      double sum = 0;
    for(int x=1; x <= N; x++){
      sum += 1.0 / x;
      System.out.println("Sum is " + sum);
    }
    return sum;
  }
  double fib(int N){
    int res = 1;
    int prevRes = 1;
    int res2 = 0;
    System.out.print("0, 1, ");
    for(int x=1; x <= N; x++){
      System.out.println("prevRes " + prevRes + "res " + res + " " + prevRes + "+ " + res + "= " + (res + prevRes) + "  " + prevRes + " + " + res2 + "=" + (prevRes + res2));
      System.out.print(res + ", ");
      res += prevRes;
      prevRes += res2;
      res2 = prevRes;
    }
    return res;
  }

  void init(){
    spaces(20);
    harmonic(8);
    fib(6);

    
    
  }


  
}