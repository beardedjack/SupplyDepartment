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
import java.util.Scanner;

import sun.org.mozilla.javascript.regexp.SubString;
import supplydepartment.controller.*;
import supplydepartment.model.*;

public class ConsoleView {
	
	
	
	private static SupplyDepartmentController sdc; // = new SupplyDepartmentController(m, s, this);
	
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		
		setSdc(new SupplyDepartmentController(new ConsoleView()));
		
		Scanner i = new Scanner(System.in);
		
//		BufferedReader ir = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter o = new BufferedWriter(new OutputStreamWriter(System.out));
//		PrintWriter o = new PrintWriter(System.out, true);
		char choice;
		
		int n;
		
		int materialID;
		String materialName;
		int materialSupplierID;
		float materialCost;
		
		
		MainMenu: {
			while (true) {
				System.out.println("_______________________ Supply Department _________________________");
				System.out.println("Usage:\n ''1'' - materials menu\n ''2'' - suppliers menu\n ''3'' - exit\n"
								 + "___________________________________________________________________");
				
				
				do {
					System.out.println("Enter a choice:");
					
					
					choice = (i.next()).charAt(0);
				}
				while (choice < '1' || choice > '3');
				
				
				
				switch (choice) {
				case '1':
					MaterialsMenu: {
						while (true) {
							System.out.println("_______________________ Materials menu _________________________");
							System.out.println("Usage:\n ''1'' - show materials\n ''2'' - add material\n ''3'' - edit material\n "
										+ "''4'' - delete material\n ''5'' - save materials to file\n "
										+ "''6'' - load materials from file\n ''7'' - return to main menu\n"
										     + "________________________________________________________________");
						
							do {
								System.out.println("Enter a choice:");
								choice = (i.next()).charAt(0);
							}
							while (choice < '1' || choice > '7');

							switch (choice) {
							case '1':
								System.out.println("Materials:");	
								sdc.showMaterials();
								break;
							case '2':
								System.out.print("Adding material:\n");
								System.out.print("Material ID?:\n");
								materialID = i.nextInt();
								System.out.print("Material Name?:\n");
								materialName = i.next();
								System.out.print("Material Supplier ID?:\n");
								materialSupplierID = i.nextInt();
								System.out.print("Material cost?:\n");
								materialCost = i.nextFloat();
								sdc.insertMaterial(materialID, materialName, materialSupplierID, materialCost);
								break;
							case '3':
								System.out.print("Editing material:\n MaterialNum?: \n");
								n = i.nextInt();
								System.out.print("Old Material Data:\nMaterial Num\tMaterialID\tMaterial Name\tSupplierID\tMaterialCost\n");
								sdc.showMaterial(n);
								System.out.print("New Material Data:\n");
								System.out.print("MaterialID?: \n");
								materialID = i.nextInt();
								System.out.print("Material Name?:\n");
								materialName = i.next();
								System.out.print("Material Supplier ID?:\n");
								materialSupplierID = i.nextInt();
								System.out.print("Material cost?:\n");
								materialCost = i.nextFloat();
								sdc.editMaterial(n, materialID, materialName, materialSupplierID, materialCost);
								break;
							case '4':
								System.out.print("Deleting material:\n MaterialNum?: \n");
								n = i.nextInt();
								sdc.deleteMaterial(n);
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
