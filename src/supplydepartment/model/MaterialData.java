package supplydepartment.model;

import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;;

public class MaterialData implements Serializable {
	public String name; // private!!!!!!
	public String supplier;
	public float cost;
	
	public ArrayList<MaterialData> md;
	
	public MaterialData() {
		md = new ArrayList<MaterialData>();
	}	
	
	public void insert(String n, String s, float c) {
		this.name = n;
		this.supplier = s;
		this.cost = c;
		md.add(this);
	}
	
	public void delete(int i) {
		md.remove(i);
	}
	
	public void edit(int i, String n, String s, float c) {
		this.name = n;
		this.supplier = s;
		this.cost = c;
		md.set(i, this);
	}
	
	public void save() throws IOException {
		FileOutputStream fos = new FileOutputStream("Material.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject((Object)md);
	}
	
	public void load() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("Material.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		MaterialData md = (MaterialData)ois.readObject();
	}
	
}
