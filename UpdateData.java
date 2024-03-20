// Updating the data of the table

import java.sql.*;
public class UpdateData {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/ebaad";
        String user = "root";
        String password = "ebaad";
        String query = "update student set stname = ? WHERE strollno = ?";
        
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement st = con.prepareStatement(query); 
            
        st.setString(1, "Fatima Zehra"); // Correctly setting the first parameter as a string as mentioned in the query
        st.setInt(2, 4); // Correctly setting the second parameter as an int as mentioned in the query
        
        int result = st.executeUpdate();
        System.out.println(result + " row(s) updated.");
    }
}
