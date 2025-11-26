class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // Challenge1: Read in the file Original.txt and store it in a variable
   String article = Input.readFile("Original.txt");

    encode("The British are coming!");
    decode("Wkh#Eulwlvk#duh#frplqj$");
  }

   // Challenge2: 
  //  Write the function encode that takes in a string
  //  and create a new string that using a caesar cipher 
  // by shifting all ascii values by 3.  Don't worry about
  // wrapping arount the alphabet.
  String encode(String msg){
    String bld = "";
    int c = 0;
    for(int x = 0; x < msg.length(); x++){
      c = (int)(msg.charAt(x) + 3);
      bld += (char)(c);
    }
    print(bld);
    return bld;
  }

  // Challenge3: 
  //  Write the function decode that takes in a string
  //  and reverses what the function in chanllenge 2
  //  so that you get the original message.
  String decode(String msg){
    String bld = "";
    int c = 0;
    for(int x = 0; x < msg.length(); x++){
      c = (int)(msg.charAt(x) - 3);
      bld += (char)(c);
    }
    print(bld);
    return bld;
  }
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}