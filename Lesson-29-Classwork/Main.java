class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Dog Toto = new Dog("German Shepard", 4, "Toto");
    Toto.bark(); 
    Dog Snoopy = new Dog("Beagle", 5, "Snoopy");
    Snoopy.bark(); 
    Dog Poophy = new Dog("Golden Retriever", 6, "Poophy");
    Poophy.bark(); 
    
   
    
  }
  class Dog{
    //Variables
    String breed;
    int age;
    String name;
    //Constructor
    Dog(String breed, int age, String name){
      this.breed = breed;
      this.age = age;
      this.name = name;
    }
    //Function
    void bark(){
      System.out.println("I am a " + breed + " who is " + age + " years old and my name is " + name);
    }
  }


  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}