/**
 * MySolarSystem class creates an instance of the SolarSystem class based on the model we want to build
 * the constructor method for this runs a whilee loop which keeps the planetes rotating.
 */
public class MySolarSystem
{
    SolarSystem mySystem = new SolarSystem(1000, 1000);

    MySun sun = new MySun(0, 0, 66.6, "YELLOW");

    MyPlanet[] planets = new MyPlanet[8];
    
    /*
    For the sake of simplicity i decided not to add all the moons, since jupiter has 70+ for example.
    Due to this i decided to draw the three biggest moons of each planet.
    */

    /**
     * MySolarSystem constructor builds the solar system based on instance variables of this class.
     * This method also runs a while loop which makes the polar coordinate change in the SolarObjects of this system
     * making for a rotating movement of the earth around the sun and the moon around the earth.
     */
    public MySolarSystem()
    {
        planets[0] = new MyPlanet(70, 0, 6.6, "GREY", sun, 2, 0);
        planets[1] = new MyPlanet(0, 0, 13.3, "ORANGE", sun, 1.5, 0);
        planets[2] = new MyPlanet(0, 0, 20, "BLUE", sun, 1, 1);
        planets[3] = new MyPlanet(0, 0, 16.6, "#5B1B1B", sun, 1.7, 2);
        planets[4] = new MyPlanet(0, 0, 36.6, "#DECA7A", sun, 0.8, 4);
        planets[5] = new MyPlanet(0, 0, 23.3, "#A19C89", sun, 1.1, 0);
        planets[6] = new MyPlanet(0, 0, 20.1, "#40C7C3", sun, 1.2, 0);
        planets[7] = new MyPlanet(0, 0, 16.8, "#435CAE", sun, 1, 0);

        for(int i = 0; i < planets.length; i++)
        {
            for(int j = 0; j < planets[i].moonsArr.length; j++)
            {
                int temp = 5;
                planets[i].moonsArr[j] = new MyMoon(planets[i].diameter/2 + 5, 0, 4, "WHITE", planets[i], 1.4);

                //temp += 5;
            }
        }

        /*
        Since you cannot access a variable that hasnt been defined I created a setDistance() method
        in order to set the distance of the SolarObjects based on the SolarObjects diameter. This saves passing in values 
        individually and allows for an easier and more trustworthy way of setting the distance.
        By using the for loop and the Planets array I populate the distance variable on every element of
        the array, making it safe and ensuring collisions do not occur.
        */
        for(int i = 1; i < 8; i++)
        {
            planets[i].setDistance(planets[i - 1].distance + ((planets[i - 1].diameter) / 2 ) + planets[i].diameter/2 + 15);
        }
    }

    /**
     * This void method runs the solar system by incrementing the angle in the polar coordinates of 
     * the solarObjects.
     */
    public void drawSolarSystem()
    {
        while(true)
        {
            mySystem.drawSolarObject(sun);

            for(int i = 0; i < planets.length; i++)
            {
                mySystem.drawSolarObjectAbout(sun, planets[i]);

                for(int j = 0; j < planets[i].moonsArr.length; j++)
                {
                    if(planets[i].moonsArr.length > 0)
                    {
                        mySystem.drawSolarObjectAbout(planets[i], planets[i].moonsArr[j]);
                        planets[i].moonsArr[j].angle += planets[i].moonsArr[j].rotationSpeed;
                    }
                }
                
                planets[i].angle += planets[i].rotationSpeed;
            }
            
            mySystem.finishedDrawing();
        }
    }
}