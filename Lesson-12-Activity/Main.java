class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  String creditCardType(String number){
    if(number.substring(0,1).equals("4"))
      return "Visa";
    else if (number.substring(0,2).equals("34") || number.substring(0,2).equals("37"))
      return "American Express";
    else if(number.substring(0,2).equals("36"))
      return "Diner Club";
    else if(number.substring(0,2).equals("51") || number.substring(0,2).equals("55"))
      return "Mastercard";
    else if(number.substring(0,4).equals("6011") || number.substring(0,2).equals("65"))
      return "Discover";
    else
      return "Unknown";
  }
  String pigLatin(String word){
    String fLetter = word.substring(0,1);
    String rest = word.substring(1);
    return rest + fLetter + "ay";
  }
  String nycLocate(String zip){
    if(zip.substring(0,3).equals("100") || zip.substring(0,3).equals("101") || zip.substring(0,3).equals("102"))
      return "Manhattan";
    else if(zip.substring(0,3).equals("103"))
      return "Staten Island";
    else if(zip.substring(0,3).equals("104"))
      return "Bronx";
    else if(zip.substring(0,3).equals("112"))
      return "Brooklyn";
    else if(zip.substring(0,3).equals("113") || zip.substring(0,3).equals("114") || zip.substring(0,3).equals("111"))
      return "Queens";
    else
      return "Unknown";
  }
  String getMonth(String date){
    if(date.substring(0,2).equals("01"))
      return "January";
    else if(date.substring(0,2).equals("02"))
      return "February";
    else if(date.substring(0,2).equals("03"))
      return "March";
    else if(date.substring(0,2).equals("04"))
      return "April";
    else if(date.substring(0,2).equals("05"))
      return "May";
    else if(date.substring(0,2).equals("06"))
      return "June";
    else if(date.substring(0,2).equals("07"))
      return "July";
    else if(date.substring(0,2).equals("08"))
      return "August";
    else if(date.substring(0,2).equals("09"))
      return "September";
    else if(date.substring(0,2).equals("10"))
      return "October";
    else if(date.substring(0,2).equals("11"))
      return "November";
    else if(date.substring(0,2).equals("12"))
      return "December";
    else
      return "Unknown";
  }
  boolean validatePswd(String pw){
    if(pw.indexOf("^") == -1 && pw.indexOf("*") == -1 && pw.indexOf("(") == -1 && pw.indexOf(")") == -1 && pw.length() <= 8 && pw.length() >= 5)
      return true;
    else
      return false;
  }
  void init(){
   System.out.println(creditCardType("456789"));
   System.out.println(creditCardType("3456707667"));
   System.out.println(creditCardType("37905490854"));
   System.out.println(creditCardType("36456789"));
   System.out.println(creditCardType("51456789"));
   System.out.println(creditCardType("55456789"));
   System.out.println(creditCardType("6011456789"));
   System.out.println(creditCardType("65456789"));
   System.out.println(creditCardType("065456789"));
   System.out.println(pigLatin("pig"));
   System.out.println(pigLatin("better"));
   System.out.println(pigLatin("a"));
   System.out.println(nycLocate("10033"));
   System.out.println(nycLocate("10133"));
   System.out.println(nycLocate("10233"));
   System.out.println(nycLocate("10333"));
   System.out.println(nycLocate("10433"));
   System.out.println(nycLocate("11233"));
   System.out.println(nycLocate("11333"));
   System.out.println(nycLocate("11433"));
   System.out.println(nycLocate("11133"));
   System.out.println(nycLocate("21133"));
   System.out.println(getMonth("01/15/2000"));
   System.out.println(getMonth("02/15/2000"));
   System.out.println(getMonth("03/12/2000"));
   System.out.println(getMonth("04/15/2000"));
   System.out.println(getMonth("05/15/2000"));
   System.out.println(getMonth("06/15/2000"));
   System.out.println(getMonth("07/15/2000"));
   System.out.println(getMonth("08/15/2000"));
   System.out.println(getMonth("09/15/2000"));
   System.out.println(getMonth("10/15/2000"));
   System.out.println(getMonth("11/15/2000"));
   System.out.println(getMonth("12/15/2000"));
   System.out.println(getMonth("13/12/2000"));
   System.out.println(validatePswd("@#$%^&UI"));
   System.out.println(validatePswd("password"));
   System.out.println(validatePswd("passwo^d"));
  }

  
  
}