package supplydepartment.model;

import supplydepartment.model.Supplier;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SupplierList implements Serializable {
	
	private ArrayList<Supplier> sl;
	
	public SupplierList() {
		sl = new ArrayList<Supplier>();
	}

	public void addSupplier(Supplier s) {
		sl.add(s);
	}
	
	public void removeSupplier(int i) {
		sl.remove(i);
	}
	
	public void setSupplier(int i, Supplier s) {
		sl.set(i, s);
	}
	
	public Supplier getSupplier(int i) {
		return sl.get(i);
	}
	
	public void saveSuppliers() throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("Suppliers.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(sl);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if (oos != null) oos.close();
		}
	}
	
	public void loadSuppliers() throws IOException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("Suppliers.dat");
			ois = new ObjectInputStream(fis);
			sl = (ArrayList<Supplier>)ois.readObject();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if (ois != null) ois.close();
		}
	}
	
}
