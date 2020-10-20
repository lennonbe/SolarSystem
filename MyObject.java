/**
 * This java class creates an object for my solar system, this is the mother class of all other solar objects. */

public class MyObject
{
    protected double distance;
    protected double angle;
    protected double diameter; 
    protected String col;
    
    public MyObject(double distance, double angle, double diameter, String col)
    {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.col = col;
    }

    public void setDistance(double input)
    {
        distance = input;
    }
}