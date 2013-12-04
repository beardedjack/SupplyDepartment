package supplydepartment.model;

public class Material {
	
	public int materialID;
	public String materialName;
	public int materialSupplierID;
	public float materialCost;
	
	public Material(int id, String name, int supplier, float cost) {
		
		this.materialID = id;
		this.materialName = name;
		this.materialSupplierID = supplier;
		this.materialCost = cost;
		
	}
	
}
