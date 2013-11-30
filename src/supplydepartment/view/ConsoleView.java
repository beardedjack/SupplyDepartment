package supplydepartment.view;

import java.util.ArrayList;

import supplydepartment.model.*;




public class ConsoleView implements MaterialObserver, SupplierObserver {
	
	private String materialName;
	private String supplierName;
	private float materialCost;
	
	private String suppliername;
	private String currentAccount;
	private String contactPerson;
	
	private Material material;
	private Supplier supplier;
	
	public ConsoleView(Material material, Supplier supplier) {
		
		this.material = material;
		this.supplier = supplier;
		material.registerObserver(this);
		supplier.registerObserver(this);
	}

	@Override
	public void materialUpdate(String name, String supplier, float cost) {
		this.materialName = name;
		this.supplierName = supplier;
		this.materialCost = cost;
		displayData(String.format("Materials changed: %s - %s - %.1f \n", name, supplier, cost));
		
	}

	@Override
	public void supplierUpdate(String name, String account, String person) {
		this.suppliername = name;
		this.currentAccount = account;
		this.contactPerson = person;
		displayData(String.format("Supplier changed: %s - %s - %s \n", name, account, person));
		
	}

	/*
	public void printMaterials() {
		
		for (MaterialData p : md) {
			displayData(String.format("%s - %s - %.1f \n", p.name, p.supplier, p.cost));
		}
	}
	*/
	
		
	public void displayData(String text) {
		System.out.printf(text);
	}

}
