import java.sql.*;
import java.util.*;

public class Insert_Movies {

	public static void main(String args[])
	{
		try {
			Connection con;
			Class.forName("com.mysql.jdbc.Driver");
		    System.out.println("Driver Established");
		    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mulesoft","root","root");
		    System.out.println("Connection Established");
		    
		if(con!=null) {

			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Movie ID: ");
			int id=sc.nextInt();
			System.out.println("Enter Movie Name: ");
			String name=sc.next();
			System.out.println("Enter Movie Actor: ");
			String actor=sc.next();
			System.out.println("Enter Movie Actress: ");
			String actress=sc.next();
			System.out.println("Enter Movie Director: ");
			String director=sc.next();
			System.out.println("Enter Movie Year: ");
			String year=sc.next();

			PreparedStatement pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?,?)");
    		pstmt.setInt(1, id);
    		pstmt.setString(2, name);    			
    		pstmt.setString(3,actor);
    		pstmt.setString(4, actress);
    		pstmt.setString(5, director);
    		pstmt.setString(6, year);

    		boolean n = pstmt.execute();   			
    		
    		if(n) {
    			System.out.println("One Movie Inserted");
    		}
		}
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
