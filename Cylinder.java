
/**
 * Inherit from Circle to create Cylinder objects.
 *
 * @author Abigail Osborn
 * @version October 3, 2022
 */
public final class Cylinder extends Circle
{
    //initialize height
    private double height;
    
    /**
     * 
     * default construtor for Cylinder
     * 
     */
    public Cylinder(){
        super();
        height = 1.0;
    }
    /**
     * 
     * Explicit constructor for the Cylindre class
     * 
     * @param x - x coordinate of point
     * @param y - y coordinate of point
     * @param radius - radius of the cylinder
     * @param color - color of the cylinder
     * @param height - height of cylinder
     * 
     */
    public Cylinder(int x, int y, double radius, String color, double height){
        super(x, y, radius, color);
        this.height = height;
    }
    /**
     * 
     * Set the height of the cylinder
     * 
     * @param height - height of cylinder
     * 
     */
    public void setHeight(double height){
        this.height = height;
    }
    /**
     * 
     * Accessor method for the cylinder's height
     * 
     * @return height - height of cylinder
     * 
     */
    public double getHeight(){
        return height;
    }
    /**
     * 
     * Calculate the surface  area of the cylinder
     * 
     * @return surfaceArea - surface area of the cylinder
     * 
     */
    @Override
    public double calcSurfaceArea(){
        double surfaceArea = (2 * Math.PI * getRadius() * height) + (2 * Math.PI * getRadius() * getRadius());
        return surfaceArea;
    }
    /**
     * 
     * Method that accesses the calculated surface area
     * from the Circle class
     * 
     * @return super.calcSurfaceArea()
     * 
     */
    public double getBaseArea(){
        return super.calcSurfaceArea();
    }
    /**
     * 
     * Override the toString method
     * 
     */
    @Override
    public String toString(){
        return super.toString() + ", height = " + height;
    }
}
