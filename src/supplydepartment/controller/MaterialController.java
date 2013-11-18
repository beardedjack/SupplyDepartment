package supplydepartment.controller;



import supplydepartment.model.Material;

public interface MaterialController<O, M, D> {
	void execute(O operation, M material, D data);
}
