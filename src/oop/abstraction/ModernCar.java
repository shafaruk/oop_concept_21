package oop.abstraction;

public abstract class ModernCar {
    // abstract class : which is not fully abstract .



    // Variable

    String modernCarBrand="Tesla";
    double moderCarPrice=65000;

    //Method

    public abstract void navigation();
    public abstract void autoLaneControl();
    public abstract void display();
    public abstract void cameras();
    public abstract void selfDriven();
    public abstract void emergencyBreak();
    public abstract void autoGear();



    // static and non static methods are allowed
    public void dualClimateControl(){
        System.out.println("Moder car has dual climate control feature");
    }








}
