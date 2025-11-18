class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   String [] friends = {"Nick", "Ed", "Tank", "Tom", "Tak"};
   int[] b = {32, 40, 60, 80};
   convert(b);
    
  }

  

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
  int[] convert(int[] c){
    int[] f = new int[c.length];
    for(int x = 0; x < c.length; x++){
      f[x] = (int)celsiusToFarhenheit(c[x]);
    }
    for(int x = 0; x < f.length; x++){
      print(f[x]);
    }
    return f;
  }
}