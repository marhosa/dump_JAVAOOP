import java.util.Scanner;
/*
Pseueueueudocoderes:

Airline Reservation System

Steps:
menu to reserve a flight, see reservations and remove a reservation and exit

Booking system: 
books what seat and what seats are available
confirm reservation
go back to main menu

See Reservation:
cout lang lahat ng mga stuff na nireserve
go back to main menu

Remove Reservation:
print out all reservations
ask what reservation to remove
remove it
go back to main menu

boolean array uhh
pag true = occupied
false = unoccupied

*/

public class main {
    public static void main(String[] args) {
        //Main Scannner named sc
        Scanner sc = new Scanner(System.in);
        
        //variable declarations are here
        
        //pag naging false to, exit ang code
        Boolean a_choice = true;
        int a_switch = 0;
        Boolean plane_seats[] = new Boolean[5];
        for (int i = 0; i < plane_seats.length; i++) {
            plane_seats[i] = true;
        }
        int av_seats = plane_seats.length;
        int a_temp;
        
        //main body ng ano code
        do{
            System.out.println("\n\n  Airline Reservation Simulator! ");
            System.out.println("  RESERVE a seat       [1]");
            System.out.println("  SEE your Reservations[2]");
            System.out.println("  CANCEL a Reservation [3]");
            System.out.println("  EXIT Booking System  [4]");
            System.out.print("  Choice              : ");
            a_switch = sc.nextInt();
            
            switch(a_switch){
                case 1:
                    System.out.println(av_seats+"/"+plane_seats.length + " Available Seats");
                    
                    //displays available and occupied seats
                    for (int i = 0; i < plane_seats.length; i++) {
                        System.out.print("Seat #"+ (i + 1) +"  Status: ");
                        if(plane_seats[i]){
                            System.out.println("AVAILABLE");
                        }
                        else{
                            System.out.println("OCCUPIED");
                        }
                    }
                    
                    System.out.print("\n\nReserve a seat for: ");
                    //seat booking system:
                    a_temp = sc.nextInt();
                    System.out.println("\nBook Seat Number: ");
                    if(a_temp > plane_seats.length || a_temp < 0 || !plane_seats[a_temp - 1]){
                        System.out.println("Seat is UNAVAILABLE");
                    }
                    else{
                        av_seats--;
                        plane_seats[a_temp - 1] = false;
                        System.out.println("Seat #" +a_temp + "has been BOOKED!");
                    }
                    
                    break;
                    
                case 2:
                    //displays seats you have booked
                    if(av_seats >= plane_seats.length){
                        System.out.println("You do not have any reservations!");
                    }
                    else{
                    System.out.println("You have reservations for: ");
                    for (int i = 0; i < plane_seats.length; i++) {
                        if(!(plane_seats[i])){
                            System.out.println("SEAT # " + (i + 1));
                            }
                        }
                    }
                    break;
                    
                case 3:
                    
                    if(av_seats == 5){
                        System.out.println("You DON'T have any BOOKED seats");
                        break;
                    }
                    System.out.println("Please CHOOSE what seat to CANCEL");
                    for (int i = 0; i < plane_seats.length; i++) {
                        if(!plane_seats[i]){
                            System.out.println("SEAT #" + (i + 1));
                        }
                    }
                    System.out.print("\n\nCANCELL Seat Number: ");
                    
                    a_temp = sc.nextInt();
                    
                    if(a_temp > plane_seats.length || a_temp < 0 || plane_seats[a_temp - 1]){
                        System.out.println("\n\nYou cannot CANCEL that seat");
                    }
                    else{
                        av_seats++;
                        plane_seats[a_temp - 1] = true;
                        System.out.println("\n\nSeat #" +a_temp + "has been CANCELLED!");
                    }
                    break;
                case 4:
                    a_choice = false;
                    break;
                default:
                    //ENDS PROGRAM WHEN REACHED
                    System.out.println("Error, Invalid Choice");
                    break;
                    //break
            }
        }while(a_choice);
        
        
    }//public static void main bracket
    
}//public class main bracket
