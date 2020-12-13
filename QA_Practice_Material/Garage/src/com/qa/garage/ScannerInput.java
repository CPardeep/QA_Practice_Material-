package com.qa.garage;
import java.util.Scanner;

public class ScannerInput {
	private Scanner scan = new Scanner(System.in);
	
	public String getString() {
		return scan.nextLine();
	}
	
	public int getNumber() {
		int num = 0;
		try {
			num = Integer.parseInt(getString());
		}
		catch (NumberFormatException e){
			System.out.println("Please try again!");
			getNumber();
		}
		return num;
	}
	
	
}
