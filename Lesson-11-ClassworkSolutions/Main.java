class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    System.out.println(getUsername("joe123@aol.com"));
    
    System.out.println(splitReverse("Happy Days"));
    System.out.println(splitReverse("apple"));

    System.out.println(createUsername("Hoa","chen","987654321"));
    System.out.println(createUsername("Sam","Abhar","675849308"));

    
  }

  
  String getUsername(String email){
    int pos = email.indexOf("@");
    return email.substring(0,pos);
  }

  String splitReverse(String s){
    int middle = s.length()/2;
    return s.substring(middle) + s.substring(0,middle);
  }

  String createUsername(String fName, String lName, String osis){
    return fName.substring(0,1)+lName+osis.substring(osis.length()-4);
  }
}