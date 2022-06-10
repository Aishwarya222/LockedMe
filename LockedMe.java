package LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe {
	static String path = "C:\\Users\\Aishwarya\\MyJavaProject\\Complete Java\\src\\main\\java\\LockedMe";
	public static void displayMenu()
	{
		System.out.println("*********************");
		System.out.println("Welcome to LockedMe");
		System.out.println("Developed by : Aishwarya");
		System.out.println("*********************");
		System.out.println("\t\t1.Display all the files");
		System.out.println("\t\t2.Add New File");
		System.out.println("\t\t3.Delete File");
		System.out.println("\t\t4.Search File");
		System.out.println("\t\t5.Exit");
	}
	public static void getAllFiles()
	{
		File directoryPath = new File(path);
		  //Creating a File object for directory
	      //List of all files and directories
	      String contents[] = directoryPath.list();
	      System.out.println("List of files and directories in the specified directory:");
	      for(int i=0; i<contents.length; i++) {
	         System.out.println(contents[i]);
	      }
	}
	public static void addnewFile()
	{
		System.out.println("Enter the file name to be created");
		Scanner sc = new Scanner(System.in);
		String newFile = sc.nextLine();
		  try {
	            File file = new File(path+"\\"+newFile);
	            if(file.createNewFile())
	                System.out.println("File creation successfull");
	            else
	                System.out.println("Error while creating File, file already exists in specified path");
	        }
	        catch(IOException io) {
	            io.printStackTrace();
	        }
	}
	public static void deleteFile()
	{
		System.out.println("Enter the file name to be deleted");
		Scanner sc = new Scanner(System.in);
		String removefile = sc.nextLine();
		 File file = new File(path+"\\"+removefile);

		if (file.delete()) {
        System.out.println("File deleted successfully");
		}
		else {
        System.out.println("Failed to delete the file");
    }
	}
	public static void searchFile()
	{
	
	}
	
}
