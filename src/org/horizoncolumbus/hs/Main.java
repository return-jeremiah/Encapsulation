package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee Justin = new Employee();
        Justin.setSalary(1000000);
        System.out.println(Justin.getSalary()); // it shows the salary of the object and in this case the object is justin
        int increace = Justin.getSalary() / 10;
        System.out.println(Justin.getSalary() + increace);
    }
}
