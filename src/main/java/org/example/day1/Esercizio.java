package org.example.day1;

import java.time.LocalDate;

public class Esercizio {
    public static void main(String[] args) {
        Product prodotto1 = new Product(1,"PC","computers",1000);
        Product prodotto2 = new Product(2,"Laptop","laptops",2000);
        Product prodotto3 = new Product(3,"Monitor","monitors",3000);
        Product prodotto4 = new Product(4,"Mouse","mice",4000);
        Product prodotto5 = new Product(5,"Keyboard","keyboards",5000);

        Customer customer1 = new Customer(1,"Giovanni",2);
        Customer customer2 = new Customer(2,"Marco",3);
        Customer customer3 = new Customer(3,"Giuseppe",4);
        Customer customer4 = new Customer(4,"Giorgio",5);
        Customer customer5 = new Customer(5,"Giulio",6);

        Order order1 = new Order(1,"Delivered",LocalDate.now(),LocalDate.now(),customer1);
        Order order2 = new Order(2,"pending",LocalDate.now(),LocalDate.now(),customer2);
        Order order3 = new Order(3,"Delivered",LocalDate.now(), LocalDate.now(),customer3);
        Order order4 = new Order(4,"pending",LocalDate.now(),LocalDate.now(),customer4);
        Order order5 = new Order(5,"Delivered",LocalDate.now(),LocalDate.now(),customer5);
    }
}
