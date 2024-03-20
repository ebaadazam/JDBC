// Deleting a row or record from the database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class deleteData {
    public static void main(String[] args) throws Exception {
        // Database URL, username, password and query
        String url = "jdbc:mysql://localhost:3306/ebaad";
        String user = "root";
        String password = "ebaad";
        String query = "DELETE FROM student WHERE strollno = ?";
     
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);

        // Create a PreparedStatement object
        PreparedStatement st = con.prepareStatement(query);
        
        // The ID of the student to be deleted
        int studentId = 5;

        // Set the value of the ID in the query
        st.setInt(1, studentId);

        // Execute the update
        int rowsAffected = st.executeUpdate();
        System.out.println(rowsAffected + " row(s) deleted.");
        
        st.close();
        con.close();
    } 
           
}
