package supplydepartment.model;

import java.io.Serializable;

public class Material implements Serializable {
	
	private int materialID;
	private String materialName;
	private int materialSupplierID;
	private float materialCost;
	
	
	
	public Material(int id, String name, int supplier, float cost)  {
		
		this.setMaterialID(id);
		this.setMaterialName(name);
		this.setMaterialSupplierID(supplier);
		this.setMaterialCost(cost);
		
	}

	public int getMaterialID() {
		return materialID;
	}

	public void setMaterialID(int materialID) {
		this.materialID = materialID;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public int getMaterialSupplierID() {
		return materialSupplierID;
	}

	public void setMaterialSupplierID(int materialSupplierID) {
		this.materialSupplierID = materialSupplierID;
	}

	public float getMaterialCost() {
		return materialCost;
	}



	public void setMaterialCost(float materialCost) {
		this.materialCost = materialCost;
	}
	
}
