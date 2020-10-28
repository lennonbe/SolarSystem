/**
 * Subclass of MyObject. Holds the variables for drawing a planet using addObject method from SolarSystem class.
 * Some new variables used are the moonsArr which is the array of moons which the planet can possibly have.
 * The sun distance which is the distance parameter of sun, the moons varaible which is the number of moons 
 * the planet has, the distMoons which is the distance between moons which is set to 7, rotSpeed which is the moons rotation 
 * speed which gets randomly generated with every moon and the moonSize variable which is the size of the moons, set to a constant 5. 
 */
public class MyPlanet extends SolarObject
{
    protected double sunDistance, sunAngle, rotationSpeed;
    protected int moons;
    protected MyMoon[] moonsArr;
    
    protected double distMoons = 7;
    protected double rotSpeed = Math.random() * 5;
    protected double moonSize = 5;

    /**
     * This constructor holds the variables of a MyPlanet object, which then gets passed in to the drawSolarObject.
     * Having these parameters stored in an object allows for easier usability by simply passing in an object to the draw method, 
     * whilst still giving the user the freedom to choose what the actual object looks like, but making it safe whilst only allowing the 
     * user to pass in an object, leaving less room open for error.
     * 
     * 
     * @param distance distance from the sun 
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

    /**
     * This method when called upon a planet builds the moons of the planet, using a
     * for loop and randomly generating the rotation speed of the moons as a value between 0 and 5, using the rand method 
     * and storing it in rotSpeed variable.
     */
    public void BuildMoons()
    {
        for(int j = 0; j < this.moonsArr.length; j++)
        {
            this.moonsArr[j] = new MyMoon(this.diameter/2 + distMoons, 0, moonSize, "WHITE", this, rotSpeed);
            distMoons += 6;
            rotSpeed = Math.random() * 5;
        }
    }

}