class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    double[] prices = {14.50, 20, 30, 40};
    total(prices);
    int[] lotto = {20, 30, 40, 80, 15};
    isin(lotto, 20);
    isin(lotto, 9);
    int[] picks = {40, 90, 93, 5, 28};
    checkLotto(picks, lotto);
    int[] nums = {100, 20, 30, 40, 50};
    biggest(nums);

  }



  // Use these functions below for the activity

  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }

  double total(double[] price){
    double sum = 0;
    for(int x =0; x <price.length; x++)
      sum += price[x] * 1.08525;
  print("Sum is " + sum);
  return sum;
  }
  boolean isin(int[] array, int num){
    int there = 0;
    for(int x=0; x <array.length; x++){
      if(array[x]==num)
        there = 1;
    }
    if(there==1){
      print("It's there");
      return true;
    }else{
      print("It's not there");
      return false;}
  }
  int checkLotto(int[] picks, int[] drawn){
    int right = 0;
    for(int x = 0; x<drawn.length; x++){
      if(isin(drawn, picks[x])==true)
        right++;
    }
    print("You got " + right + " numbers right!");
    return right;
  }
  double biggest(int[] array){
    int greatest = 0;
    for(int x = 0; x<array.length; x++){
      if(array[x]>greatest)
        greatest = array[x];
    }
    print("Greatest is " + greatest);
    return greatest;
  }
}