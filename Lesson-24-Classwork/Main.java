class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    
    toUpper("RFYGYTjjhjjkndsfghi");
    genPswd(8);
  }



   
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
  String toUpper(String words){
    String bld = "";
    for(int x = 0; x < words.length(); x++){
      int c = (int)(words.charAt(x));
      if(c > 96)
        bld += (char)(c-32);
      else
        bld += (char)(c);
    }
    print("Start here " + bld);
    return bld;
  }

  String genPswd(int length){
    String bld = "";
    for(int x = 0; x <= length; x ++){
      bld += (char)(randInt(48,122));
    }
    print(bld);
    return bld;
  }

 
}