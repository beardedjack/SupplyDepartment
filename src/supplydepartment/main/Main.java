package supplydepartment.main;

import supplydepartment.*;
import supplydepartment.controller.SupplyDepartmentController;
import supplydepartment.model.Material;
import supplydepartment.model.Supplier;
import supplydepartment.view.ConsoleView;

public class Main {

	public static void main(String[] args) {
		Material material = new Material();
		Supplier supplier = new Supplier();
		ConsoleView view = new ConsoleView(material, supplier);
		SupplyDepartmentController controller = new SupplyDepartmentController(material, supplier, view);
		
		controller.insertMaterial("box", "intel", 2.5f);
		controller.insertSupplier("Intel", "1546854512", "Bearded Jack");
		

	}

}
