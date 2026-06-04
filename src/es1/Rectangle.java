package es1;

public class Rectangle {

//    attribute
    private double height;
    private double width;

//    constructor
    public Rectangle(double height, double width){
       this.height = height;
       this.width = width;
    }

//    Metodi di Istanza, hanno bisogno di un oggetto già creato:
//    quale height? quale width? Esistono più rettangoli
    public double getPerimeter(){
        return (height + width)*2;
    }

    public double getArea(){
        return(height * width);
    }

//    il metodo lavora solo sul parametro rectangle che gli viene passato,
//    non ha bisogno di un oggetto Rectangle con i suoi attributi
    public static void stampaRettangolo(Rectangle rectangle){
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }

    public static void stampaDueRettangoli (Rectangle rectangle2, Rectangle rectangle3){
        System.out.println("Perimeter1: " + rectangle2.getPerimeter());
        System.out.println("Area1: " + rectangle2.getArea());
        System.out.println("Perimeter2: " + rectangle3.getPerimeter());
        System.out.println("Area2: " + rectangle3.getArea());

        System.out.println("Area Sum: " + (rectangle2.getArea() + rectangle3.getArea()));
        System.out.println("Perimeter Sum: " + (rectangle2.getPerimeter() + rectangle3.getPerimeter()));
    }

}
