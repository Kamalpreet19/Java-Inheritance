/*Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
 */

import java.util.*;
class Device{
    int deviceId;
    String status;

}
class Thermostat extends Device{
    Scanner sc=new Scanner(System.in);
    int temperatureSetting;

    void getStatus(){
        
        System.out.println("-----Enter details of device-----");

        System.out.print("Enter the ID of device : " );
        deviceId=sc.nextInt();

        sc.nextLine();
        System.out.print("Enter the status of device : " );
        status=sc.nextLine();

        System.out.print("Enter the setting of temperature : " );
        temperatureSetting=sc.nextInt();

        System.out.println();
    }

    void displayStatus(){
        System.out.println("-----Enter details of device-----");
        System.out.println("Enter the ID of device : " + deviceId);
        System.out.println("Enter the status of device : " + status);
        System.out.println("Enter the setting of temperature : " + temperatureSetting + " °C " );

    }

}
public class SmartHome {
    public static void main(String args[]){
        Thermostat obj=new Thermostat();
        obj.getStatus();
        obj.displayStatus();
    }
    
}
