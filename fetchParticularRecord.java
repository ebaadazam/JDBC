import java.sql.*;
public class fetchParticularRecord {
	public static void main(String[] args) throws Exception {
			
			// forName is a method that belongs to the Class that is used to load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Creating the URL, UserName and Password
			String url = "jdbc:mysql://localhost:3306/ebaad";
			String uname = "root";
			String pass = "ebaad";
			String query = "select stname from Student where strollno = 2";
			
			/* Connection is an interface and you can't create the object of an interface directly so you need to search for a method()
			  that gives you the instance of the Interface Connection and that method is getConnection() which belongs to the class
			  DriverManager. This method takes three parameters- URL, UserName and Password */
			Connection con = DriverManager.getConnection(url, uname, pass);
			
			// Create the statement
			Statement st = con.createStatement();
			
			// Execute the query
			ResultSet rs = st.executeQuery(query); // storing the data in ResultSet as it has the power to store the bunch of data in a tabular structure
			
			rs.next(); // takes your pointer to the next record as by default it points to the column value
			String name = rs.getString("stname"); // Pass the name of the column of the table we created in MYSQL Workbench
			System.out.println(name);
			
			st.close();
			con.close();
		}
	}

