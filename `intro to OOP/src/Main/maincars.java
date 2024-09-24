package Main;

public class maincars {
    public static void main(String[] args) {
        cars a = new cars("Honda", "Civic", 100);
        cars b = new cars("Nissan", "Silvia S15", 190);
        cars c = new cars("Toyota", "Supra", 220);
        
        System.out.print("Car Brand     : " + a.getName()+"\n");
        System.out.print("Car Model     : " + a.getBrand()+"\n");
        System.out.print("Car Top Speed : " + a.getSpeed()+"\n");
    }
}
