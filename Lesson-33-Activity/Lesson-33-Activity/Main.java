class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    CartItem bread = new CartItem("Bread", 4.50, 3, false);
    CartItem milk = new CartItem("Milk", 3.99, 2, true);
    CartItem banana = new CartItem("Banana", 0.50, 8, true);
    // System.out.println("Name: " + bread.itemName + " Price: " + bread.getPrice());
    System.out.println("Name: " + milk.itemName + " Price: " + milk.getPrice());
    System.out.println("Name: " + banana.itemName + " Price: " + banana.getPrice());
    double subT = bread.getPrice() + milk.getPrice() + banana.getPrice();
    System.out.println("Subtotal: " + subT + " Tax: " + (subT * 0.08675) + " Total: " + (1.08675 * subT));
    
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}