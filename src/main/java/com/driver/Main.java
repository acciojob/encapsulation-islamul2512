package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class RWOnly
        RWOnly obj = new RWOnly();

        // Task 4: Attempt to directly access the private variable (error expected)
        // Uncommenting the below line will cause a compile-time error
        // System.out.println(obj.name);

        // Task 6: Set a value to 'name' using the setter and access it using the getter
        obj.setName("John");
        System.out.println("Name: " + obj.getName());
    }
}