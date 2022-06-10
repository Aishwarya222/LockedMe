package LockedMe;

import java.util.Scanner;

public class ClientApp {
	public static void main(String[] args) {
		LockedMe.displayMenu();
		System.out.println("Enter Choice");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1: LockedMe.getAllFiles();
		break;
		case 2: LockedMe.addnewFile();
		break;
		case 3: LockedMe.deleteFile();
		break;
		case 4: LockedMe.searchFile();
		break;
		case 5: System.exit(0);
		break;
		}
		
	}

}
