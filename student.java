package com.student.manage;

public class student {
private int studentid;
private String studentname;
private int studentage;
private  String studentcity;
private String studentcontact;
public student(int studentid, String studentname, int studentage, String studentcity, String studentcontact) {
	super();
	this.studentid = studentid;
	this.studentname = studentname;
	this.studentage = studentage;
	this.studentcity = studentcity;
	this.studentcontact = studentcontact;
}
public student(String studentname, int studentage, String studentcity, String studentcontact) {
	super();
	this.studentname = studentname;
	this.studentage = studentage;
	this.studentcity = studentcity;
	this.studentcontact = studentcontact;
}
public student() {
	super();
}
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public int getStudentage() {
	return studentage;
}
public void setStudentage(int studentage) {
	this.studentage = studentage;
}
public String getStudentcity() {
	return studentcity;
}
public void setStudentcity(String studentcity) {
	this.studentcity = studentcity;
}
public String getStudentcontact() {
	return studentcontact;
}
public void setStudentcontact(String studentcontact) {
	this.studentcontact = studentcontact;
}
@Override
public String toString() {
	return "student [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage
			+ ", studentcity=" + studentcity + ", studentcontact=" + studentcontact + "]";
}


}
