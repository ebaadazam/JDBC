// Inserting the values or data to the database
import java.sql.*;

public class insertDataIntoDatabase {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/ebaad";
		String name = "root";
		String pass = "ebaad";
		String query = "insert into student values(12, 'Nirvani Khanna', 'BCA')";
		
		Connection con = DriverManager.getConnection(url, name, pass);
		Statement st = con.createStatement();
		
		// executeUpdate() is used to insert the values and as it is returning the result in integer so we are also storing it in int
		int count = st.executeUpdate(query);
		System.out.println(count + " row(s) affected");
		
		st.close();
		con.close();
	}

}
