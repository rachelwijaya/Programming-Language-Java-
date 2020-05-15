package Interfaces;

public class Frigate implements SeaVessel {
    private String name = "";
    private int maxPassenger = 0;
    private double maxSpeed = 0;
    private double displacement = 0;

    Frigate(String name, int maxPassenger, double maxSpeed, double displacement){
        setName(name);
        setMaxPassenger(maxPassenger);
        setMaxSpeed(maxSpeed);
        setDisplacement(displacement);
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
    public void launch(){
        System.out.println("l a u n c h");
    }
    public void fireGun(){
        System.out.println("pew pew!.... this got me thinking of pewdiepie");
    }
    @Override
    public String toString(){
        return "This is a " + this.getName() + ", a type of Frigate, with a max speed of " + this.getMaxSpeed() + ", " +
                "maxing at " + this.getMaxPassenger() + "number of passengers and a displacement of " + this.getDisplacement() + ".";
    }
}
