package supplydepartment.model;

public interface MaterialObserver {
	void materialUpdate (String materialName, String materialSupplier, float materialCost);
}
