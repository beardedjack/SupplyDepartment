package supplydepartment.main;

import supplydepartment.*;
import supplydepartment.controller.SupplyDepartmentController;
import supplydepartment.model.Material;
import supplydepartment.view.ConsoleView;

public class Main {

	public static void main(String[] args) {
		Material material = new Material();
		ConsoleView view = new ConsoleView(material);
		SupplyDepartmentController controller = new SupplyDepartmentController(material, view);
		
		controller.insert("box", "intel", 2.5f);

	}

}
