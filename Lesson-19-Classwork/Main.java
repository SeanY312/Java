class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  int addNums(){
    int num1 = (int)(Math.random() * 55);
    int num2 = (int)(Math.random() * 55)-5;
    int sum = num1 + num2;
    print(sum);
    return sum;
  }
  String generatePin(){
    String bld = "";
    bld += (int)(Math.random()*10);
    bld += (int)(Math.random()*10);
    bld += (int)(Math.random()*10);
    bld += (int)(Math.random()*10);
    print(bld);
    return bld;
  }
  void init(){
    addNums();
    generatePin();
    

   
  }

  
}