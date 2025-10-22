class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  boolean collegeCredit(String course){
    if(course.charAt(6) == 'E' || course.charAt(6) == 'M')
      return true;
    else
      return false;
  }
  void init(){
   System.out.println(collegeCredit("EEEEEE"));
   System.out.println(collegeCredit("MMMMMMMM"));
   System.out.println(collegeCredit("UYGYGYGVYGV"));


    
  }

 
}