package supplydepartment.controller;

import supplydepartment.model.Material;

public class MaterialsController<O, M, D> implements MaterialController {
	public enum O {INSERT, EDIT, REMOVE, UPDATE};
	public void execute(O operation, Material material, D data ) {
		if (operation == null) throw new NullPointerException("Empty param operation");
		if (material == null) throw new NullPointerException("Empty param material");
		
		
		switch (operation) {
		case INSERT: 
			material.insert((String)data);
			break;
		case REMOVE:
			material.delete((Integer)data);
			break;
		case UPDATE:
			material.update();
			break;
		default:
			throw new IllegalArgumentException("Unknown action" + 
							operation);
		}
	}
	@Override
	public void execute(Object operation, Object material, Object data) {
		// TODO Автоматически созданная заглушка метода
		
	}
	
	
	
}
