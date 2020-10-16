public class MyPlanet extends MyObject
{
    protected double sunDistance, sunAngle, rotationSpeed;

    public MyPlanet(double distance, double angle, double diameter, String col, MySun sun, double speed/*double sunDistance, double sunAngle*/)
    {
        super(distance, angle, diameter, col);
        sunDistance = sun.distance;
        sunAngle = sun.angle;
        rotationSpeed = speed;
    }
}