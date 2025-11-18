class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    allowance();
    addTwoNumbers();
    GCF(25, 100);
    menu();
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
  void allowance(){
    double sum = 0.01;
    int x;
    for (x = 0; sum <= 5; x ++)
      sum = Math.pow(2,x) * 0.01;
    print(x + " days makes " + sum + " dollars");
  }
  void addTwoNumbers(){
    int int1 = randInt(0,100);
    int int2 = randInt(0,100);
    int sum = int1 + int2;
    System.out.println("What is the sum of " + int1 + " and " + int2 + "?");
    double realSum = Input.readDouble();
    boolean canGuess = true;
    while(canGuess == true){
      if (sum == realSum){
        System.out.println("Correct!");
        canGuess = false;}
      else{
        System.out.println("Incorrect. Try again.");
        realSum = Input.readDouble();
      }
    }
  }
  double GCF(int number1, int number2){
    int gcf = 1;
    for(int x = 1; x <= number1; x++){
      if(number1 % x ==0 && number2 % x == 0){
        gcf = x;
      }
    }
    System.out.println("GCF is " + gcf);
    return gcf;
  }
  void menu(){
    System.out.println("Welcome to the party!");
    System.out.println("What would you like to do?");
    System.out.println("1 - Allowance");
    System.out.println("2 - Addition game");
    System.out.println("3 - Calculate GCF");
    System.out.println("4 - Exit party");
    int choice = Input.readInt();
    if(choice == 1)
      allowance();
    else if(choice == 2)
      addTwoNumbers();
    else if(choice == 3){
      System.out.println("What is the first number you want to use?");
      int firstN = Input.readInt();
      System.out.println("What is the second number you want to use?");
      int secondN = Input.readInt();
      GCF(firstN, secondN);}
    else{}
  }
  void rps(){
    System.out.println("Which do you choose?");
    System.out.println("1 - Rock");
    System.out.println("2 - Paper");
    System.out.println("3 - Scissors");
    int choice2 = Input.readInt();
    int computer = randInt(1,3);
    if(choice 2 == 1 && computer == 1){
      System.out.println("You chose rock and the computer chose rock so you draw");
    }else if(choice 2 == 1 && computer == 2){
      System.out.println("You chose rock and the computer chose paper so you lose");
    }else if(choice 2 == 1 && computer == 3){
      System.out.println("You chose rock and the computer chose scissors so you win");
    }else if(choice 2 == 2 && computer == 1){
      System.out.println("You chose paper and the computer chose rock so you win");
    }else if(choice 2 == 2 && computer == 2){
      System.out.println("You chose paper and the computer chose paper so you draw");
    }else if(choice 2 == 2 && computer == 3){
      System.out.println("You chose paper and the computer chose scissors so you lose");
    }else if(choice 2 == 3 && computer == 1){
      System.out.println("You chose scissors and the computer chose rock so you lose");
    }else if(choice 2 == 3 && computer == 2){
      System.out.println("You chose scissors and the computer chose paper so you win");
    }else if(choice 2 == 3 && computer == 3){
      System.out.println("You chose scissors and the computer chose scissors so you draw");
  }
  }
}