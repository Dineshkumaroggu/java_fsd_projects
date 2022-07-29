package virtualkey;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileReader;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FIilehandling {
	
	 public  void start(){
		 
	        System.out.println("\nPlease select one of the below Business level operations");
	        System.out.println("1.Create file and add content to the file");
	        System.out.println("2.Delete file From directory");
	        System.out.println("3.Search file and Showing content in it");
	        System.out.println("4.Adding content to Already exit file");
	        System.out.println("5.Back to main menu");
	        
	        @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
	           String key=sc.nextLine();
	            
	            switch(key){
	                case "1":
	                    try{
	                    	  Create();
	                		 }
	                    
	                	 catch(Exception e) {
	                		 System.out.println("Error:"+e);
	                	 };
	                	
	   	                  break;
	                case "2":
	                    Delete();
	                    start();
	                    break;
	                case "3":
	                     Search();
	                     start();
	                    break;
	                case "4":
	                	 try{
	                		 Add();
	                		 }
	                	 catch(Exception e) {
	                		 System.out.println("Error:"+e);
	                	 };
	                	
	                	 break;
	                case "5":
	                	 System.out.println("Thanks For using this Bussiness level operations");
	                	 Virtualkeyrepo ob=new Virtualkeyrepo();
	                	 ob.startmain();
	                	 break;
	                default:
	                    System.out.println("Please enter a valid Number");
	                    start();
	                    break;

	            }
     
	    }
	 
	 
	 

	private void Add() throws IOException {
		
		System.out.println("Enter the name of file you want ro append :");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String filepath="D:\\files\\"+name;
		
		try (FileReader reader = new FileReader(filepath)) {
		
		File file= new File(filepath);
		FileWriter  writer= new  FileWriter(file,true);//overWrites file
		
			System.out.println("Enter the text you want Append:");
			String str=sc.nextLine();
			if (str.isEmpty()) {
				
				System.out.println("Enter something to Append");
			}
			else {
				writer.write(str);
				System.out.println("Successfully Appended");

			}
		writer.close();
		}
		catch (IOException e) {
			System.out.println("File not available");
		}
		
		 start();
	}

	
	
	private void Search() {
		
		System.out.println("Enter the name of file with extension :");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String filepath="D:\\files\\"+name;
		
		try (FileReader reader = new FileReader(filepath)) {
			System.out.println("The Text is selected file are:");
			int data;
			
			while((data=reader.read())!=-1){
				
				System.out.print((char)data);
			}
		}
		catch (IOException e) {
			System.out.println("File not available");
		}
		
	}

	
	
	private void Delete() {
		
		System.out.println("Enter the name of file with extension that you want to delete :");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String filepath="D:\\files\\"+name;

		try {
			Path path= Paths.get(filepath);
			if(Files.deleteIfExists(path))
				System.out.println("File  deleted");
			else
				System.out.println("File not Deleted/Not exit");
		} catch (DirectoryNotEmptyException e) {
			// TODO: handle exception
			System.out.println("Directory is not empty");
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("Invalid Permission");
		}
		
	}
	
	

	private void Create() throws IOException {
				
				System.out.println("Enter the name of file with extension you want to create:");
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				String name=sc.nextLine();
				String filepath="D:\\files\\"+name;
		
				File file= new File(filepath);
				
				if(file.createNewFile()) {
					System.out.println("File is Created");
				}
				else {
					System.out.println("File  is already Exist");
				}
				
													
				
				System.out.println("Do you want to add something to file Y/N");
				String ans=sc.nextLine();
				if(ans.equalsIgnoreCase("y"))
				{
				FileWriter  writer= new  FileWriter(file,false);//overWrites file
				
					System.out.println("Enter the text you want write (Always overWrites content be carefull While Writing):");
					String str=sc.nextLine();
					
					if (str.isEmpty()) {
						System.out.println("Enter something to write");
					}
					else {
					
						writer.write(str);
						System.out.println("Successfully Written");
					}
					writer.close();
				
				 
			  }
				
				else {
					System.out.println("Feel free to Go to 3rd option in Businness level menu to write when ever you needed");
				}
 
	 start();
	}
	
}
