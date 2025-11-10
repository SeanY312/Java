class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  String rollDice(){
    String bld = "";
    int dice1 = (int)(Math.random()*6+1);
    int dice2 = (int)(Math.random()*6+1);
    bld += dice1 + " " + dice2;
    print(bld);
    return bld;
  }
  String lotto(){
    int num1 = (int)(Math.random()*47+1);
    int num2 = (int)(Math.random()*47+1);
    int num3 = (int)(Math.random()*47+1);
    int num4 = (int)(Math.random()*47+1);
    int num5 = (int)(Math.random()*48+1);
    String bld = "";
    bld += num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5;
    print(bld);
    return bld;
  }
  String additionTutor(){
    int num1 = (int)(Math.random()*101);
    int num2 = (int)(Math.random()*101);
    String realsum = "";
    realsum += num1 + num2;
    System.out.println("What is the sum of " + num1 + " and " + num2 + "?");
    String sum = Input.readString();
    if(realsum.equals(sum)){
      print("Correct");
      return "Correct!";
    }else{
      print("Incorrect");
      return "Incorrect";
    }
  }
  String mathQuiz(){
    int int1 = (int)(Math.random()*201-100);
    int int2 = (int)(Math.random()*201-100);
    int operator = (int)(Math.random()*4);
    int res;
    print("Operator: " + operator);
    if(operator == 0){
      System.out.println("What is the sum of " + int1 + " and " + int2 + "?");
      res = int1 + int2;
    }else if(operator == 1){
      System.out.println("What is the difference of" + int1 + " and " + int2 + "?");
      res = int1 - int2;
    }else if(operator == 2){
      System.out.println("What is the product of " + int1 + " and " + int2 + "?");
      res = int1 * int2;
    }else if(operator == 3){
      System.out.println("What is the quotient of " + int1 + " and " + int2 + "?");
      res = int1 / int2;
    }else{
      res = 0;}
    int res1 = Input.readInt();
    if(res == res1)
      return "Correct!";
    else
      return "Incorrect.";
    
  }
  void init(){
    rollDice();
    lotto();
    additionTutor();
    mathQuiz();
  }




}