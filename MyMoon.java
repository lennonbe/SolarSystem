/**
 * Subclass of my object used to represent the moon object.
 * A few different varibales are used such as rotation speed which is the moons orbiting
 * speed and orbitPlanet, which is the planet it orbits around.
 */
public class MyMoon extends SolarObject
{
    protected double rotationSpeed;
    protected MyPlanet orbitPlanet;

    /**
     * 
     * @param distance the distance from the planet the moon orbits
     * @param angle angle in the polar coordinates system
     * @param diameter the diameter of the moon you wish to draw
     * @param col the colour of the moon
     * @param planet the planet the moon orbits around
     * @param speed the speed at which the moon orbits
     */
    public MyMoon(double distance, double angle, double diameter, String col, MyPlanet planet, double speed)
    {
        super(distance, angle, diameter, col);
        rotationSpeed = speed;
        orbitPlanet = planet;
    }
}