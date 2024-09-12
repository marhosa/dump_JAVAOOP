import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        while(true){
        //basics stuff asking what problem to do
        Scanner sc = new Scanner(System.in);
        System.out.println("What Problem to Perform? ");
        System.out.println("Problem 1 Inventroy [1] ");
        System.out.println("Problem 2 Payroll   [2] ");
        System.out.println("Main Exit           [3]");
        System.out.print("Choice                :");
        int mainchoice = sc.nextInt();
        if(mainchoice == 3){
            System.out.println("Stopping  The Main Program, Tanks!");
            return;
        }
        //if else if what problem to do
        if(mainchoice == 1){
            //declares linked lists
            ArrayList<String> itemname= new ArrayList<>();
            ArrayList<Integer> itemquantity = new ArrayList<>();
            ArrayList<Float> itemprice = new ArrayList <>();
            while(true){
            int exitba = 0;
            System.out.println("\n\n  -- Inventory System -- ");
            System.out.println("Add Product            [1]");
            System.out.println("View Product Details   [2]");
            System.out.println("Update Product Quantity[3]");
            System.out.println("Remove a Product       [4]");
            System.out.println("Exit                   [5]");
            int mp1choice = sc.nextInt();
            switch(mp1choice){
                //Adds Product
                case 1:
                    System.out.print("Enter Item Name    :");
                    sc.nextLine(); //cleanup1
                    String Tname = sc.nextLine();
                    itemname.add(Tname);
                    System.out.print("Enter Item Quantity:");
                    int Tquantity = sc.nextInt();
                    itemquantity.add(Tquantity);
                    System.out.print("Enter Item Price   :");
                    float Tprice = sc.nextFloat();
                    itemprice.add(Tprice);
                    System.out.println("Added Item Successfully! UwU...");
                    System.out.println("\n");
                    break;
                //View Item Deets
                case 2:
                    if(itemquantity.isEmpty()){
                        System.out.println("No Items Yet! Add Items First...");
                    }
                    else{
                    for (int i = 0; i < itemquantity.size(); i++) {
                        System.out.println("Item Name    : " + itemname.get(i));
                        System.out.println("Item Quantity: " + itemquantity.get(i));
                        System.out.println("Item Price   : " + itemprice.get(i));
                        System.out.println("\n");
                        }
                    }
                    break;
                case 3:
                    if(itemquantity.isEmpty()){
                        System.out.println("No Items Yet! Add Items First...");
                    }
                    else{
                        //prints the items and assigns them product codes
                        for (int i = 0; i < itemquantity.size(); i++) {
                        System.out.println("Item Name " + itemname.get(i)+" Code: ["+(i+1)+"]");
                        }
                        //asks for produt code and integer
                        System.out.print("Product Code: ");
                        int productcode = sc.nextInt() - 1;
                        System.out.print("New Quantity: ");
                        int newproductquantity = sc.nextInt();
                        itemquantity.set(productcode,newproductquantity);
                        System.out.println("Updated Quantity Successfully!");
                    }
                    break;
                case 4:
                    if(itemquantity.isEmpty()){
                        System.out.println("No Items Yet! Add Items First...");
                    }
                    else{
                        //prints the items and assigns them product codes
                        for (int i = 0; i < itemquantity.size(); i++) {
                        System.out.println("Item Name " + itemname.get(i)+"Code: ["+(i+1)+"]");
                        }
                        //asks for produt code and integer
                        System.out.print("Product Code To Remove: ");
                        int productcode = sc.nextInt();
                        itemname.remove(productcode - 1);
                        itemquantity.remove(productcode - 1);
                        itemprice.remove(productcode - 1);
                        System.out.println("Removed Product Successfully!");
                    }
                    break;
                case 5:
                    exitba = 1;
                    break;
            }
            if(exitba == 1){
                break;
            }
             }//while true ito lods
        }
       
        
        ///payroll system
        else if(mainchoice == 2){
            int PSchoice = 0;
            float grosssalary = 3000;
            float added = 0;
            float subtracted = 0;
            float tempp;
            boolean stopnaba = false;
            do{
            System.out.println("\n\n\n  -- Payroll System -- ");
            System.out.println("View Current Salary [1]");
            System.out.println("Add Allowance       [2]");
            System.out.println("Deduct Tax          [3]");
            System.out.println("Calculate Net salary[4]");
            System.out.println("Exit                [5]\nChoice:  ");
            
            PSchoice = sc.nextInt();
            
            switch(PSchoice){
                case 1:
                    System.out.println("Current Gross Salary is "+ grosssalary);
                    System.out.println("Note: Calculate net salary to update");
                    break;
                case 2:
                    do{
                    System.out.print("Amount to be Added: ");
                    added = sc.nextFloat();
                    if(added <0){
                        System.out.println("\n\nInvalid Input, Try again...");
                    }
                    }while(added < 0);
                break;
                case 3:
                    do{
                    System.out.print("Amount to be deducted: ");
                    subtracted = sc.nextFloat();
                    if(subtracted <0){
                        System.out.println("\n\nInvalid Input, Try again...");
                    }
                    }while(subtracted < 0);
                    
                break;
                case 4:
                    System.out.println("Calculating....");
                    System.out.println("Gross Salary: " + grosssalary);
                    System.out.println("Total Allowances: " + added);
                    System.out.println("Total Deductions: " + subtracted);
                    grosssalary = grosssalary + added - subtracted;
                    System.out.println("Net Salary: " + grosssalary);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Input, Try Again...");
                    break;
                
            }
            }while(PSchoice !=5);
        }

        else{
            System.out.println("Exiting...");
            return;
        }
        
        
    }
    
}
}
