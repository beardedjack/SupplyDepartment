package supplydepartment.controller;

import supplydepartment.model.*;
import supplydepartment.view.*;

public class SupplyDepartmentController {
	private Material material;
	private ConsoleView view;
	
	public SupplyDepartmentController(Material material, ConsoleView view) {
		this.material = material;
		this.setView(view);
	}
	
	public void insert(String name, String supplier, float cost) {
		material.insertData(name, supplier, cost);
	}

	public ConsoleView getView() {
		return view;
	}

	public void setView(ConsoleView view) {
		this.view = view;
	}

}
