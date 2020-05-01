package Shapes;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this.setColor("green");
        this.setFilled(true);
    }
    public Shape(String color, boolean filled){
        this.setColor(color);
        this.setFilled(filled);
    }
    public String getColor(){return this.color;}
    public void setColor(String color){this.color = color;}

    public boolean isFilled(){
        return this.filled == true;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    @Override
    public String toString(){
        if (!isFilled()){
            return "A shape with a colour of " + this.getColor() + " and is not filled";
        }
        else{
            return "A shape with a colour of " + this.getColor() + " and is filled";
        }

    }
}
