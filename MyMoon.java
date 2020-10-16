public class MyMoon extends MyObject
{
    protected double planetDistance, planetAngle, rotationSpeed;

    public MyMoon(double distance, double angle, double diameter, String col, MyPlanet planet, double speed/*double planetDistance, double planetAngle*/)
    {
        super(distance, angle, diameter, col);
        planetDistance = planet.distance;
        planetAngle = planet.angle;
        rotationSpeed = speed;
    }
}