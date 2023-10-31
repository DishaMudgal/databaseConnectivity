
package com.student.manage;
import java.io.*;
public class start {

	public static void main(String[] args) throws IOException
	{
		System.out.println("welcome to student management app");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) 
		{
			System.out.println("PRESS 1 TO ADD student");
			System.out.println("PRESS 2 TO DELETE student");
			System.out.println("PRESS 3 TO DISPLAY student");
			System.out.println("PRESS 4 TO UPDATE STUDENT INFORMATION");
			System.out.println("PRESS 5 TO count STUDENT");
			System.out.println("PRESS 6 TO EXIT APP");
			int c=Integer.parseInt(br.readLine());
			if(c==1)
			{
				//add student
				System.out.println("enter name:");
				String name=br.readLine();
				
				System.out.println("enter age:");
				int age=Integer.parseInt(br.readLine());
				
				
				System.out.println("enter city");
				String city=br.readLine();
				
				System.out.println("enter contact:");
			    String contact=br.readLine();
				
				// create student object to store student info
				student stu= new student(name,age,city,contact);
				boolean answer=studentDao.insertStudentToDB(stu);
				if(answer) {
					System.out.println("student infomation is successfully added");
				}else {
					System.out.println("Something went wrong");
				}
				System.out.println(stu);
				
				
				
			}else if(c==2) 
			{
				//delete student
				System.out.println("enter the student id to delete");
				int userId=Integer.parseInt(br.readLine());
				boolean answer=studentDao.deleteStudentFromDB(userId);
				if(answer) {
					System.out.println("student is deleted");
				}else {
					System.out.println("Something went wrong");
				}
				
			}else if(c==3)
			{
				//dispaly student
				
				studentDao.showAllStudentInfo();
				
			
			}else if(c==4)
			{
				System.out.println("enter the student id in which you want to update the student information");
				int updateid=Integer.parseInt(br.readLine());
			boolean answer=studentDao.UpdateStudentInfo(updateid);
			if(answer) {
				System.out.println("student infomation is successfully updated");
			}else {
				System.out.println("Something went wrong");
			}
				
			}else if(c==5) 
			{
			studentDao.countstudent();
				
			}else if(c==6){
				
				break;
			}
			else {
				System.out.println("you enter wrong value");
			}
		}
		System.out.println("thankyou for using my app");
		System.out.println("see you soon");
		
	}

}
