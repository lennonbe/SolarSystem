/**
 * Extension of MyObject once again. Holds the variables for drawing a planet using addObject method from SolarSystem class.
 */
public class MyPlanet extends MyObject
{
    protected double sunDistance, sunAngle, rotationSpeed;
    protected int moons;
    protected MyMoon[] moonsArr;
    
    protected double tempDist = 7;
    protected double tempRot = Math.random() * 5;
    protected double moonSize = 5;

    /**
     * This constructor holds the variables of a MyPlanet object, which then gets passed in to the drawSolarObject.
     * Having these parameters stored in an object allows for easier usability by simply passing in an object to the draw method, 
     * whilst still giving the user the freedom to choose what the actual object looks like, but making it safe whilst only allowing the 
     * user to pass in an object, leaving less room open for error.
     * 
     * 
     * @param distance distance from the centre of the JFrame
     * @param angle angle in polar coordinate system
     * @param diameter diameter of the planet
     * @param col colour of the planet
     * @param sun the sun it rotates around
     * @param speed speed of rotation of the planet
     * @param moons number of moons this planet has
     */
    public MyPlanet(double distance, double angle, double diameter, String col, MySun sun, double speed, int moons)
    {
        super(distance, angle, diameter, col);
        sunDistance = sun.distance;
        sunAngle = sun.angle;
        rotationSpeed = speed;

        moonsArr = new MyMoon[moons];
        
    }

    public void BuildMoons()
    {
        for(int j = 0; j < this.moonsArr.length; j++)
        {
            this.moonsArr[j] = new MyMoon(this.diameter/2 + tempDist, 0, moonSize, "WHITE", this, tempRot);
            tempDist += 6;
            tempRot = Math.random() * 5;
        }
    }

}