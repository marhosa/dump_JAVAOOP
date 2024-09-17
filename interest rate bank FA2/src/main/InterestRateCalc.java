
import java.util.Scanner;

public class InterestRateCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Bank Account Balance: ");
        float bankbalance = sc.nextFloat();
        System.out.println("Input Interest Rate, Example is 20, meaning 20% ");
        System.out.print("Interest Rate:  ");
        float interestrate = sc.nextFloat();
        
        float annual = bankbalance, monthly = bankbalance, daily = bankbalance;
        
        //Main Loop in 10 years
        for (int i = 0; i < 10; i++) {
            
            
            //Monthly
            for (int j = 0; j < 12; j++) {
                monthly += monthly * (interestrate / 100 / 12); 
            }
            
            //Daily
            for (int k = 0; k < 365; k++) {
                daily += daily * (interestrate / 100 / 365);
            }
            
            //Yearly 
            annual += annual * (interestrate / 100);
            
        }
        System.out.println("In 10 Years...");
        System.out.println("Annual Total:   " + annual);
        System.out.println("Monthly Total:  " + monthly);
        System.out.println("Daily Total:    " + daily);
 
    }
}
