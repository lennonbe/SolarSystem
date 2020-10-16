/**
 * MySolarSystem class creates an instance of the SolarSystem class based on the model we want to build
 * the constructor method for this runs a whilee loop which keeps the planetes rotating.
 */
public class MySolarSystem
{
    SolarSystem mySystem = new SolarSystem(800, 800);
    /*double angleSun = 0;
    double angleEarth = 0;
    double angleMoon = 0; */

    MySun sun = new MySun(0, 0, 150, "YELLOW");

    MyPlanet earth = new MyPlanet(sun.distance + sun.diameter + 50, 0, 50, "BLUE", sun, 1.5);
    /**
     * MySolarSystem constructor builds the solar system based on instance variables of this class.
     * This method also runs a while loop which makes the polar coordinate change in the SolarObjects of this system
     * making for a rotating movement of the earth around the sun and the moon around the earth.
     */
    public MySolarSystem()
    {
        while(true)
        {
            mySystem.drawSolarObject(sun.distance, sun.angle, sun.diameter, sun.col);
            mySystem.drawSolarObjectAbout(earth.distance, earth.angle, earth.diameter, earth.col, earth.sunDistance, earth.sunAngle);
            mySystem.finishedDrawing();

            earth.angle += earth.rotationSpeed;
        }
    }
}