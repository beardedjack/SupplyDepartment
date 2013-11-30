package supplydepartment.main;

import java.io.IOException;

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
		
		controller.insertMaterial("mainboard", "intel", 152.5f);
		controller.insertMaterial("ssd", "cruicidal", 254.5f);
		controller.insertMaterial("cpu", "intel", 45.8f);
		controller.insertMaterial("hdd", "samsung", 45.1f);
		controller.insertMaterial("ram", "samsung", 9.3f);
		
		try {
			controller.saveMaterial();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		controller.insertSupplier("Intel", "1546854512", "Bearded Jack");
	}

}
