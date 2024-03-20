/* Inserting the values or data to the database with the help of Prepared Statement. We use Prepared Statement if we have more number
   of columns than just two. PreparedStatement means whenever you want to work with predefined query, the value of which keeps on
   changing, we use PreparedStatement. */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class insertDataUsingPreparedSt {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/ebaad";
		String name = "root";
		String pass = "ebaad";
		String query = "insert into student values(?, ?, ?)";
		
		Connection con = DriverManager.getConnection(url, name, pass);
		PreparedStatement st = con.prepareStatement(query);
		
		int id = 15;
		String n = "Samyak Jain";
		String c = "BCA";
		st.setInt(1, id);
		st.setString(2, n);
		st.setString(3, c);
		
		// executeUpdate() is used to insert the values and as it is returning the result in integer so we are also storing it in int
		int count = st.executeUpdate();
		System.out.println(count + " row(s) affected");
		
		st.close();
		con.close();
	}


}
