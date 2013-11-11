package supplydepartment.model;

public interface IDepartmentSubscriber {
	void materialChanged(Material material);
	void supplierChanged(Supplier supplier);
}
