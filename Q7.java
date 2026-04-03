package jdbc;
import java.sql.*;
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter Roll No to delete: ");
        int dRoll = sc.nextInt();
        try {
			String driver="org.postgresql.Driver";
			String url="jdbc:postgresql://192.168.1.17/cse_db24";
			String username="24bcsg83";
			String password="24bcsg83";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			if(con!=null)
				System.out.println("connection established successfully");
		
			String qry = "DELETE FROM student WHERE roll_no=?";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setInt(1,dRoll);		
			int i = ps.executeUpdate();
			if(i==1) {
				System.out.print("Record Deleted Successfully");
			}
			ps.close();
			con.close();
		}
        catch (Exception e) {
        	System.out.print(e);
        }
	}

}
