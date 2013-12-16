package supplydepartment.model;

import java.util.ArrayList;

public class Supplier {

	private int supplierID;
	private String supplierName;
	private String supplierAccount;
	private String supplierPerson;
	
	public Supplier(int id, String name, String account, String person) {
		this.setSupplierID(id);
		this.setSupplierName(name);
		this.setSupplierAccount(account);
		this.setSupplierPerson(person);
		
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAccount() {
		return supplierAccount;
	}

	public void setSupplierAccount(String supplierAccount) {
		this.supplierAccount = supplierAccount;
	}

	public String getSupplierPerson() {
		return supplierPerson;
	}

	public void setSupplierPerson(String supplierPerson) {
		this.supplierPerson = supplierPerson;
	}
	
	
}
