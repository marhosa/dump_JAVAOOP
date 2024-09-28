import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;

/*
NOTE:
RUN IT ON APACHE NET BEANS OR SOMETHING!!!!
DOES NOT WORK ON ONLINE JAVA COMPILER
*/

public class main {

    //timer function
    static void timer(int milisec) {
        try {
            TimeUnit.MILLISECONDS.sleep(milisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void Spacer(int numberoflines) {
        for (int x = 0; x < numberoflines; x++)
            System.out.println("");
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int plinkosize = 10;
        int multiplier[] = 
        
        
        {5000,1000,100,50,16,8,4,2,-1,-2,-3,-3,-2,-1,2,4,8,16,50,100,1000,5000};
        
        
        boolean paradise = true;
        Scanner sc = new Scanner(System.in);
        double money = 1000;
        String endgame = " ";
        char temp;
        float ballprice = 25;
        Spacer(100);
        do {
            if(money <= 0){
                System.out.println("NO MONEY GET OUT! ");
                return;
            }
            System.out.println("Current Money  :" + money);
            System.out.println("Plinko Ball Price is: " + ballprice);
            System.out.println("Press [ENTER] to PLAY\ninput [1] to end suffering");
            System.out.print("Choice    : ");
            endgame = sc.nextLine();
            
            System.out.println("\n");;
            if (endgame.equals("1")) {
                paradise = false;
            }
            
    


            //Plinko Machine
            int ball_location = plinkosize;
            for (int i = 0; i < plinkosize; i++) {
                for (int j = 0; j < plinkosize * 2 + 1; j++) {
                    System.out.print(".");
                    if (j == ball_location) {
                        System.out.print("@");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\t\t Multiplier: " + multiplier[ball_location]);
                System.out.println();
                ball_location += 1 + (-2 * rand.nextInt(2));
                timer(250);
            }
            
            System.out.println("RESULT:  $"+ballprice*multiplier[ball_location] + " ");
            money += ballprice*multiplier[ball_location];
        Spacer(5);
        }while(paradise);
    }
}



