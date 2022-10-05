package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="emp_tab")
public class Employee {
	@Id
	@Column(name = "empid")
	private int employeeId;
	@Column(name = "empname")
	private String employeeName;
	@Column(name = "empsal")
	private double employeeSal;

//	@Column(name="Date")
	@Temporal(TemporalType.DATE)
	private Date employeejoiningDate;
	// @Column(name="time")
	@Temporal(TemporalType.TIME)
	private Date employeejoiningTime;
	// @Column(name="timestamp")
	@Temporal(TemporalType.TIMESTAMP)

	private Date employeeTimestamp;

	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSal() {
		return employeeSal;
	}

	public void setEmployeeSal(double employeeSal) {
		this.employeeSal = employeeSal;
	}

	public Date getEmployeejoiningDate() {
		return employeejoiningDate;
	}

	public void setEmployeejoiningDate(Date employeejoiningDate) {
		this.employeejoiningDate = employeejoiningDate;
	}

	public Date getEmployeejoiningTime() {
		return employeejoiningTime;
	}

	public void setEmployeejoiningTime(Date employeejoiningTime) {
		this.employeejoiningTime = employeejoiningTime;
	}

	public Date getEmployeeTimestamp() {
		return employeeTimestamp;
	}

	public void setEmployeeTimestamp(Date employeeTimestamp) {
		this.employeeTimestamp = employeeTimestamp;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSal=" + employeeSal
				+ ", employeejoiningDate=" + employeejoiningDate + ", employeejoiningTime=" + employeejoiningTime
				+ ", employeeTimestamp=" + employeeTimestamp + "]";
	}

}
