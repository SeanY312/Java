
import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
   

    String queryResult="";
    String sql ="";
    Database db = new Database("jdbc:sqlite:students.db");
    
    //sql = "Select * From cr101 Where Teacher1 = 'BANU'";
    //sql = "Select * From cr101 Where Teacher1 = 'PORCHETTA' And Period = '10'";
    //sql = "Select Distinct StudentID From cr101";
    //sql = "Select StudentID, Course, Period From cr101 Where Room In('322','105','106','323') And Grade = '11'";
    sql = "Select * From cr101 Where Course like 'M%X'";
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);

   

    


    
     
  }    
}