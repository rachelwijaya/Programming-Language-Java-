package Shapes;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double side){
        this.setSide(side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.setSide(side);
    }
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "A square with a side " + this.getSide() + ", which is a subclass of " + super.toString();
    }
}
