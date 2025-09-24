/*
 * Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are 
 * subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
Tasks:
Define a superclass Vehicle with attributes like maxSpeed and model.
Create an interface Refuelable with a method refuel().
Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while 
ElectricVehicle include a charge() method.
Goal: Use hybrid inheritance by having PetrolVehicle implement both Vehicle and Refuelable, demonstrating 
how Java interfaces allow adding multiple behaviors.

 */
class Vehicles{
    int maxSpeed;
    int model;

    Vehicles(int maxSpeed, int model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }

    void display(){
        System.out.println("Maximum speed of vehicle : " + maxSpeed + " km/h");
        System.out.println("Model of the vehicle : " + model );
    }

}
interface Refuelable{
    void refuel();

}
class ElectricVehicle extends Vehicles{
    String color;
    double battery;
    ElectricVehicle(int maxSpeed, int model, String color, double battery){
        super(maxSpeed, model);
        this.color=color;
        this.battery=battery;

    }

    @Override
    void display(){
        System.out.println("----Details of ElectricVehicle----");
        super.display();
        System.out.println("Color of the vehicle  : " + color);
    }
    
    void charge(){
        
        System.out.println("Battery of vehicle ( in % ) : " + battery);
        System.out.println();

    }

}
class PetrolVehicle extends Vehicles implements Refuelable{
    String vehicle;
    PetrolVehicle (int maxSpeed, int model, String vehicle){
        super(maxSpeed, model);
        this.vehicle=vehicle;
    }
    
     @Override
    void display(){
        System.out.println("----Details of PetrolVehicle----");
        super.display();
        System.out.println("Vehicle in use : " + vehicle);
    }

    public void refuel(){
        System.out.println("Vehicle " + vehicle + " refueled.");
        System.out.println();
    }

}
public class VehicleManagement {
    public static void main(String[] args) {
        PetrolVehicle obj=new PetrolVehicle(140, 2011, "Car");
        ElectricVehicle obj1=new ElectricVehicle(160,2014,"Black",66);
        obj.display();
        obj.refuel();

        obj1.display();
        obj1.charge();
       

        
        

    }
    
}
