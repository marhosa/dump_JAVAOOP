/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

public class cars {
    //attributes
    String brand; 
    String name;
    int speed;
    
    cars(String b, String n, int s){
        this.brand = b;
        this.name = n;
        this.speed = s;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getBrand(){
        return this.brand;
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
}
