/*Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
 */

import java.util.*;
class Book{
    String title;
    int publicationYear;

}

class Author extends Book{
    Scanner sc=new Scanner(System.in);
    String name, bio;

    void getInfo(){
    System.out.println("----Enter Details of Book and Author----");

    System.out.print("Enter the title of book : ");
    title=sc.nextLine();

    System.out.print("Enter the year of publication : ");
    publicationYear=sc.nextInt();
    
    sc.nextLine();
    System.out.print("Enter name of author : ");
    name=sc.nextLine();
    

    System.out.print("Enter bio of the book : ");
    bio=sc.nextLine();

    System.out.println();
    
}
     void displayInfo(){
        System.out.println("----Display Details of Book and Author----");
        System.out.println("Tile of book is : " + title);
        System.out.println("Year of publication is : " + publicationYear);
        System.out.println("Name of the author is : " + name);
        System.out.println("Bio of the author is : " + bio);
     }
    }

public class LibraryManagement {
    public static void main(String args[]){
        Author obj=new Author();
        obj.getInfo();
        obj.displayInfo();
    }
    
}
