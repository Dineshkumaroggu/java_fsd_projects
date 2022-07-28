import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         // ArrayList<Integer> arrlist = new ArrayList<Integer>();
          ArrayList<Integer> expenses = new ArrayList<Integer>();
          expenses.add(1000);
          expenses.add(2300);
          expenses.add(45000);
          expenses.add(32000);
          expenses.add(110);
    


        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection(expenses);

    }

    private static void optionsSelection(ArrayList<Integer> expenses) {

        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };

        int  slen = arr.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }

        System.out.println("\nEnter your choice:\t");
        try (Scanner sc = new Scanner(System.in)) {
            int  options =  sc.nextInt();

                    switch (options){
                        case 1:
                            System.out.println("Your saved expenses are listed below: \n");
                            System.out.println(expenses+"\n");
                            optionsSelection(expenses);
                            break;
                        case 2:
                            System.out.println("Enter the value to add your Expense: \n");
                            int value = sc.nextInt();
                            expenses.add(value);
                            System.out.println("Your value is updated\n");
                            // expenses.addAll(arrlist);
                            System.out.println(expenses+"\n");
                            optionsSelection(expenses);

                            break;
                        case 3:
                            System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
                            int con_choice = sc.nextInt();
                            if(con_choice==options){
                                   expenses.clear();
                                System.out.println(expenses+"\n");
                                System.out.println("All your expenses are erased!\n");
                            } else {
                                System.out.println("Oops... try again!");
                            }
                            optionsSelection(expenses);
                            break;
                        case 4:
                            sortExpenses(expenses);
                            optionsSelection(expenses);
                            break;
                        case 5:
                            searchExpenses(expenses);
                            optionsSelection(expenses);
                            break;
                        case 6:
                            closeApp();
                            break;
                        default:
                            System.out.println("You have made an invalid choice!");
                            optionsSelection(expenses);
                            break;
                    }
        }
        catch(Exception e){
                System.out.println("Error"+ e);
        }
    }


    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
    }

    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        System.out.println("Enter the expense you need to search:\t");
        //Complete the method
        Scanner sc=new Scanner(System.in);
        int  key =  sc.nextInt();
		int[] arr = arrayList.stream().mapToInt(i -> i).toArray();
       
        int temp=-1;
        //for searching element
        for(int k=0;k<leng;k++){
            if(key==arr[k]){
                 temp=k;
            }
        }
        if(temp==-1){
            System.out.println("Expense not found");
        }
        else{System.out.println("EXpense found at index "+ temp);}
    }	




    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
       //Complete the method. The expenses should be sorted in ascending order.
          // Driver program
        int[] arr = arrayList.stream().mapToInt(i -> i).toArray();
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, arrlength-1);
        System.out.println("sorted Expenses are");
        ob.printArray(arr);
    

    }




}
