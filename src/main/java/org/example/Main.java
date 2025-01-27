package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        String[] developerNames = {"özge","alperen","berk"};
        Company company = new Company( 32, "Berk", 13.5, developerNames);
        System.out.println(company);

        Healthplan healthplan = new Healthplan(45,"Berk", Plan.BASIC);
        System.out.println(healthplan);

        String[] healthPlans = {"falan","filan","ıvır","zıvır"};
        Employee employee = new Employee(31, "Berk Şener", "ıvırzıvır@wit.com", "ıvırzıvır123", healthPlans);
        System.out.println(employee);
    }


}