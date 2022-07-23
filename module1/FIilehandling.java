package lesson3project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class FIilehandling {
	
	public static void Write() throws IOException
	{
		File file= new File("D:\\files\\test.txt");
		//write data to that file
		FileWriter  writer= new  FileWriter(file,false);//overWrites file
		
		try (Scanner sc = new Scanner(System.in)) {
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
	}
	
	//appending content
	public static void Append() throws IOException
	{
		File file= new File("D:\\files\\test.txt");
		//write data to that file
		FileWriter  writer= new  FileWriter(file,true);//overWrites file
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the text you want Append:");
			String str=sc.nextLine();
			
			if (str.isEmpty()) {
				
				System.out.println("Enter something to Append");
			}
			else {
				writer.write(str);
				System.out.println("Successfully Appended");

			}
			
		}
		writer.close();
		
		
	}
	
	//to read the file
	public static void readFileReaderClass() throws IOException
	{   
		System.out.println("The Text is selected file are:");
		try (FileReader reader = new FileReader("D:\\files\\test.txt")) {
			int data;
			
			while((data=reader.read())!=-1){
				
				System.out.print((char)data);
			}
		}
		catch (IOException e) {
			System.out.println("File not available");
		}
		
	}
	
	
	 public static void main(String args[]) throws FileNotFoundException, IOException {
		 
	        System.out.println("Please select one of the below operations");
	        System.out.println(" w for write mode ");
	        System.out.println(" r for read mode ");
	        System.out.println(" a for append mode ");
	        Scanner in =new Scanner(System.in);
	        String s=in.nextLine();
	        
	        if(s.equalsIgnoreCase("r"))
	        {
	        	try{
	        		readFileReaderClass();
	        		}
	        	catch (IOException e) {
	    			e.printStackTrace();
	        	}
	        }
	        else if(s.equalsIgnoreCase("w"))
	        {
	        	try{
	        		Write();
	        		}
	        	catch (IOException e) {
	    			e.printStackTrace();
	        	}
	        }
	        else if(s.equalsIgnoreCase("a")) {
	        	
	        	try{
	        		Append();
	        		}
	        	catch (IOException e) {
	    			e.printStackTrace();
	        	}
	        }
	        else
	        {
	            System.out.println("Sorry you try to do unexpected ,betterluck next time ");
	        }
	        
	        in.close();
	        
	    }

}
