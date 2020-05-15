package Interfaces;


public class Jeep implements LandVessel{
    private String name = "";
    private int maxPassenger = 0;
    private double maxSpeed = 0;
    private int numWheels = 0;

    Jeep(String name, int maxPassenger, double maxSpeed, int numWheels){
        setName(name);
        setMaxPassenger(maxPassenger);
        setMaxSpeed(maxSpeed);
        setNumWheels(numWheels);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getMaxPassenger() {
        return this.maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getNumWheels(){
        return this.numWheels;
    }

    public void setNumWheels(int n) {
        this.numWheels = n;
    }

    public void drive(){
        System.out.println("Get in loser, we're going shopping.");
    }
    public void soundHorn(){
        System.out.println("honk honk baguette");
    }
    @Override
    public String toString(){
        return "this is a " + this.getName() + ", it's a type of Jeep," +
                " with " + getNumWheels() + " wheels, its max passenger is " + getMaxPassenger()
                + " and its max speed is " + getMaxSpeed()+ ".";
    }

}
