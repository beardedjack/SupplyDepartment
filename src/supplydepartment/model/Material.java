package supplydepartment.model;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

import java.util.*;

public class Material {
	
	////
	
	private List<String> MaterialList = new ArrayList<String>();
	
	////
	
	private final Collection<IDepartmentSubscriber> subscribers = new CopyOnWriteArrayList<IDepartmentSubscriber>();
	
	private void notifySubscriber(IDepartmentSubscriber subscriber) {
		assert subscriber != null;
		subscriber.materialChanged(this);
	}
	
	protected void notifySubscribers() {
		for (final IDepartmentSubscriber subscriber: subscribers) 
			notifySubscriber(subscriber);
		
	}

	public void subscribe(IDepartmentSubscriber subscriber) {
		if (subscriber == null) 
			throw new NullPointerException("Empty param");
		if (subscribers.contains(subscriber)) 
			throw new IllegalArgumentException("Re-subscribe" + subscriber);
		subscribers.add(subscriber);
		notifySubscriber(subscriber);
	}
	
	public void unsubscribe(IDepartmentSubscriber subscriber) {
		if (subscriber == null)
			throw new NullPointerException("Empty param");
		if (!subscribers.contains(subscriber))
			throw new IllegalArgumentException("Unknown subscriber: " +
					subscriber);
		subscribers.remove(subscriber);
	}
	
		

	public void insertMaterial(String s) {
		MaterialList.add(String.valueOf(s));
	}
	
	public List<String> getAllMaterials() {
		return MaterialList;
	}
	
}