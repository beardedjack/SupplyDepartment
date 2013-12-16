package supplydepartment.model;

import supplydepartment.model.Supplier;
import supplydepartment.view.ConsoleView;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SupplierList implements Serializable {
	
	private static final long serialVersionUID = 2L;
	private List<Supplier> sl;
	private ConsoleView cv;
	
	
	public SupplierList(ConsoleView c) {
		sl = new ArrayList<Supplier>();
		this.cv = c;
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
	
	
	public void showSuppliers() {
		int sid;
		String sname;
		String saccount;
		String sperson;
		
		int n = 0;
		cv.displayData(("Supplier Num\tSupplierID\tSupplier Name\tSupplier Acc\tSupplier Person\n").toString());
		for (Supplier s : sl) {
			sid = s.getSupplierID();
			sname = s.getSupplierName();
			saccount = s.getSupplierAccount();
			sperson = s.getSupplierPerson();
			cv.displayData((n + "\t\t" + sid + "\t\t" + sname + "\t" + saccount + "\t\t" + sperson).toString());
			n++;
		}
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
