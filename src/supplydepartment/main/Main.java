package supplydepartment.main;

import supplydepartment.*;
import supplydepartment.controller.SupplyDepartmentController;
import supplydepartment.model.Material;
import supplydepartment.model.Supplier;
import supplydepartment.view.ConsoleView;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main {

	public static void main(String[] args) throws IOException {
		Material material = new Material();
		Supplier supplier = new Supplier();
		ConsoleView view = new ConsoleView(material, supplier);
		SupplyDepartmentController controller = new SupplyDepartmentController(material, supplier, view);
		
		
		
		
		controller.insertMaterial("box", "intel", 2.5f);
		controller.insertSupplier("Intel", "1546854512", "Bearded Jack");
		
		/*

		FileOutputStream fos = new FileOutputStream("Material.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(material);
		oos.flush();
		oos.close();
		
		
		
		
		FileInputStream fis = new FileInputStream("Material.out");
		ObjectInputStream oin = new ObjectInputStream(fis);
		Material material = (Material)oin.readObject();
		
		*/
	}

}
