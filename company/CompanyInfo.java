package org.company;

public class CompanyInfo {
	public void companyName() {
System.out.println("Company Name");		
	}
	public void companyId() {
		System.out.println("Company ID");
	}
	public void companyAddress() {
		System.out.println("Company Address");
		
	}
 public static void main(String []args) {
	 
	 CompanyInfo e=new CompanyInfo();
	 e.companyAddress();
	 e.companyName();
	 e.companyId();
	 
 }
}
