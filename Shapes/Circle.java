package Shapes;


public class Circle extends Shape {
    private double radius = 1.0;

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.setRadius(radius);
    }
    public Circle(){
        this.setRadius(1.0);
    }
    public Circle(double radius){
        this.setRadius(radius);
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){return this.radius;}
    public double getArea(){return Math.PI * this.radius * this.radius;}
    public double getPerimeter(){return 2 * Math.PI * this.radius;}

    @Override
    public String toString(){
        return "A Circle with radius = " + this.getRadius() + ", which is a subclass of " + super.toString();
    }



}
