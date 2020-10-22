/**
 * An extend class of my object. This class creates the instance of a moon which then can be passed in as parameters to the drawObject class
 * in SolarSystem.
 */
public class MyMoon extends MyObject
{
    protected double rotationSpeed;
    protected MyPlanet orbitPlanet;

    public MyMoon(double distance, double angle, double diameter, String col, MyPlanet planet, double speed)
    {
        super(distance, angle, diameter, col);
        rotationSpeed = speed;
        orbitPlanet = planet;
    }
}