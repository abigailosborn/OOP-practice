
/**
 * Inherit from Shape to create Circle objects.
 *
 * @author Abigail Osborn
 * @version October 3, 2022
 */
public class Circle implements Shape
{
    private int x;
    private int y;
    private double radius;
    private String color;
    /**
     * 
     * Default constructor for cicle class
     * 
     */
    public Circle(){
        radius = 1.0;
        color = "gray";
        setCoordinates(x,y);
    }
    /**
     * 
     * Explicit constructor for the Circle class
     * 
     * @param x - x coordinate of point
     * @param y - y coordinate of point
     * @param radius - radius of the circle
     * @param color - color of the circle
     * 
     */
    public Circle(int x, int y, double radius, String color){
        setCoordinates(x,y);
        this.radius = radius;
        this.color = color;
    }
    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
    /**
     * 
     * @return color - color of the circle
     * 
     * access the color of the circle
     * 
     */
    public String getColor(){
        return color;
    }
    /**
     * 
     * @return radius - radius of the circle
     * 
     * access the radius of the circle
     * 
     */
    public double getRadius(){
        return radius;
    }
    /**
     * 
     * @param color - color of the circle
     * 
     * set the value of the color
     * 
     */
    public void setColor(String color){
        this.color = color;
    }
    /**
     * 
     * @param radius - radius of the circle
     * 
     * set the value of the radius
     * 
     */
    public void setRadius(double radius){
        this.radius = radius;
    }
    /**
     * 
     * Calculate the circle's surface area
     * 
     * @return area - surface area of the circle 
     * 
     */
    public double calcSurfaceArea(){
        double area = Math.PI * (radius * radius);
        return area;
    }
    /**
     * 
     * @return the information for a circle object
     * 
     */
    @Override
    public String toString(){
        return "Centered at (" + x + ", " + y + ") with radius = " + radius + ", color = " + color;
    }
}
