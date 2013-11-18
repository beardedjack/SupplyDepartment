package supplydepartment.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Supplier {

	////
	
		private List<String> supplierList = new ArrayList<String>();
		
		////
		
		private final Collection<DepartmentSubscriber> subscribers = new CopyOnWriteArrayList<DepartmentSubscriber>();
		
		private void notifySubscriber(DepartmentSubscriber subscriber) {
			assert subscriber != null;
			subscriber.supplierChanged(this);
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
			return supplierList;
		}
		
		public void insert(String s) {
			supplierList.add(String.valueOf(s));
		}
		
		
		public void delete(Integer i) {
			supplierList.remove(i);
		}
	
	
	
}
