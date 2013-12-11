package supplydepartment.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.CharBuffer;

import supplydepartment.controller.*;
import supplydepartment.model.*;

class MainMenu {
	void mainMenu() throws IOException {
		BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter o = new BufferedWriter(new OutputStreamWriter(System.out));
		PrintWriter o = new PrintWriter(System.out, true);
		char choice;
		o.println("======================= Supply Department =========================");
		o.println("Usage:\n ''1'' - materials menu\n ''2'' - suppliers menu\n ''3'' - exit\n");
		
		do {
			o.println("Enter a choice:");
			choice = (char) i.read();
		}
		while (choice < '1' || choice > '3');
		
		
		
		switch (choice) {
		case '1':
			new MaterialsMenu().materialsMenu();
			break;
		}
		
	}
}

//////////////////////////////////////////////////////////////////

class MaterialsMenu {
	BufferedReader i;
	PrintWriter o;
	char choice;
	
	public MaterialsMenu() {
		i = new BufferedReader(new InputStreamReader(System.in));
		o = new PrintWriter(System.out, true);
	}
	
	void materialsMenu() throws IOException {
		
		while (true) {
		
		materialsmenu: {
		
		o.println("======================= Materials menu =========================");
		o.println("Usage:\n ''1'' - show materials\n ''2'' - add material\n ''3'' - edit material\n "
				+ "''4'' - delete material\n ''5'' - save materials to file\n "
				+ "''6'' - load materials from file\n ''7'' - return to main menu\n");
		
		do {
			o.println("Enter a choice:");
			choice = (char) i.read();
		}
		while (choice < '1' || choice > '7');
		
		switch (choice) {
		case '1':
			o.println("Materials:");	
			new ConsoleView().getSdc().showMaterials();
			break materialsmenu;
		case '2':
			addMaterial();
			break;
		case '3':
			editMaterial();
			break;
		case '4':
			deleteMaterial();
			break;
		case '5':
			saveMaterials();
			break;
		case '6':
			loadMaterials();
			break;
		case '7':
			new MainMenu().mainMenu();
			break;
		}
	
	}	
	
	}	
		
	}
	
	void showMaterials() throws IOException {
		
		/*
		o.println("Materials:");	
		
		new ConsoleView().getSdc().showMaterials();
		*/
		
		
	}
	
	void addMaterial() {
		
	}
	
	void editMaterial() {
		
	}
	
	void deleteMaterial() {
		
	}
	
	void saveMaterials() {
		
	}
	
	void loadMaterials() {
		
	}
	
	
}

//////////////////////////////////////////////////////////////////

class SuppliersMenu {
	BufferedReader i;
	PrintWriter o;
	char choice;
	public SuppliersMenu() {
		i = new BufferedReader(new InputStreamReader(System.in));
		o = new PrintWriter(System.out, true);
	}
	
	void materialsMenu() throws IOException {
		o.println("======================= Suppliers menu =========================");
		o.println("Usage:\n ''1'' - show suppliers\n ''2'' - add supplier\n ''3'' - edit supplier\n "
				+ "''4'' - delete supplier\n ''5'' - save supplierss to file\n "
				+ "''6'' - load supplierss from file\n ''7'' - return to main menu\n");
		
		do {
			o.println("Enter a choice:");
			choice = (char) i.read();
		}
		while (choice < '1' || choice > '7');
		
		
	}
}

//////////////////////////////////////////////////////////////////

public class ConsoleView {
	
	
	
	private static SupplyDepartmentController sdc; // = new SupplyDepartmentController(m, s, this);
	
	
	
	
	public static void main(String[] args) throws IOException  {
		
		setSdc(new SupplyDepartmentController(new ConsoleView()));
		new MainMenu().mainMenu();
		}
	
	public void displayData(String text) {
		System.out.println(text);
	}

	public static SupplyDepartmentController getSdc() {
		return sdc;
	}

	public static void setSdc(SupplyDepartmentController sdc) {
		ConsoleView.sdc = sdc;
	}

	

}
