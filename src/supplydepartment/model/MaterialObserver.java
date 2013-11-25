package supplydepartment.model;

public interface MaterialObserver {
	void update (String materialName, String materialSupplier, float materialCost);
}
