package jdbc;
import java.util.*;
import java.sql.*;
public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the ROll no : ");
		int uroll=sc.nextInt();
		System.out.print("Enter CGPA : ");
		float ucgpa=sc.nextFloat();
		
		try {
			String driver="org.postgresql.Driver";
			String url="jdbc:postgresql://192.168.1.17/cse_db24";
			String username="24bcsg83";
			String password="24bcsg83";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			if(con!=null)
				System.out.println("connection established successfully");
		
			String qry = "UPDATE student SET cgpa=? WHERE roll_no=?";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setFloat(1,ucgpa);
			ps.setInt(2,uroll);		
			int i = ps.executeUpdate();
			if(i==1) {
				System.out.print("Record Updated Successfully");
			}
			ps.close();
			con.close();
		}
		catch (Exception e) {
			System.out.print(e);
		}

	}

}
