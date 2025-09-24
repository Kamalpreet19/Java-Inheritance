/*Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses.
 Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
Tasks:
Define a superclass Person with attributes like name and id.
Create an interface Worker with a method performDuties().
Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, 
each providing a unique implementation of performDuties().
Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors 
to the same objects.
 */

class Persons{
    String name;
    int id;

    Persons(String name, int id){
        this.name=name;
        this.id=id;
    }

    void display(){
        System.out.println("Name : " + name + "\nId : " + id);
    }

}

interface Worker{
    void performDuties();

    }

class Chef extends Persons implements Worker{
    String uniformColor;
    Chef(String name, int id, String uniformColor){
        super(name, id);
        this.uniformColor=uniformColor;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Uniform colour : " + uniformColor);

        }
    
    @Override
    public void performDuties(){
        System.out.println(name + " Chef cooks.");

    }

}

class Waiter extends Persons implements Worker{
    double salary;
    Waiter(String name, int id, double salary){
        super(name, id);
        this.salary=salary;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Salary : " + salary);

        }

    @Override
    public void performDuties(){
        System.out.println(name + " Takes order.");

    }

}


public class RestaurantManagement {
    public static void main(String args[]){
        Chef obj=new Chef("Birju", 11, "White");
        Waiter obj1=new Waiter("Alex", 22, 7000);

        System.out.println("----Chef Details----");
        obj.display();
        obj.performDuties();
        System.out.println();


        System.out.println("----Waiter Details----");
        obj1.display();
        obj1.performDuties();

    }
    
}
