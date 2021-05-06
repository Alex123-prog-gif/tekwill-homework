package com.company.homework0605;

public class Car {
    String brand;
    String color;
    int speed;

   public Car(){
       brand="Ford";

   }
   public Car(String color){
       this();
       this.color=color;

   }
   public Car(int speed){
       new Car(color);
       this.speed=speed;


   }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void run(){
        System.out.println("Car is running ...");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Red");
        Car c3 = new Car(20);

        c1.speed = 20;
        c1.color = "Yellow";
        c1.brand = "BMW";

        c2.setBrand("Lada");
        c2.setSpeed(30);
        c2.setColor("Blue");

        c3 = new Car("Ford","Blue", 20);
    }
}