package supplydepartment.model;

import supplydepartment.model.SupplierObserver;

public interface SupplierObservable {
	void registerObserver(SupplierObserver o);
	void removeObserver(SupplierObserver o);
	void notifyObservers();

}
