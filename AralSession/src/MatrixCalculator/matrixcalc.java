
package MatrixCalculator;
import java.util.Scanner;

public class matrixcalc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Block below gets dimensions of matrix 1
        System.out.print("Enter First Matrix Row Size: ");
        int r1 = sc.nextInt();
        System.out.print("Enter First Matrix Column Size: ");
        int c1 = sc.nextInt();
        
        //Block below gets dimensions of matrix 2
        System.out.print("Enter Second Matrix Row Size: ");
        int r2 = sc.nextInt();
        System.out.print("Enter Secpnd Matrix Column Size: ");
        int c2 = sc.nextInt();
        
        //Checker to see if the multiplication is valid
        if(c1 != r2){
            System.out.println("Invalid Dimensions, Ending Program...");
            return;
        }
        
        //Creates the Matrices
        int m1[][] = new int[r1][c1]; //matrix 1
        int m2[][] = new int[r2][c2]; //matrix 2
        int mp[][] = new int[r1][c2]; //matrix product
        
        //fills up matrix 1
        System.out.println("Matrix 1 Dimensions: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("Row "+i+" Col "+j+" : ");
                m1[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        
         //fills up matrix 2
        System.out.println("\n\nMatrix 2 Dimensions: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("Row "+i+" Col "+j+" : ");
                m2[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
 
        
        //calculator itself
        for(int i = 0; i < r1; i++){
            for (int j = 0; j < c2; j++){
                for (int k = 0; k < r2; k++) {
                    mp[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }
        
        System.out.println("\n\n Matrix 1: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(m1[i][j]+"  ");
            }
            System.out.print("\n");
        }
        
        
        System.out.println("\n\n Matrix 2: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(m2[i][j]+"  ");
            }
            System.out.print("\n");
        }
        
        System.out.println("\n\n Finale Product: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(mp[i][j]+"  ");
            }
            System.out.print("\n");
        }
    }
}

