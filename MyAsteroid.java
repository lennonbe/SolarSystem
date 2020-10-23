/**
 * An extend class of my object. This class creates the instance of a moon which then can be passed in as parameters to the drawObject class
 * in SolarSystem.
 */
public class MyAsteroid extends MyObject
{
    protected double rotationSpeed;
    protected MyObject orbitObject;

    public MyAsteroid(double distance, double angle, double diameter, String col, MyObject obj, double speed)
    {
        super(distance, angle, diameter, col);
        rotationSpeed = speed;
        orbitObject = obj;
    }
}