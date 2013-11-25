package supplydepartment.model;

import java.util.ArrayList;
import java.util.List;
import supplydepartment.model.MaterialObserver;
import supplydepartment.model.MaterialObservable;

public class Material implements MaterialObservable {

	private List<MaterialObserver> materialObservers;
	private String name;
	private String supplier;
	private float cost;
	
	public Material() {
		materialObservers = new ArrayList<MaterialObserver>();
	}
	
	@Override
	public void registerObserver(MaterialObserver o) {
		materialObservers.add(o);
	}
	
	@Override
	public void removeObserver(MaterialObserver o) {
		materialObservers.remove(o);
	}
	
	@Override
	public void notifyObservers() {
		for (MaterialObserver observer : materialObservers) {
			observer.materialUpdate(name, supplier, cost);
		}
	}
	
	public void insertData(String name, String supplier, float cost) {
		this.name = name;
		this.supplier = supplier;
		this.cost = cost;
		notifyObservers();
	}

}
