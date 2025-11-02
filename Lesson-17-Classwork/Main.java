class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    swapLetter("the seen", "e", "%");
    swapLetter("computer coding", "c", "2");
    encryption2("abcdefghi");
  }
  String swapLetter(String modify, String find, String replace){
    String bld = "";
    for(int x=0; x <= modify.length()-1;x++){
      if(modify.substring(x,x+1).equals(find))
        bld += replace;
      else
        bld += modify.substring(x,x+1);
    }
    print(bld);
    return bld;
    }
  String encryption2(String msg){
    String bld = "";
    String h1 = msg.substring(0, msg.length()/2);
    String h2 = msg.substring(msg.length()/2, msg.length());
    for(int x=0;x <= msg.length()/2-1; x ++){
     bld += h1.substring(x, x+1) + h2.substring(x, x+1);
    }
    print(bld);
    print(h1 + " " + h2);
    return bld;
  }
  

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }


}