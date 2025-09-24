/*Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, 
and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.

*/

import java.util.*;

class Order {
    int orderId;
    String orderDate;

}

class ShippedOrder extends Order {
    long trackingNumber;

}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    Scanner sc = new Scanner(System.in);

    void getOrderDetails() {

        System.out.println("----Order Details----");
        System.out.print("Enter the order id:");
        orderId = sc.nextInt();

        System.out.print("Enter the order date:");
        orderDate = sc.next();

        System.out.print("Enter the tracking number:");
        trackingNumber = sc.nextLong();

        System.out.print("Enter the delivery date:");
        deliveryDate = sc.next();

        System.out.println();
    }

    void getOrderStatus() {
        System.out.println("----Order Status----");
        System.out.println("Order Id : " + orderId);
        System.out.println("Order Date : " + orderDate);
        System.out.println("Tracking Number : " + trackingNumber);
        System.out.println("Delivery Date : " + deliveryDate);
    }

}

public class OnlineRetailOrder {
    public static void main(String args[]) {
        DeliveredOrder obj=new DeliveredOrder();
        obj.getOrderDetails();
        obj.getOrderStatus();
    }

}
