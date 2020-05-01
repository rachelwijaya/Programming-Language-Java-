package Shapes;

public class Driver {
    public static void main(String[] args){
        // SHAPE CLASS ONLY DEMO
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("pink", false);
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());

        // CIRCLE CLASS DEMO
        Circle c1 = new Circle();
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        Circle c2 = new Circle(4.0);
        System.out.println(c2.toString());
        Circle c3= new Circle(2.0, "purple", true);
        System.out.println(c3.toString());

        // RECTANGLE CLASS DEMO
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        Rectangle r2= new Rectangle(4.2, 3.9);
        System.out.println("Area of r2 = " + r2.getArea());
        System.out.println("Perimeter of r2 = " + r2.getPerimeter());
        Rectangle r3 = new Rectangle(2.4, 5.2, "yellow", false);
        System.out.println(r3.toString());

        // SQUARE CLASS DEMO
        Square s1 = new Square();
        System.out.println(s1.toString());
        Square s2 = new Square(2.3);
        System.out.println("Area of s2 = " + String.format("%.2f",s2.getArea()));
        System.out.println("Perimeter of s2 = " + s2.getPerimeter());
        Square s3 = new Square(4.2, "black", true);
        System.out.println(s3.toString());





    }
}
