package com.ojas;

public class MyEmp {


	private int empID;
	private String empName;
	private String empAddress;
	private String empGender;
	
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	@Override
	public String toString() {
		return "MyEmp [empID=" + empID + ", empName=" + empName + ", empAddress=" + empAddress + ", empGender="
				+ empGender + "]";
	}
	
	
	
	
}
