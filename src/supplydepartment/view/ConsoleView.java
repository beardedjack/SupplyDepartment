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

public class ConsoleView {
	
	
	
	private static SupplyDepartmentController sdc; // = new SupplyDepartmentController(m, s, this);
	
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		
		setSdc(new SupplyDepartmentController(new ConsoleView()));
		
		BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter o = new BufferedWriter(new OutputStreamWriter(System.out));
		PrintWriter o = new PrintWriter(System.out, true);
		char choice;
		
		int materialID;
		String materialName;
		int materialSupplierID;
		float materialCost;
		
		
		MainMenu: {
			while (true) {
				o.println("======================= Supply Department =========================");
				o.println("Usage:\n ''1'' - materials menu\n ''2'' - suppliers menu\n ''3'' - exit\n"
						+ "===================================================================");
				
				
				do {
					o.println("Enter a choice:");
					choice = (char) i.read();
				}
				while (choice < '1' || choice > '3');
				o.flush();
				
				
				switch (choice) {
				case '1':
					MaterialsMenu: {
						while (true) {
							o.println("======================= Materials menu =========================");
							o.println("Usage:\n ''1'' - show materials\n ''2'' - add material\n ''3'' - edit material\n "
										+ "''4'' - delete material\n ''5'' - save materials to file\n "
										+ "''6'' - load materials from file\n ''7'' - return to main menu\n"
										+ "================================================================");
						
							do {
								o.println("Enter a choice:");
								choice = (char) i.read();
							}
							while (choice < '1' || choice > '7');
							o.flush();
							
							
							switch (choice) {
							case '1':
								o.println("Materials:");	
								sdc.showMaterials();
								break;
							case '2':
								o.println("Adding material:");
								o.println("Material ID?");
								materialID = i.read();
								o.println("Material Name?");
								materialName = i.readLine();
								o.println("Material Supplier ID?");
								materialSupplierID = i.read();
								o.println("Material cost?");
								materialCost = (float)i.read();
								
								sdc.insertMaterial(materialID, materialName, materialSupplierID, materialCost);
								
								break;
							case '3':
								
								break;
							case '4':
								
								break;
							case '5':
								sdc.saveMaterials();
								break;
							case '6':
								sdc.loadMaterials();
								break;
							case '7':
								break MaterialsMenu;
							}
							
							
							
							
							
							
						}
					} // MainMenu = 1
					break;
					
				case '2':
					SuppliersMenu: {
					
					} // MaiMenu = 2;
				
				case '3': break MainMenu;
				
				
				} // choice MainMenu
			}
		} // MainMenu
		
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
