package supplydepartment.model;

import supplydepartment.model.MaterialObserver;

public interface MaterialObservable {
	void registerObserver(MaterialObserver o);
	void removeObserver(MaterialObserver o);
	void notifyObservers();
}
