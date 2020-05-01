package Shapes;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
        super();
        this.setLength(1.0);
        this.setWidth(1.0);
    }
    public Rectangle(double width, double length){
        super();
        this.setWidth(width);
        this.setLength(length);
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.setLength(length);
        this.setWidth(width);
    }
    public double getWidth(){return this.width;}
    public void setWidth(double width){this.width = width;}
    public double getLength(){return this.length;}

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.getLength() * this.getWidth();
    }
    public double getPerimeter(){
        return (2 * this.getWidth()) + (2 * this.getLength());
    }
    @Override
    public String toString(){
        return "A rectangle with a width = " + this.getWidth() + " and length = " + this.getLength() +", which is" +
                " a subclass of " + super.toString();
    }
}
