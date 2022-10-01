package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//hibernate 
@Table(name = "stud_tab")
public class Student {

	//3 COLUMNS 
	//no of columns==no of variables 3 col=3 variables
	@Id//Pk
	@Column(name="sid")
	private Integer studentId;
	@Column(name="sname")
	private String studentName;
	@Column(name="sfee")
	private double studentFee;
	//Defalut constructor
	public Student() {
		super();
	}
	//setters and getters
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentFee() {
		return studentFee;
	}
	public void setStudentFee(double studentFee) {
		this.studentFee = studentFee;
	}
	//to string 
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFee=" + studentFee + "]";
	}
	
	
	
}
