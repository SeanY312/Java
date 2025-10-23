class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  boolean collegeCredit(String code){
    if(code.substring(5,6).equals("E") || code.substring(5,6).equals("M"))
      return true;
    else
      return false;
  }
  String getCounselor(String officialclass){
    if(officialclass.substring(0,1).equals("B") || officialclass.substring(1,2).equals("B"))
      return "Berrouet";
    else if(officialclass.substring(0,1).equals("C") || officialclass.substring(1,2).equals("C"))
      return "Chu";
    else if(officialclass.substring(0,1).equals("D") || officialclass.substring(1,2).equals("D"))
      return "Dinn";
    else if(officialclass.substring(0,1).equals("E") || officialclass.substring(1,2).equals("E"))
      return "Eyzengart";
    else if(officialclass.substring(0,1).equals("F") || officialclass.substring(1,2).equals("F"))
      return "Flores";
    else if(officialclass.substring(0,1).equals("G") || officialclass.substring(1,2).equals("G"))
      return "Gibson";
    else if(officialclass.substring(0,1).equals("L") || officialclass.substring(1,2).equals("L"))
      return "Shim Lee";
    else if(officialclass.substring(0,1).equals("M") || officialclass.substring(1,2).equals("M"))
      return "Meltzer";
    else if(officialclass.substring(0,1).equals("P") || officialclass.substring(1,2).equals("P"))
      return "Paccione";
   else if(officialclass.substring(0,1).equals("S") || officialclass.substring(1,2).equals("S"))
      return "Fiore";
   else if(officialclass.substring(0,1).equals("T") || officialclass.substring(1,2).equals("T"))
      return "Tsai";
   else if(officialclass.substring(0,1).equals("Z") || officialclass.substring(1,2).equals("Z"))
      return "Zayes";
    else
      return "Unknown";
  }
  String imageType(String name){
    if(name.substring(name.length()-4).equals("JPEG") || name.substring(name.length()-3).equals("JPG"))
      return "Joint Photographic Experts Group";
    else if(name.substring(name.length()-3).equals("PNG"))
      return "Portable Network Graphics";
    else if(name.substring(name.length()-3).equals("GIF"))
      return "Graphics Interchange Format";
    else if(name.substring(name.length()-3).equals("PDF"))
      return "Portable Document Format";
    else 
      return "Unknown";
    
  }
  void init(){
    System.out.println(collegeCredit("HHOIIM"));
    System.out.println(collegeCredit("HHOIIE"));
    System.out.println(collegeCredit("HHOIEO"));
    System.out.println(getCounselor("2B3"));
    System.out.println(getCounselor("B23"));
    System.out.println(getCounselor("2C3"));
    System.out.println(getCounselor("2C3"));
    System.out.println(getCounselor("2D3"));
    System.out.println(getCounselor("D23"));
    System.out.println(getCounselor("2F3"));
    System.out.println(getCounselor("F23"));
    System.out.println(getCounselor("2G3"));
    System.out.println(getCounselor("G23"));
    System.out.println(getCounselor("2L3"));
    System.out.println(getCounselor("L23"));
    System.out.println(getCounselor("2M3"));
    System.out.println(getCounselor("M23"));
    System.out.println(getCounselor("2P3"));
    System.out.println(getCounselor("P23"));
    System.out.println(getCounselor("2S3"));
    System.out.println(getCounselor("S23"));
    System.out.println(getCounselor("2T3"));
    System.out.println(getCounselor("T23"));
    System.out.println(getCounselor("2Z3"));
    System.out.println(getCounselor("Z23"));
    System.out.println(getCounselor("123"));
    System.out.println(imageType("cat.JPEG"));
    System.out.println(imageType("cat.JPG"));
    System.out.println(imageType("cat.PNG"));
    System.out.println(imageType("cat.GIF"));
    System.out.println(imageType("cat.PDF"));
    System.out.println(imageType("cat.RYGVHJB"));
  

    
  }

 
}