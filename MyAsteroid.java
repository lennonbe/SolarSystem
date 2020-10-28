/**
 * Subclass of MyObject which represents an asteroid. It then can be passed in as parameters to the drawObjectAbout class
 * in SolarSystem, creating a rotating asteroid.
 */
public class MyAsteroid extends SolarObject
{
    protected double rotationSpeed;
    protected SolarObject orbitObject;

    /**
     * 
     * @param distance the distance from the object the asteroid orbits
     * @param angle angle in the polar coordinates system
     * @param diameter the diameter of the asteroid you wish to draw
     * @param col the colour of the asteroid
     * @param obj the object the asteroid orbits around
     * @param speed the speed at which the asteroid orbits
     */
    public MyAsteroid(double distance, double angle, double diameter, String col, SolarObject obj, double speed)
    {
        super(distance, angle, diameter, col);
        rotationSpeed = speed;
        orbitObject = obj;
    }
}