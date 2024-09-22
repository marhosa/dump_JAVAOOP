package main;
import java.util.Scanner;
/*
enter num of elements
compute for the sum of the array
*/

public class main {
    
    public int sumArr(int x[]){
        int sum = 0;
        for(int num : x){
            sum+=num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        main w = new main();
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount of elements you will add: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //input arrays
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        //calculation of the sum
        int sum = w.sumArr(numbers);
        System.out.println("sum is: " + sum);
    }
}
