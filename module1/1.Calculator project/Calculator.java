package module1;
import java.util.Scanner;

public class Calculator {
	public static void main(String args[]){
		System.out.println("Welcome to Caculator");
	    while(true){
	    	System.out.println("\nSelect one of the option to perfom a operation");
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison\n5.Exit");
			int num1,num2,option;
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			option=sc.nextInt();
			
			
			
			if(option==5) {
				System.out.println("Thanks for using Calculator");
				break;
			}
			else if(option>5|| option<1) {
				System.out.println("Choose the correct option among 1/2/3/4/5");
			}
			else {
					
				num1=sc.nextInt();
				System.out.println("Enter the Second number");
				num2=sc.nextInt();
				
				if(option==1) {
					int res=num1+num2;
					System.out.println("The Sum of "+num1+" and "+num2+" is: "+res);
				}
				else if(option==2) {
					int res=num1-num2;
					System.out.println("The Difference of "+num1+" and "+num2+" is: "+res);
				}
				else if(option==3) {
					int res=num1*num2;
					System.out.println("The Product of "+num1+" and " +num2+" is: "+res);
				}
				else if(option==4) {
					float n1=num1;
					float n2=num2;
					float res=n1/n2;
					System.out.println("The Divison of "+num1+" by "+num2+" is: "+res);
				}

			}
						
	    }
		
		
	}

}
