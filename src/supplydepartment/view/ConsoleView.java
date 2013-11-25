package supplydepartment.view;

import supplydepartment.model.*;

public class ConsoleView implements MaterialObserver {
	
	private String name;
	private String supplier;
	private float cost;
	private Material material;
	
	public ConsoleView(Material material) {
		
		this.material = material;
		material.registerObserver(this);
	}

	@Override
	public void update(String name, String supplier, float cost) {
		this.name = name;
		this.supplier = supplier;
		this.cost = cost;
		displayData(String.format("Materials changed: %s - %s - %.1f", name, supplier, cost));
		
	}

	public void displayData(String text) {
		System.out.printf(text);
	}

}
