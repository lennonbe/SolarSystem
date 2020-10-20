/**
 * Extension of MyObject once again. Holds the variables for drawing a planet using addObject method from SolarSystem class.
 */
public class MyPlanet extends MyObject
{
    protected double sunDistance, sunAngle, rotationSpeed;

    public MyPlanet(double distance, double angle, double diameter, String col, MySun sun, double speed)
    {
        super(distance, angle, diameter, col);
        sunDistance = sun.distance;
        sunAngle = sun.angle;
        rotationSpeed = speed;
    }

}