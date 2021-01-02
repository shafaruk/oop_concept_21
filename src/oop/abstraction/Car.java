package oop.abstraction;

public interface Car {

    // Guideline for feature build
    // you can not instantiate variables and objects
    // interface only one access modifier that is public by default

    // variable
    String brand="mercedes";
    int carQuantity=200;
    String seat ="2";
    String headLight="4";
    boolean gasTank=true;


    // Declare method without body-Interface abstract method does not have body
    public void startCar();
    public void stopCar();
    public void carWheel();
    public void carEngine();
    public void carBreak();
    public void carSteering();
    public void carAcceleration();


    public static int carDoor(int doorNumber){

        int totalDoor= 1 * doorNumber;
        return totalDoor;
    }













}
