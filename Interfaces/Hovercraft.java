package Interfaces;

public class Hovercraft implements LandVessel, SeaVessel{
    private String name = "";
    private int maxPassenger = 0;
    private double maxSpeed = 0;
    private double displacement = 0;
    private int numWheels = 0;

    Hovercraft(String name, int maxPassenger, double maxSpeed, double displacement, int numWheels){
        setName(name);
        setMaxPassenger(maxPassenger);
        setMaxSpeed(maxSpeed);
        setDisplacement(displacement);
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
    public void setDisplacement(double n){
        this.displacement = n;
    }
    public double getDisplacement() {
        return this.displacement;
    }
    public int getNumWheels(){
        return this.numWheels;
    }

    public void setNumWheels(int n) {
        this.numWheels = n;
    }
    public void launch(){
        System.out.println("l a u n c h");
    }
    public void drive(){
        System.out.println("Get in loser, we're going shopping.");
    }
    public void enterLand(){
        System.out.println("woooshhh...entering land....");
    }
    public void enterSea(){
        System.out.println("entering sea.....hope we dont die....");
    }
    @Override
    public String toString(){
        return "This is a " + this.getName() + " a type of hovercraft. It can only hold " + this.getMaxPassenger()
                + " people max. Its max speed is " + this.getMaxSpeed() + ". It has " + this.getNumWheels() + " wheels. " +
                "It displaces at " + this.getDisplacement();
    }

}
