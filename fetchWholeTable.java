// Fetching the whole table from the database and displaying it
import java.sql.*;
public class Program2 {
	public static void main(String[] args) throws Exception {	
		// forName is a method that belongs to the Class that is used to load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Creating the URL, UserName and Password
		String url = "jdbc:mysql://localhost:3306/ebaad";
		String uname = "root";
		String pass = "ebaad";
		String query = "select * from student";
		
		/* Connection is an interface and you can't create the object of an interface directly so you need to search for a method()
		  that gives you the instance of the Interface Connection and that method is getConnection() which belongs to the class
		  DriverManager. This method takes three parameters- URL, UserName and Password */
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		// Create the statement
		Statement st = con.createStatement();
		
		// Execute the query
		ResultSet rs = st.executeQuery(query); // storing the data in ResultSet as it has the power to store the bunch of data in a tabular structure
		
		String userData= "";
		while(rs.next()) {
			userData = rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3);
			System.out.println(userData);
		}
		
		st.close();
		con.close();
	   }
	}
