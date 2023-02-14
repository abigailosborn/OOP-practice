//Your Name 
//Project on Chapter 10
public class Main {
public static void main(String[] args) {
System.out.println("Working with the Square class:");
Square sqr1 = new Square();
Square sqr2 = new Square(10, 20, 5.3, "red");
System.out.println(sqr1);
System.out.println(sqr2);
sqr2.setColor("yellow");
System.out.println("The new color of sqr2 is: " + sqr2.getColor());
System.out.println(sqr2);
System.out.printf("The area of sqr2 with a side length of %.1f is %.1f", 
sqr2.getSideLength(), sqr2.calcSurfaceArea());
System.out.println("\n\nWorking with the Circle class:");
Circle cir1 = new Circle();
Circle cir2 = new Circle(15, 25, 2.2, "blue");
System.out.println(cir1);
System.out.println(cir2);
cir2.setColor("green");
System.out.println("The new color of cir2 is: " + cir2.getColor());
System.out.println(cir2);
System.out.printf("The area of cir2 with a radius of %.1f is %.1f", 
cir2.getRadius(), cir2.calcSurfaceArea());
System.out.println("\n\nWorking with the Cylinder class:");
Cylinder cyl1 = new Cylinder();
Cylinder cyl2 = new Cylinder(25, 35, 7.0, "orange", 12.1);
System.out.println(cyl1);
System.out.println(cyl2);
cyl2.setHeight(20.9);
System.out.println("The new height of cyl2 is: " + cyl2.getHeight());
System.out.println(cyl2);
System.out.printf("The area of cyl2 with a base area of %.1f is %.1f", 
cyl2.getBaseArea(), cyl2.calcSurfaceArea());
}
}