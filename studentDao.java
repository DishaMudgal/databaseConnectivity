package com.student.manage;
import java.sql.*;
import java.io.*;
public class studentDao {
	
	public  static boolean insertStudentToDB(student stud) 
	{
	
		//JDBC CODE.....
		boolean f=false;
		try
		{
		Connection con=CP.createC();
		String q="insert into studentinfo(sname,sage,scity,scontact)values(?,?,?,?)";
		//Preapared Statement
		PreparedStatement pstmt=con.prepareStatement(q);
		//set the values of parameter
		pstmt.setString(1,stud.getStudentname());
		pstmt.setInt(2,stud.getStudentage());
		pstmt.setString(3,stud.getStudentcity());
		pstmt.setString(4,stud.getStudentcontact());
		
		//execute.....
		pstmt.executeUpdate();		
		f=true;
		
		}
		catch(Exception e) 
		{
			e.printStackTrace();
	    }
		
		return f;
	}
		public  static boolean deleteStudentFromDB(int userId) {
			//JDBC CODE.....
			boolean f=false;
			try
			{
			Connection con=CP.createC();
			String q="delete from studentinfo where sid=?";
			//Preapared Statement
			PreparedStatement pstmt=con.prepareStatement(q);
			//set the values of parameter
			pstmt.setInt(1, userId);
			//execute.....
			pstmt.executeUpdate();		
			f=true;
			
		
			
			}
			catch(Exception e) 
			{
				e.printStackTrace();
		    }
			
			return f;
		}
			public static void showAllStudentInfo() {
				try
				{
				Connection con=CP.createC();
				String q="select * from studentinfo;";
				//Statement
				Statement stmt=con.createStatement();
				//execute.....
				ResultSet set=stmt.executeQuery(q);		
				while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				int age=set.getInt(3);
				String city=set.getString(4);
				String contact=set.getString(5);
				System.out.println("id:"+id+"\n"+"name:"+name+"\n"+"age:"+age+"\n"+"city:"+city+"\n"+"contact:"+contact);
				System.out.println("+++++++++++++++++++++++");
				}
				}
				catch(Exception e) 
				{
					e.printStackTrace();
			    }
			}
			public static boolean UpdateStudentInfo(int updateid) {
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 //   System.out.println("which value of id"+updateid+"you want to change");
	//	System.out.println("press 1 for change name"+"\n"+"press 2 for change age"+"\n"+"press 3 for change city"+"\n"+"press 4 for change contact"+"\n");
				
				
				
				boolean f=false;
			try {
				Connection con=CP.createC();
				String q="update studentinfo set sname=?,sage=?,scity=?,scontact=? where sid=?";
				System.out.println("Enter new name:");
					String name=br.readLine();
					
					System.out.println("Enter new age");
					int age=Integer.parseInt(br.readLine());
					
					System.out.println("Enter new city");
					String city=br.readLine();
					
					System.out.println("Enter new contact:");
					String contact=br.readLine();
				
				PreparedStatement pstmt=con.prepareStatement(q);
				
				pstmt.setString(1,name);
				pstmt.setInt(2,age);
				pstmt.setString(3,city);
				pstmt.setString(4,contact);
				pstmt.setInt(5,updateid);
				pstmt.executeUpdate();		
				 f=true;
				
			}
			catch(Exception e) {
			e.printStackTrace();
			}
		return f;
		
	}
			public  static void countstudent() {
				//JDBC CODE.....
			
				try
				{
				Connection con=CP.createC();
				String q="select count(sid) from studentinfo";
				//Preapared Statement
			Statement stmt=con.createStatement();
			ResultSet set=stmt.executeQuery(q);	
			 int count=set.getRow();
			System.out.println(count);
				
				}
				catch(Exception e) {
					e.printStackTrace();
					}
			
				
}
}


