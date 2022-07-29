package module1;
import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {
	
	public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("abc@gmail.com");
        list.add("123@hotmail.com");
        list.add("a123@gmail.com");
        list.add("mail@gmail.com");
        list.add("b123@protonmail.com");
        
        
      
        System.out.println("Enter the email to search");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String requiredMail = sc.nextLine();
        
        if(list.contains(requiredMail)){
        	System.out.println("Required Mail :"+requiredMail+" Found");
        }
        else {
        	System.out.println("Required Mail :"+requiredMail+" Not Found");
        }
        

	}

}