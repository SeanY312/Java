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


    // print(subEncryption("The weather is good today", sub, sub2)); 
    // print(subDecryption("Thu wuothur is gaad tadoy", sub, sub2)); 
    // print(shiftEncryption(subEncryption("The weather is good today", sub, sub2), 4));
    // print(shiftDecryption(shiftEncryption(subEncryption("The weather is good today", sub, sub2), 4),4));
    //print(pairingsEncryption("1234561234561"));
    //print(pairingsDecryption("136542136542"));
    //print(unicodeEncryption("Hey what's good?"));
    //print(unicodeDecryption("⭀⭝⭱⬘⭯⭠⭙⭬⬟⭫⬘⭟⭧⭧⭜⬷"));
    String file = Input.readFile("test.txt");

    String encodedMsg1 = subEncryption(file,sub,sub2);
    print("Sub1: " + encodedMsg1);

    String encodedMsg2 = shiftEncryption(encodedMsg1, 4);
    print("Shift2: " + encodedMsg2);

    String encodedMsg3 = pairingsEncryption(encodedMsg2);
    print("Pairings3: " + encodedMsg3);

    String encodedMsg4 = unicodeEncryption(encodedMsg3);
    print("Uni4: " + encodedMsg4);

    
    String decodedMsg1 = unicodeDecryption(encodedMsg4);
    print("Uni1: " + decodedMsg1);
    
    String decodedMsg2 = pairingsDecryption(decodedMsg1);
    print("Pairings: " + decodedMsg2);
    
    String decodedMsg3 = shiftDecryption(decodedMsg2, 4);
    print("Shift3: " + decodedMsg3);

    String decodedMsg4 = subDecryption(decodedMsg3, sub, sub2);
    print("Sub2: " + decodedMsg4);
    // print("abcdef123456ghijkl");
    // print(pairingsEncryption("abcdef123456ghijkl789"));
    // print(pairingsDecryption(pairingsEncryption("abcdef123456ghijkl789")));
    print("We should attack at dusk!");
    print(unicodeEncryption(pairingsEncryption(
    shiftEncryption(subEncryption("We should attack at dusk!", sub, sub2),4))));
    print(subDecryption(shiftDecryption(pairingsDecryption(unicodeDecryption(
    unicodeEncryption(pairingsEncryption(shiftEncryption(subEncryption("We should attack at dusk!", sub, sub2),4))))),4),sub,sub2));

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
    // print("Cutoff: " + cutoff);
    if(bld.length() % 6.0 == 0){
      for(int x = 0; x < cutoff; x += 6){
       // print("bld before: " + bld);
        bld = bld + bld.substring(x, x+1) + bld.substring(x+2, x+3) + bld.substring(x+5, x+6) + bld.substring(x+4, x+5) + bld.substring(x+3, x+4) + bld.substring(x+1, x+2);
        //print("bld after: " + bld);
      }
      //print("bld precutoff: " + bld);
      bld = bld.substring(cutoff, bld.length()); 
    }else{
       repeat = bld.length() / 6;
       //print("Repeat: " + repeat + " leftover: " + cutoff % 6 );
      for(int x = 0; x < cutoff / 6 * 6; x += 6){
        // print("bld before: " + bld);
        bld = bld + bld.substring(x, x+1) + bld.substring(x+2, x+3) + bld.substring(x+5, x+6) + bld.substring(x+4, x+5) + bld.substring(x+3, x+4) + bld.substring(x+1, x+2);
        // print("bld after: " + bld);
      }
      //bld += bld.substring(0, cutoff % 6);
      // print("bld: " + bld);
      // print("Cutoff: " + cutoff);
      bld = bld.substring(cutoff, bld.length()) + bld.substring(repeat * 6, repeat * 6 + cutoff % 6);
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
    // print("Cutoff: " + cutoff);
    if(bld.length() % 6.0 == 0){
      for(int x = 0; x < cutoff; x += 6){
        // print("bld before: " + bld);
        bld = bld + bld.substring(x, x+1) + bld.substring(x+5, x+6) + bld.substring(x+1, x+2) + bld.substring(x+4, x+5) + bld.substring(x+3, x+4) + bld.substring(x+2, x+3);
        // print("bld after: " + bld);
      }
      // print("bld precutoff: " + bld);
      bld = bld.substring(cutoff, bld.length()); 
    }else{
       repeat = bld.length() / 6;
        // print("Repeat: " + repeat + " leftover: " + cutoff % 6 );
      for(int x = 0; x < cutoff / 6 * 6; x += 6){
        // print("bld before: " + bld);
        bld = bld + bld.substring(x, x+1) + bld.substring(x+5, x+6) + bld.substring(x+1, x+2) + bld.substring(x+4, x+5) + bld.substring(x+3, x+4) + bld.substring(x+2, x+3);
        // print("bld after: " + bld);
      }
      //bld += bld.substring(0, cutoff % 6);
      //  print("bld: " + bld);
      //  print("Cutoff: " + cutoff);
      //bld = bld.substring(cutoff, bld.length());
      bld = bld.substring(cutoff, bld.length()) + bld.substring(repeat * 6, repeat * 6 + cutoff % 6);
    }
    return bld;
  }


  String unicodeEncryption(String s){
    String bld = "";
    int c = 0;
    for(int x = 0; x < s.length(); x++){
      c = (int)(s.charAt(x));
      bld += (char)(c + 11000);
    }
    return bld;
  }

  String unicodeDecryption(String s){
    String bld = "";
    int c = 0;
    for(int x = 0; x < s.length(); x++){
      c = (int)(s.charAt(x));
      bld += (char)(c - 11000);
    }
    return bld;
  }



  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
  
}