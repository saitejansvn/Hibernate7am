package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "employee_table")
public class Employee {

	@Id
	@Column(name = "eid")
	private int empId;
	@Column(name = "ename")
	private String empName;
	@Column(name = "esal")
	private double empSal;

	@Temporal(TemporalType.DATE)
	private Date empDate;
	@Temporal(TemporalType.TIME)
	private Date empTime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date empTimestamp;

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDate=" + empDate
				+ ", empTime=" + empTime + ", empTimestamp=" + empTimestamp + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public Date getEmpDate() {
		return empDate;
	}

	public void setEmpDate(Date empDate) {
		this.empDate = empDate;
	}

	public Date getEmpTime() {
		return empTime;
	}

	public void setEmpTime(Date empTime) {
		this.empTime = empTime;
	}

	public Date getEmpTimestamp() {
		return empTimestamp;
	}

	public void setEmpTimestamp(Date empTimestamp) {
		this.empTimestamp = empTimestamp;
	}

}
