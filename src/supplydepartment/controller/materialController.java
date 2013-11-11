package supplydepartment.controller;

import supplydepartment.model.Material;

public class materialController implements IMaterialController {
	public enum O {ADD, EDIT, REMOVE};
	public void execute(O operation, Material material) {
		switch (operation) {
		case ADD: 
			material.insertMaterial("ou");
			break;
		default:
			throw new IllegalArgumentException("Неизвестное действие" + 
							operation);
		}
	}
	@Override
	public void execute(O operation, Object material) {
		// TODO Автоматически созданная заглушка метода
		
	}
}
