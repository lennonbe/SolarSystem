/**
 * MySolarSystem class creates an instance of the SolarSystem class based on the model we want to build
 * the constructor method for this runs a whilee loop which keeps the planetes rotating.
 */
public class MySolarSystem
{
    SolarSystem mySystem = new SolarSystem(600, 600);
    double angleSun = 0;
    double angleEarth = 0;
    double angleMoon = 0; 
    
    /**
     * MySolarSystem constructor builds the solar system based on instance variables of this class.
     * This method also runs a while loop which makes the polar coordinate change in the SolarObjects of this system
     * making for a rotating movement of the earth around the sun and the moon around the earth.
     */
    public MySolarSystem()
    {

        while(true)
        {
            mySystem.drawSolarObject(0, angleSun, 70, "YELLOW");
            mySystem.drawSolarObjectAbout(100, angleEarth, 30, "BLUE", 0, 0);
            mySystem.drawSolarObjectAbout(30, angleMoon, 15, "WHITE", 100, angleEarth);
            mySystem.finishedDrawing();

            angleSun++;
            angleEarth++;
            angleMoon += 3;
        }
    }
}