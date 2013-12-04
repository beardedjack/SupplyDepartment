package supplydepartment.main;

import java.io.IOException;

import supplydepartment.controller.*;
import supplydepartment.model.*;
import supplydepartment.view.*;




public class Main {

	public static void main(String[] args) throws IOException {
		MaterialList m = new MaterialList();
		SupplierList s = new SupplierList();
		ConsoleView v = new ConsoleView();
		SupplyDepartmentController sdc = new SupplyDepartmentController(m, s, v);
		sdc.insertMaterial(1, "cpu", 1, 100);
		sdc.showMaterial(0);
		sdc.saveMaterials();

	}
}