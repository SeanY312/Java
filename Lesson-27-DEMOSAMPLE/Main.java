class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // This example we are substituting all lower case letters to another lower case letter.
    char[] sub = new char[8];
    sub[0] = 'a';
    sub[1] = 'e';
    sub[2] = 'o';
    sub[3] = 'u';
    sub[4] = '\u1100';
    sub[5] = '\u1101';
    sub[6] = '\u1102';
    sub[7] = '\u1103';

    char[] sub2 = new char[8];
    sub2[0] = '\u1100';
    sub2[1] = '\u1101';
    sub2[2] = '\u1102';
    sub2[3] = '\u1103';
    sub2[4] = 'o';
    sub2[5] = 'u';
    sub2[6] = 'a';
    sub2[7] = 'e'; 


    print(subEncryption("The weather is good today", sub, sub2)); 
    print(subDecryption("Thu wuothur is gaad tadoy", sub, sub2)); 
    print(shiftEncryption(subEncryption("The weather is good today", sub, sub2), 4));
    print(shiftDecryption(shiftEncryption(subEncryption("The weather is good today", sub, sub2), 4),4));
    print(pairingsEncryption("The weather is good today"));
    print(pairingsDecryption("eew hh aeweewtae  ehtawwaehteTh"));
  }

  String subEncryption(String s, char[] sub, char[] sub2){
    String bld ="";
    int pos = - 8;
    for(int x = 0; x < s.length(); x++){
      bld += s.substring(x,x + 1);
    }
    for(int z = 0; z < sub.length; z ++){
      while(bld.indexOf(sub[z]) != -1){
          pos = bld.indexOf(sub[z]);
          bld = bld.substring(0, pos) + sub2[z] + bld.substring(pos + 1);
          // print("bld: " + bld + "pos: " + pos);
     } }
    return bld;
    }
  String subDecryption(String s, char[] sub, char[] sub2){
    String bld ="";
    int pos = -8;
    for(int x = 0; x < s.length(); x++){
      bld += s.substring(x,x + 1);
    }
    for(int z = sub2.length - 1; z >= 0; z --){
      while(bld.indexOf(sub2[z]) != -1){
          pos = bld.indexOf(sub2[z]);
          bld = bld.substring(0, pos) + sub[z] + bld.substring(pos + 1);
          // print("bld: " + bld + "pos: " + pos);
     } }
    return bld;
    }



  //Level 2 Cipher encoding with no wrapping
  String shiftEncryption(String s, int shift){
    String bld="";
    int c = 0;
    for(int x = 0; x < s.length(); x++){
      c = (int)(s.charAt(x));
      bld += (char)(c + shift);
    }
    return bld;
  }
  String shiftDecryption(String s, int shift){
    String bld="";
    int c = 0;
    for(int x = 0; x < s.length(); x++){
      c = (int)(s.charAt(x));
      bld += (char)(c - shift);
    }
    return bld;
  }


  String pairingsEncryption(String s){
    String bld = "";
    int repeat  = 0;
    for(int x = 0; x < s.length(); x++){
      bld += s.substring(x,x + 1);
    }
    int cutoff = bld.length();
    if(bld.length() % 6.0 == 0){
      repeat = bld.length() / 6;
      for(int x = 0; x <= repeat; x ++){
        bld = bld + bld.substring(x, x+1) + bld.substring(x+2, x+3) + bld.substring(x+5, x+6) + bld.substring(x+4, x+5) + bld.substring(x+3, x+4) + bld.substring(x+1, x+2);
      } 
      bld = bld.substring(cutoff);
    }else{
      repeat = bld.length() / 6;
       print("Repeat: " + repeat + " leftover: " + cutoff % 6 + 1);
      for(int x = 0; x <= repeat; x ++){
        bld = bld + bld.substring(x, x+1) + bld.substring(x+2, x+3) + bld.substring(x+5, x+6) + bld.substring(x+4, x+5) + bld.substring(x+3, x+4) + bld.substring(x+1, x+2);
      } 
      bld += bld.substring(0, cutoff % 6 + 1);
      print("Cutoff: " + cutoff);
      bld = bld.substring(cutoff + 1, bld.length());
    }
    return bld;
  }


  String pairingsDecryption(String s){
    String bld = "";
    int repeat  = 0;
    for(int x = 0; x < s.length(); x++){
      bld += s.substring(x,x + 1);
    }
    int cutoff = bld.length();
    if(bld.length() % 6.0 == 0){
      repeat = bld.length() / 6;
      for(int x = 0; x <= repeat; x ++){
        bld = bld + bld.substring(x, x+1) + bld.substring(x+1, x+2) + bld.substring(x+5, x+6) + bld.substring(x+4, x+5) + bld.substring(x+3, x+4) + bld.substring(x+2, x+3);
      } 
      bld = bld.substring(cutoff);
    }else{
      repeat = bld.length() / 6;
      // print("Repeat: " + repeat + " leftover: " + cutoff % 6 + 1);
      for(int x = 0; x <= repeat; x ++){
        bld = bld + "Pair: [ " + bld.substring(x, x+1) + bld.substring(x+5, x+6) + bld.substring(x+1, x+2) + bld.substring(x+4, x+5) + bld.substring(x+3, x+4) + bld.substring(x+2, x+3) + " ]";
        System.out.println(bld);
      } 
      bld = bld.substring(0, cutoff % 6 + 1) + bld;
      // print("Cutoff: " + cutoff);
      bld = bld.substring(cutoff, bld.length());
    }
    return bld;
  }



  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
  // Encoding message
    //String file = Input.readFile("test.txt");

    //substituion
    //String encodedMsg1 = subEncryption(file,sub,sub2);
    //Input.writeFile("Encode1.txt",encodedMsg1);

    // caesar cipher
    //String encodedMsg2 = encode(encodedMsg1);
    //Input.writeFile("Encode2.txt",encodedMsg2);

    // reverse
    //String encodedMsg3 = reverse(encodedMsg2);
    //Input.writeFile("Encode3.txt",encodedMsg3);

    
    // decoding message
    //String file2 = Input.readFile("Encode1.txt");
    
    //String decodedMsg1 = reverse(file2);
    //Input.writeFile("Decode1.txt", decodedMsg1);
    
    //String decodedMsg2 = decode(decodedMsg1);
    //Input.writeFile("Decode2.txt", decodedMsg2);
    
     //String decodedMsg3 = subEncryption(decodedMsg2, sub2, sub);
    //Input.writeFile("Decode1.txt", decodedMsg3);

}