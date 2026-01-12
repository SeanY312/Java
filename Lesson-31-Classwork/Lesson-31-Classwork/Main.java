class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Animal hippo = new Animal("Hippo", 1000, 72);
    Animal lion = new Animal("Lion", 400, 60);
    System.out.println(hippo.isHealthy());
    System.out.println(lion.isHealthy());
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}