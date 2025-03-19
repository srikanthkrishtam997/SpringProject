package com.java.core.streams;

public class Employe {
	private String empName;
	private int empId;
	private Address address;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employe(String empName, int empId, Address address) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employe [empName=" + empName + ", empId=" + empId + ", address=" + address + "]";
	}
	
	

}
