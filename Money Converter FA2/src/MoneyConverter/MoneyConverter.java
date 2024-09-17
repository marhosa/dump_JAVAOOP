import java.util.Scanner;
public class MoneyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(true){
            
            System.out.println("\n\n\n\nMoney Converter!");
            System.out.print("Enter PHP Amount: ");
            float orig = sc.nextFloat();
            System.out.println("\n\nThe Amount Equivalents: ");
            System.out.println("USD:    " + orig * 0.017927425);
            System.out.println("Euro:   " + orig * 0.016117448 );
            System.out.println("Yuan:   " + orig * 0.12719324);
            System.out.println("Koruna: " + orig * 0.40544195);
            System.out.println("Krone:  " + orig * 0.18979375 );
            System.out.println("Sheqel: " + orig * 0.06);
            System.out.println("Dinar:  " + orig * 23.485407);
            System.out.println("\n\n\nCurrently 2024 17/09, 1 USD = 55.7829 PHP...\nSource is https://www.xe.com/currencyconverter/convert");
            System.out.println("Input 1 to Exit and 0 to continue...");
            choice = sc.nextInt();
            if(choice == 1){
                return;
            }
        }
    }
}
