package supplydepartment.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import supplydepartment.model.MaterialObserver;
import supplydepartment.model.MaterialObservable;
import supplydepartment.model.MaterialData;

public class Material implements MaterialObservable {

	
	
	private List<MaterialObserver> materialObservers;
	
	private String name;
	private String supplier;
	private float cost;
	
	private MaterialData md;
	
	
	public Material() {
		materialObservers = new ArrayList<MaterialObserver>();
		md = new MaterialData();
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
		md.insert(name, supplier, cost);
		notifyObservers();
	}

	public void deleteData(int i) {
		md.delete(i);
		notifyObservers();
	}
	
	public void editData(int i, String name, String supplier, float cost) {
		this.name = name;
		this.supplier = supplier;
		this.cost = cost;
		md.edit(i, name, supplier, cost);
		notifyObservers();
	}
	
	public void saveData() throws IOException {
		md.save();
		notifyObservers();
	}
	
	public void loadData() throws IOException, ClassNotFoundException {
		md.load();
		notifyObservers();
	}
	
	
	
}
