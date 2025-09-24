/*Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and 
Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager
 and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
 */

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;

    }

    void displayDetails() {
        System.out.println("Name is : " + name);
        System.out.println("Id is : " + id);
        System.out.println("Salary is : " + salary);

    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size is : " + teamSize);
    }

}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language is : " + programmingLanguage);
    }

}

class Intern extends Employee {
    int period;

    Intern(String name, int id, double salary, int period) {
        super(name, id, salary);
        this.period = period;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Time period of internship(in months) : " + period);
    }

}

public class EmployeeHierarchy {
    public static void main(String args[]) {
        Employee obj1 = new Manager("Kamal", 19, 24000, 56);
        Employee obj2 = new Developer("Meena", 24, 34000, "Java");
        Employee obj3 = new Intern("Tina", 11, 2500, 6);

        Employee emps[] = { obj1, obj2, obj3 };
        for (int i = 0; i < emps.length; i++) {
            emps[i].displayDetails();
            System.out.println();
        }

    }

}
