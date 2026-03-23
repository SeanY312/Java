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

    String result="";
    String sql = "";
     
		Database db = new Database("jdbc:sqlite:chinook.db" );	
    //sql = "Select albums.Title, artists.Name From albums Inner Join artists On artists.ArtistId = albums.ArtistId Limit 20;";
    sql = "Select tracks.Name,genres.Name From tracks Inner Join genres on tracks.GenreId = genres.GenreId Where genres.Name In('Blues','Latin','Pop','Classical') Limit 20";
    
    
    result = db.runSQL(sql, "table-auto");
    print(result);
  }    
}