package com.in28Minutes.oops.city;


public class CityRunner {
    public static void main(String[] args) {
        City columbus = new City();
        City chicago = new City();

        columbus.setPopulation(897976546798798L);
        columbus.setState("OH");

        chicago.setPopulation(6467676797749747L);
        chicago.setState("IL");

        System.out.println("Columbus " + columbus.getState() + " " + columbus.getPopulation());
        System.out.println("Chicago " + chicago.getState() + " " + chicago.getPopulation());
    }
}
