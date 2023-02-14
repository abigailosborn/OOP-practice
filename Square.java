
/**
 * Inherit from Shape to create Square objects.
 *
 * @author Abigail Osborn
 * @version October 1, 2022
 */
public class Square implements Shape
{
    private int x;
    private int y;
    private double sideLength;
    private String color;
    
    /**
     * 
     * Default constructor for Square class
     * 
     */
    public Square(){
        sideLength = 1.0;
        color = "gray";
        setCoordinates(x,y);
    }
    /**
     * 
     * @param x - x coordinate of point
     * @param y - y coordinate of point
     * @param sideLength - sidelength of the square
     * @param color - color of the square
     * 
     * parameterized constructor for the Square class
     * 
     */
    public Square(int x, int y, double sideLength, String color){
        this.color = color;
        this.sideLength = sideLength;
        setCoordinates(x,y);
    }
    /**
     * 
     * @param x - x coordinate of point
     * @param y - y coordinate of point
     * 
     * Set the values of x and y
     * 
     */
    public void setCoordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
    /**
     * 
     * @return sideLength
     * 
     * access the square's side length
     * 
     */
    public double getSideLength(){
        return sideLength;
    }
    /**
     * 
     * @return color
     * 
     * access the color of the square
     * 
     */
    public String getColor(){
        return color;
    }
    /**
     * 
     * @param sideLength - sidelength of the square
     * 
     * set the value for the sideLength
     * 
     */
    public void setSideLength(double sideLength){
        this.sideLength = sideLength;
    }
    /**
     * 
     * @param color - color of the square
     * 
     * set the value of the color
     * 
     */
    public void setColor(String color){
        this.color = color;
    }
    /**
     * 
     * Method to calculate the surface area of the square
     * 
     * @return area - surface area of the square
     * 
     */
    public double calcSurfaceArea(){
        double area = sideLength * sideLength;
        return area;
    }
    /**
     * 
     * @return String
     * Override the toString method
     * 
     */
    @Override
    public String toString(){
        return "Top left a vertex at (" + x + ", " + y + ") with side length = " + sideLength + ", color = " + color;
    }
}
