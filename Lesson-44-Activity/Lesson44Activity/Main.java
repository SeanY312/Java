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

    //1
    //For the first 30 tracks, get the name of the track and the album name that it belongs to.
    sql = "Select tracks.Name,albums.Title From tracks Inner Join albums On tracks.albumId = albums.albumId Limit 30;";
    result = db.runSQL(sql, "table-auto");
    print(result);
    
    //2
    //For each Invoice from April 2012, retrieve customer first and last name, invoice id, and Invoice date
    sql = "Select customers.FirstName, customers.LastName, invoices.InvoiceId, invoices.InvoiceDate ";
    sql += "From invoices Inner Join customers On invoices.CustomerId = customers.CustomerId Where invoices.InvoiceDate like'2012-04%'";
    result = db.runSQL(sql, "table-auto");
    print(result);
    
    //3
    //For the first 20 invoices get the customer id, invoice id, track name, unit price and quantity .(Hint: information is in three tables) 
    sql = "Select invoices.CustomerId, invoices.InvoiceId, tracks.Name, invoice_items.UnitPrice, invoice_items.Quantity ";
    sql += "From invoices Inner Join invoice_items On invoices.InvoiceId = invoice_items.InvoiceId ";
    sql += "Inner Join tracks On tracks.TrackId = invoice_items.TrackId Limit 20;";
    result = db.runSQL(sql, "table-auto");
    print(result);

    //4
    //What is the list of customers' names whose merchandise is being shipped either to the USA, Germany or Poland? (Hint: use billingcountry and remove duplicates)
    sql = "Select Distinct customers.FirstName, customers.LastName, invoices.BillingCountry From customers ";
    sql += "Inner Join invoices On customers.CustomerId = invoices.CustomerId Where invoices.BillingCountry In('USA','Germany','Poland');";
    result = db.runSQL(sql, "table-auto");
    print(result);
    
    //5
    sql = "Select tracks.Name From tracks Inner Join genres ";
    sql += "On tracks.GenreId = genres.GenreId Where genres.Name = 'Latin' Limit 20";
    result = db.runSQL(sql, "table-auto");
    print(result);
    
    //6
    sql = "Select Distinct albums.Title From albums ";
    sql += "Inner Join tracks On tracks.albumId = albums.albumId ";
    sql += "Inner Join genres On genres.GenreId = tracks.GenreId ";
    sql += "Where genres.Name = 'Jazz';";
    result = db.runSQL(sql, "table-auto");
    print(result);

    //7
    //List all the Pop Artist names.
    sql = "Select Distinct artists.Name From genres Inner Join tracks On tracks.GenreId = genres.GenreId ";
    sql += "Inner Join albums On tracks.albumId = albums.albumId Inner Join artists On albums.ArtistId = artists.ArtistId Where genres.Name = 'Pop';";
    result = db.runSQL(sql, "table-auto");
    print(result);
      
  }    
}