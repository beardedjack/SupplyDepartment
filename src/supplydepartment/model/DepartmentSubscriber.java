package supplydepartment.model;

public interface DepartmentSubscriber {
	void materialChanged(Material material);
	void supplierChanged(Supplier supplier);
}
