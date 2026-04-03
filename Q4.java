package jdbc;
import java.util.*;
import java.sql.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll no : ");
		int roll=sc.nextInt();
		System.out.print("Enter Name : ");
		String name=sc.next();
		System.out.print("Enter Age : ");
		int age=sc.nextInt();
		System.out.print("Enter Dept : ");
		String dept=sc.next();
		System.out.print("Enter CGPA : ");
		float cgpa=sc.nextFloat();
		try {
			String driver="org.postgresql.Driver";
			String url="jdbc:postgresql://192.168.1.17/cse_db24";
			String username="24bcsg83";
			String password="24bcsg83";
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			if(con!=null)
				System.out.println("connection established successfully");
		
			String qry = "INSERT INTO student(roll_no,name,age,department,cgpa) VALUES (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(qry);
			ps.setInt(1,roll);
			ps.setString(2,name);
			ps.setInt(3,age);
			ps.setString(4,dept);
			ps.setFloat(5,cgpa);		
			int i = ps.executeUpdate();
			if(i==1) {
				System.out.print("Record Inserted Successfully");
			}
			ps.close();
			con.close();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}

