package virtualkey;
import java.util.*;
import java.util.Arrays;
import java.io.File;

public class Virtualkeyrepo {
	
	public static void main(String[] args) {

        System.out.println("**************************");
        System.out.println("\nWelcome to Virtual keys\n");
        System.out.println("**************************");
        Virtualkeyrepo ob= new Virtualkeyrepo();
        ob.startmain();
	}
	
	public void startmain(){
        System.out.println("\nChose one of the option below:");
        System.out.println("1:Retrive current filename in Ascending oder");
        System.out.println("2.Bussiness Level operation menu");
        System.out.println("3.Exit from the Application");
        
         @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
          String  key=sc.nextLine();
          switch(key){
              case "1":
                  Displayinoder();
                  startmain();
                  break;
              case "2":
                  FIilehandling ob= new FIilehandling();
                  ob.start();
                  break;
              case "3":
                  System.out.println("Thanks For using this Application");
                  break;
              default:
                  System.out.println("Please enter a valid Number");
                  startmain();
                  break;
          }

     
	}
	
	
	




	public static void Displayinoder(){
    	
        System.out.println("The Files in directory in ascending oder are: ");
        
        File dir = new File("D:/files");

        File[] files = dir.listFiles();

        Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

        for (File file : files) {
           if (!file.isHidden()) {
              if (file.isFile()) {
                 System.out.println(file.getName());
              } 
           }
        }
     }

  
}
