package supplydepartment.model;

import supplydepartment.model.Material;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class MaterialList implements Serializable {
	
	private ArrayList<Material> ml;
	
	public MaterialList() {
		ml = new ArrayList<Material>();
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
	
	public void loadMaterials() throws IOException {
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
