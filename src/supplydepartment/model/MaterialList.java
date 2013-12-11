package supplydepartment.model;

import supplydepartment.controller.SupplyDepartmentController;
import supplydepartment.model.Material;
import supplydepartment.view.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MaterialList implements Serializable {
		
	private static final long serialVersionUID = 1L;
	private ArrayList<Material> ml;
	private ConsoleView cv;
	
	public MaterialList(ConsoleView c) {
		ml = new ArrayList<Material>();
		this.cv = c;
		
	}
	
	public void addMaterial(Material m) {
		ml.add(m);
	}
	
	public void removeMaterial(int i) {
		
		ml.remove(i);
	}
	
	public void setMaterial(int i, Material m) {
		ml.set(i, m);
	}
	
	public Material getMaterial(int i) {
		return ml.get(i);
	}
	
	public void showMaterials() {
		ListIterator<Material> i = ml.listIterator();
		
		Material m = null;
		
		int mid;
		String mname;
		int msupid;
		float mcost;
		cv.displayData("ddasdasdASDAsd");
		
		while (i.hasNext()) {
			
			mid = m.getMaterialID();
			mname = m.getMaterialName();
			msupid = m.getMaterialSupplierID();
			mcost = m.getMaterialCost();
			
			cv.displayData((mid + mname + msupid + mcost).toString());
			
			m = i.next();
			
			
		}
		
	}
	
	
	
	public void saveMaterials() throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("Materials.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ml);
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
			if (oos != null) oos.close();
		}
	}
	
	public void loadMaterials() throws IOException, ClassNotFoundException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("Materials.dat");
			ois = new ObjectInputStream(fis);
			ml = (ArrayList<Material>)ois.readObject();
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		finally {
			if (ois != null) ois.close();
		}
	}

	
	
}
