import java.sql.*;
import java.util.*;

public class Create_Movies {

	public static void main(String args[])
	{
		try {
			Connection con;
			Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("Driver Established");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mulesoft","root","root");
		    System.out.println("Connection Established");
		if(con!=null) {
			
			Statement stmt= con.createStatement();
			String qry ="create table Movies(Movie_ID int primary key,Movie_Name text,Movie_Actor text,Movie_Actress text,Movie_Director text,Movie_Year text)";
			
			int t= stmt.executeUpdate(qry);
			System.out.println("Movies Table created ");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
