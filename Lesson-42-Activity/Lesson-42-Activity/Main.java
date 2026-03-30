
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

		Database db = new Database("jdbc:sqlite:students.db_bak" );	
    //sql = "Update cr101 Set Room = '122' Where StudentID = 'STUDENT1001' And Period = 3";
    //sql = "Select Room From cr101 Where Period = 3 And StudentID = 'STUDENT1001'";
    //sql += "Delete From cr101 Where StudentID = 'STUDENT1200' And Course = 'ZQCTEDA'";
    //sql += "Select Course From cr101 Where StudentID = 'STUDENT1200'";
    //sql += "Update cr101 Set Room = '213' Where Period In(4,5) And Teacher1 = 'DOYLE'"
    //sql += "Select * From cr101 Where Teacher1 = 'DOYLE' And Period In(4,5)";
    //sql += "Update cr101 Set Teacher1 = 'ROFFLER' Where Teacher1 = 'ARCHETTI' And Course = 'MQF44QGF' And Section = 1";
    //sql = "Select * From cr101 Where Course = 'MQF44QGF' And Section = 1";
    sql += "Update cr101 Set Grade = '11', OffClass = '3C8' Where StudentID = 'STUDENT999';";
    sql += "Select * From cr101 Where StudentID = 'STUDENT999';";
    //sql += "Insert Into cr101() Values ";
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);
   
     
      }    
}