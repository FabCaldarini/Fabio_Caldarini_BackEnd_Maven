package org.example.day1;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long id;
    private String name;

    public Customer(long id, String name, int tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    private int tier;

}
