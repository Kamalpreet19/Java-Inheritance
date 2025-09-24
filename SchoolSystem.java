/* Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and
 Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and 
grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and 
unique characteristics.
 */


class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    void displayDetails(){
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
    }

    void displayRole(){
        System.out.println("A person is an individual performing task.");
        System.out.println();
    }


}

class Teacher extends Person{
    String subject;

    Teacher(String name, int age, String subject){
        super(name,age);
        this.subject=subject;
    }

    @Override
    
    void displayDetails(){
        System.out.println("----Teacher's Details----");
        super.displayDetails();
        System.out.println("Subject :" + subject);
        
    }

    @Override
    void displayRole(){
        System.out.println("Teaching and guiding students.");
        System.out.println();
    }

}

class Student extends Person{
    String grade;

    Student(String name, int age, String grade){
        super(name,age);
        this.grade=grade;
    }

    @Override
    void displayDetails(){
        System.out.println("----Student's Details----");
        super.displayDetails();
        System.out.println("Grade : " + grade);
    }
    @Override
    void displayRole(){
        System.out.println("Studying and obeying the teachers and elders.");
        System.out.println();
    }

}

class Staff extends Person{
    int staffId;

    Staff(String name, int age, int staffId){
        super(name,age);
        this.staffId=staffId;
    }

    @Override
    void displayDetails(){
        System.out.println("----Staff's Details----");
        super.displayDetails();
        System.out.println("Staff Id :" + staffId);
    }
    
    @Override
    void displayRole(){
        System.out.println("Ensure smooth day-to-day operations of the school");
        System.out.println();
    }

}
public class SchoolSystem {
    public static void main(String[] args) {
        Person obj1=new Teacher("Veena", 42, "Chemistry");
        Person obj2=new Student("Kamal", 14, "A");
        Person obj3=new Staff("Birju", 35, 121);

        Person persons[]={obj1,obj2,obj3};
        for(int i=0;i<persons.length;i++){
            persons[i].displayDetails();
            persons[i].displayRole();
        }
        
    }
}
    

