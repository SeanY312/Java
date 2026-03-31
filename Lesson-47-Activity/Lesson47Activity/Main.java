import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.sql.*;

import java.net.InetSocketAddress;
import java.util.Map;

//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java
//java -cp sqlite-jdbc-3.23.1.jar: Main

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; Main.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }


  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() throws IOException{
   

    // create a port - our Gateway
    int port = 8500;
      
    //create the HTTPserver object
    HttpServer server = HttpServer.create(new InetSocketAddress(port),0);

    // create the database object
    Database db = new Database("jdbc:sqlite:chinook.db");
    String sql = "";
    
    

   // Add your  code here
   server.createContext("/", new RouteHandler("You are connected, but route not given or incorrect...."));
   sql = "Select * From customers";
   server.createContext("/customer", new RouteHandler(db, sql));
   String sql2 = "Select * From employees";
   server.createContext("/employees", new RouteHandler(db,sql2)); 
   String sql3 = "Select * From tracks, artists, albums Limit 10";
   server.createContext("/albumsinfo", new RouteHandler(db,sql3));
   String sql4 = "Select customers.FirstName,customers.LastName,invoices.InvoiceDate,tracks.Name ";
   sql4 += "From customers Inner Join invoices On customers.CustomerId = invoices.CustomerId ";
   sql4 += "Inner Join invoice_items On invoices.InvoiceId = invoice_items.InvoiceId ";
   sql4 += "Inner Join tracks On tracks.TrackId = invoice_items.TrackId Limit 10";
   server.createContext("/customersongs", new RouteHandler(db,sql4));
    //Start the server
    server.start();

    System.out.println("Server is listening on port "+port);
       
      
    }    
}


