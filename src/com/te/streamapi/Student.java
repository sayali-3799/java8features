package com.te.streamapi;

public class Student {
	String sname;
	int sid;
	int sage;
	double marks;
	public Student(String sname, int sid, int sage, double marks) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.sage = sage;
		this.marks = marks;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", sage=" + sage + ", marks=" + marks + "]";
	}
	
	
	

}
