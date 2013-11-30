package supplydepartment.controller;

import java.io.IOException;

import supplydepartment.model.*;
import supplydepartment.view.*;

public class SupplyDepartmentController {
	private Material material;
	private Supplier supplier;
	private ConsoleView view;
	
	public SupplyDepartmentController(Material material, Supplier supplier, ConsoleView view) {
		this.material = material;
		this.setSupplier(supplier);
		this.setView(view);
	}
	
	public void insertMaterial(String name, String supplier, float cost) {
		material.insertData(name, supplier, cost);
	}

	public void deleteMaterial(int i) {
		material.deleteData(i);
	}
	
	public void editMaterial(int i, String name, String supplier, float cost) {
		material.editData(i, name, supplier, cost);
	}
	
	public void saveMaterial() throws IOException{
		material.saveData();
	}
	
	public void loadMaterial() throws IOException, ClassNotFoundException {
		material.loadData();
	}
	
	public void insertSupplier(String name, String account, String person) {
		supplier.insertData(name, account, person);
	}
	
	
	public ConsoleView getView() {
		return view;
	}

	public void setView(ConsoleView view) {
		this.view = view;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}
