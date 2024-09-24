
package Main;
import java.util.Scanner;
public class lods {
    
    public int add2nums(int a, int b){
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers like 2 5 : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        lods h = new lods();
        System.out.println( h.add2nums(x, y)   );
    }
}
