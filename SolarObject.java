/**
 * Superclass of all other classes which represent any kind of solar object. Holds the basic necessary variables for building
 * a solar object.
 */
public class SolarObject
{
    protected double distance;
    protected double angle;
    protected double diameter; 
    protected String col;
    
    /**
     * 
     * @param distance the distance from the centre of the frame
     * @param angle angle in the polar coordinates system
     * @param diameter the diameter of the sun object you wish to draw
     * @param col the colour of the object
     */
    public SolarObject(double distance, double angle, double diameter, String col)
    {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
    }

    /**
     * Method which sets the distance of the object from the centre of the frame.
     * @param input the distance you want to place the object at from the centre of the frame
     */
    public void setDistance(double input)
    {
        distance = input;
    }

    /**
     * Sets the colour of the object
     * @param input the colour you wish to set the object to
     */
    public void setColour(String input)
    {
        col = input;
    }
}