package supplydepartment.model;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

import java.util.*;

public class Material {
	
	////
	
	private List<String> materialList = new ArrayList<String>();
	
	////
	
	private final Collection<DepartmentSubscriber> subscribers = new CopyOnWriteArrayList<DepartmentSubscriber>();
	
	private void notifySubscriber(DepartmentSubscriber subscriber) {
		assert subscriber != null;
		subscriber.materialChanged(this);
	}
	
	protected void notifySubscribers() {
		for (final DepartmentSubscriber subscriber: subscribers) 
			notifySubscriber(subscriber);
		
	}

	public void subscribe(DepartmentSubscriber subscriber) {
		if (subscriber == null) 
			throw new NullPointerException("Empty param");
		if (subscribers.contains(subscriber)) 
			throw new IllegalArgumentException("Re-subscribe" + subscriber);
		subscribers.add(subscriber);
		notifySubscriber(subscriber);
	}
	
	public void unsubscribe(DepartmentSubscriber subscriber) {
		if (subscriber == null)
			throw new NullPointerException("Empty param");
		if (!subscribers.contains(subscriber))
			throw new IllegalArgumentException("Unknown subscriber: " +
					subscriber);
		subscribers.remove(subscriber);
	}
	
		
	public List<String> update() {
		return materialList;
	}
	
	public void insert(String s) {
		materialList.add(String.valueOf(s));
	}
	
	
	public void delete(Integer i) {
		materialList.remove(i);
	}
	
	
	
	
}