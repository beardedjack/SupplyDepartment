package supplydepartment.view;

import supplydepartment.controller.MaterialController;
import supplydepartment.controller.MaterialsController;
import supplydepartment.controller.MaterialsController.*;
import supplydepartment.model.Material;
import supplydepartment.model.Supplier;

class View<O, M, D> extends BaseView<Material> {
	private final MaterialsController<O, M, D> c = new MaterialsController<O, M, D>();
	protected void insert(D d) {
		c.execute(MaterialsController.O.EDIT, getMaterial(), d);
	}

	
	@Override
	public void materialChanged(Material material) {
	}
	@Override
	public void supplierChanged(Supplier supplier) {
		
		
	}
}


public class ConsoleView {

	public static void main(String[] args) {

		View v = new View();
		v.insert("sdcasd");

		
		

	}

	

}
