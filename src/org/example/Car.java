package org.example;

public class Car {

    private String brand;
    private String model;
    private int year;

    public void move(){
        System.out.println("move");
    }

    private void stop(){
        System.out.println("stop");
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    private int getYear(){
        return this.year;
    }

    private String getModel(){
        return this.model;
    }

    private String getBrand(){
        return this.brand;
    }

    public static void main(String[] args){
        Car myCar = new Car();
        myCar.setBrand("현대");
        myCar.setModel("아이오닉");
        myCar.setYear(2025);

        System.out.println("Brand : " + myCar.getBrand());
        System.out.println("model : " + myCar.getModel());
        System.out.println("year : " + myCar.getYear());
        myCar.move();
        myCar.stop();
    }
}
