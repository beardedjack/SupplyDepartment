package supplydepartment.controller;

import supplydepartment.controller.materialController.O;
import supplydepartment.model.Material;

public interface IMaterialController<M> {
	void execute(O operation, M material);
}
