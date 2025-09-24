/* Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse 
extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
 */


import java.util.*;
class Course{
    String courseName;
    int duration;

}

class OnlineCourse extends Course{
    String platform;
    String isRecorded;

}

class PaidOnlineCourse extends OnlineCourse{
    double fee;
    double discount;
    double finalFee;
    void finalFees(){
        finalFee=fee-(fee*discount)/100;
    }


    Scanner sc=new Scanner(System.in);
    void getCourseDetails(){
        System.out.println("----Course Details----");
        System.out.print("Enter the course name : ");
        courseName=sc.nextLine();

        System.out.print("Enter the course duration (in months) : ");
        duration=sc.nextInt();

        System.out.print("Enter the course platform : ");
        platform=sc.next();

        System.out.print("Is the course recorded : ");
        isRecorded=sc.next();

        System.out.print("Enter the course fee : ");
        fee=sc.nextDouble();

        System.out.print("Enter the course discount : ");
        discount=sc.nextDouble();

        System.out.println();
    }

    

    void displayCourseDetails(){
        System.out.println("----Display Course Details----");
        System.out.println("Course Name : "  + courseName);
        System.out.println("Course Duration : "  + duration + " months ");
        System.out.println("Course Platform : "  + platform);
        System.out.println("Course Recorded : "  + isRecorded);
        System.out.println("Course Fee : "  + fee);
        System.out.println("Course Discount : "  + discount + " % ");
        System.out.println("Course Discount : "  + discount + " % ");
        System.out.println("Final course fee : "  + finalFee);
    }

}
public class EducationCourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse obj=new PaidOnlineCourse();
        
        obj.getCourseDetails();
        obj.finalFees();
        obj.displayCourseDetails();
    }
    
}
