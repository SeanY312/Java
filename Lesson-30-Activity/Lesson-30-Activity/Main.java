class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    Car jeep = new Car("Jeep", "Red", "Grand Cherokee", 2009, 3400.50);
    jeep.honk();
    Car humvee = new Car("Military", "Camouflage", "Humvee", 2025, 100000.48);
    humvee.honk();
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
  class Car{
    String brand;
    String color;
    String model;
    int year;
    double value;
    Car(String brand, String color, String model, int year, double value){
      this.brand = brand;
      this.color = color;
      this.model = model;
      this.year = year;
      this.value = value;
    }
    void honk(){
      System.out.println("The car is a " + color + " " + brand + " " + year + " " + model);
      if(value > 10000){
        System.out.print(" worth $" + value);
      }
    }
  }


}