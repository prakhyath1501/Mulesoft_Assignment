import java.sql.*;
import java.util.*;

public class Select_Movies {

	public static void main(String args[])
	{
		try {
			Connection con;
			Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("Driver Established");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mulesoft","root","root");
		    System.out.println("Connection Established");
		if(con!=null) {
			
			PreparedStatement  pstmt= con.prepareStatement("select * from Movies");

			ResultSet rs = pstmt.executeQuery();

			while (rs.next())
			{

			System.out.println("Movie ID:  = "+ rs.getInt(1) + "\n" + "Movie Name = "+ rs.getString(2) + "\n" + "Movie Actor = " + rs.getString(3) + "\n" + "Movie Actress " + rs.getString(4) + "\n" + "Movie Director = " + rs.getString(5) + "\n" + "Date Of Release = " + rs.getString(6));
				
			}

	     	con.close();
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
