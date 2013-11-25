package supplydepartment.model;

import java.util.ArrayList;
import java.util.List;
import supplydepartment.model.SupplierObserver;
import supplydepartment.model.SupplierObservable;

public class Supplier implements SupplierObservable {

	private List<SupplierObserver> supplierObservers;
	private String name;
	private String account;
	private String person;
	
	public Supplier() {
		supplierObservers = new ArrayList<SupplierObserver>();
	}
	
	@Override
	public void registerObserver(SupplierObserver o) {
		supplierObservers.add(o);
	}
	
	@Override
	public void removeObserver(SupplierObserver o) {
		supplierObservers.remove(o);
	}
	
	@Override
	public void notifyObservers() {
		for (SupplierObserver observer : supplierObservers) {
			observer.supplierUpdate(name, account, person);
		}
	}
	
	public void insertData(String name, String account, String person) {
		this.name = name;
		this.account = account;
		this.person = person;
		notifyObservers();
	}
	
}
