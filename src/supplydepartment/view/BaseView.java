package supplydepartment.view;

import supplydepartment.model.DepartmentSubscriber;
import supplydepartment.model.Material;

public abstract class BaseView<M extends Material> implements DepartmentSubscriber   {

	private M material;
	
	private void subscribe() {
		if (material != null)
			material.subscribe(this);
	}

	
	private void unsubscribe() {
		if (material != null)
			material.unsubscribe(this);
	}

	public void dispose() {
		unsubscribe();
	}
	
	
	
	protected M getMaterial() {
		return material;
	}
	
	public void setMaterial(M material) {
		unsubscribe();
		this.material = material;
		subscribe();
		
	}
	
	
}
