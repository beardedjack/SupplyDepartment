package supplydepartment.controller;

import java.io.IOException;
import java.util.ListIterator;

import sun.org.mozilla.javascript.ObjToIntMap.Iterator;
import sun.security.util.Length;
import supplydepartment.model.*;
import supplydepartment.view.*;

public class SupplyDepartmentController {
	private MaterialList material;
	private SupplierList supplier;
	private ConsoleView view;
	
	public SupplyDepartmentController(ConsoleView view) {
		this.material = new MaterialList(view);
		this.supplier = new SupplierList();
		this.view = view;
	}
	
	
	public SupplyDepartmentController(MaterialList material, SupplierList supplier, ConsoleView view) {
		this.material = material;
		this.supplier = supplier;
		this.view = view;
	}
	
	public void insertMaterial(int id, String name, int supplier, float cost) {
		Material m = new Material(id, name, supplier, cost);
		this.material.addMaterial(m);
		view.displayData("Material added!");
	}
	
	public void editMaterial(int i, int id, String name, int supplier, float cost) {
		Material m = material.getMaterial(i);
		m.setMaterialID(id);
		m.setMaterialName(name);
		m.setMaterialSupplierID(supplier);
		m.setMaterialCost(cost);
		this.material.setMaterial(i, m);
		view.displayData("Material updated!");
	}
	
	public void showMaterial(int i) {
		Material m = material.getMaterial(i);
		view.displayData((m.getMaterialID() + " " + m.getMaterialName() + " " + m.getMaterialCost()).toString());
	}
	
	public void showMaterials() {
		material.showMaterials();
		
	}
	
	public void deleteMaterial(int i) {
		material.removeMaterial(i);
		view.displayData("Material deleted!");
	}
	
	public void saveMaterials() throws IOException {
		material.saveMaterials();
		view.displayData("Materials saved!");
	}
	
	public void loadMaterials() throws IOException, ClassNotFoundException {
		material.loadMaterials();
		view.displayData("Materials loaded!");
	}
	
	public void insertSupplier(int id, String name, String account, String person) {
		Supplier s = new Supplier(id, name, account, person);
		this.supplier.addSupplier(s);
		view.displayData("Supplier added!");
	}
	
	public void editMaterial(int i, int id, String name, String account, String person) {
		Supplier s = supplier.getSupplier(i);
		s.supplierID = id;
		s.supplierName = name;
		s.supplierAccount = account;
		s.supplierPerson = person;
		this.supplier.setSupplier(i, s);
		view.displayData("Supplier updated!");
	}
	
	public void showSupplier(int i) {
		Supplier s = supplier.getSupplier(i);
		view.displayData((s.supplierID + " " + s.supplierName + " " + s.supplierAccount + " " + s.supplierPerson).toString());
	}
	
	public void deleteSupplier(int i) {
		supplier.removeSupplier(i);
		view.displayData("Supplier deleted!");
	}
	
	public void saveSuppliers() throws IOException {
		supplier.saveSuppliers();
		view.displayData("Suppliers saved!");
	}
	
	public void loadSuppliers() throws IOException {
		supplier.loadSuppliers();
		view.displayData("Suppliers loaded!");
	}
	
}
