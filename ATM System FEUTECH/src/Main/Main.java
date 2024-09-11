package Main;
import java.util.Scanner;
public class Main {
   
    
    public static void main(String[] args) {
        int Balance = 0;
        String temp;
        int itemp = 0;
        
        while(true){
        //declaration of variables
      
        //creates a scanner object
        Scanner sc = new Scanner(System.in);
        
        //prints out menu
        PrintMenu();
        int menuchoice = sc.nextInt();
        
        
        //switch that does what is chosen 
        switch(menuchoice){
            case 1:
                System.out.println("  Your Balance is currently " + Balance);
                System.out.println("  Press enter to continue...");
                temp = sc.nextLine();
               
                break;
                
            case 2:
                System.out.print("  Enter Amount to Deposit: ");
                itemp = sc.nextInt();
                Balance+=itemp;
                System.out.println("  Press enter to continue...");
                temp = sc.nextLine();
 
                break;
            case 3:
                break;
            case 4:
                System.out.println("  THANK YOU FOR UHH USING THE ATM... ");
                return;
            default:
                System.out.println("Try Again...");
        }       
    
       }
    }
    
    
    //Function to print main menu
    static void PrintMenu(){
        System.out.println("  ATM MACHINE SYSTEM ");
        System.out.println("  Check Balance  1");
        System.out.println("  Deposit Money  2");
        System.out.println("  Withdraw Money 3");
        System.out.println("  Exit           4");
        System.out.println("  Choice       : ");
}
    //creates endlines for aesthetic purpsoes
       static void Spacer(int x){
           for(int i = 0; i < x + 1; i++)
           System.out.println(" ");
       }
    
}


