/**
 * MySolarSystem class creates an instance of the SolarSystem class based on the model we want to build
 * the constructor method for this runs a while loop which keeps the planetes rotating.
 */
public class MySolarSystem
{
    SolarSystem mySystem = new SolarSystem(1200, 1200);

    MySun sun = new MySun(0, 0, 66.6, "YELLOW");

    MyPlanet[] planets = new MyPlanet[8];
    MyAsteroid[] asteroidBelt = new MyAsteroid[100];

    double moonSize = 5;
    double distanceBetweenPlanets = 28;
    double asteroidExtra = 20;
    double mercuryDistance = 70;
    double asteroidSpeed = Math.random() * 80;
    
    /*
    For the sake of simplicity i decided not to add all the moons, since jupiter has 70+ for example.
    Due to this i decided to draw the three biggest moons of each planet.
    */

    /**
     * MySolarSystem constructor builds the solar system based on instance variables of this class.
     */
    public MySolarSystem()
    {
        planets[0] = new MyPlanet(mercuryDistance, 0, 6.6, "GREY", sun, 2, 0);
        planets[1] = new MyPlanet(0, 0, 13.3, "ORANGE", sun, 1.5, 0);
        planets[2] = new MyPlanet(0, 0, 20, "BLUE", sun, 1, 1);
        planets[3] = new MyPlanet(0, 0, 16.6, "#5B1B1B", sun, 1.7, 2);
        planets[4] = new MyPlanet(0, 0, 36.6, "#DECA7A", sun, 0.8, 4);
        planets[5] = new MyPlanet(0, 0, 23.3, "#A19C89", sun, 1.1, 0);
        planets[6] = new MyPlanet(0, 0, 20.1, "#40C7C3", sun, 1.2, 0);
        planets[7] = new MyPlanet(0, 0, 16.8, "#435CAE", sun, 1, 0);

        for(int i = 0; i < planets.length; i++)
        {
            planets[i].BuildMoons();
        }

        /*
        Since you cannot access a variable that hasnt been defined I created a setDistance() method
        in order to set the distance of the SolarObjects based on the SolarObjects diameter. This saves passing in values 
        individually and allows for an easier and more trustworthy way of setting the distance.
        By using the for loop and the Planets array I populate the distance variable on every element of
        the array, making it safe and ensuring collisions do not occur.

        The loop starts from the position i=1 because mercury has a stationary position regarding the position of the sun.
        Mercury's position is defined by mercuryDistance value.
        */

        for(int i = 1; i < planets.length; i++)
        {
            //planets[i].setDistance(planets[i - 1].distance + ((planets[i - 1].diameter) / 2 ) + planets[i].diameter/2 + distanceBetweenPlanets);

            if(i == 4)
            {
                planets[i].setDistance(planets[i - 1].distance + ((planets[i - 1].diameter) / 2 ) + planets[i].diameter/2 + distanceBetweenPlanets + asteroidExtra);
            }
            else
            {
                planets[i].setDistance(planets[i - 1].distance + ((planets[i - 1].diameter) / 2 ) + planets[i].diameter/2 + distanceBetweenPlanets);
            }
        }

        for(int i = 0; i < asteroidBelt.length; i++)
        {
            asteroidBelt[i] = new MyAsteroid(planets[3].distance + ((planets[3].diameter) / 2 ) + distanceBetweenPlanets/2, 0, 2, "GREY", sun, asteroidSpeed);
            asteroidSpeed = Math.random() * 80;
        }
    }

    /**
     * This void method runs the solar system by incrementing the angle in the polar coordinates of 
     * the solarObjects and redrawing them in a constantly true while loop.
     */
    public void drawSolarSystem()
    {
        while(true)
        {
            mySystem.drawSolarObject(sun);

            for(int i = 0; i < planets.length; i++)
            {
                mySystem.drawSolarObjectAbout(sun, planets[i]);
                planets[i].angle += planets[i].rotationSpeed;

                for(int j = 0; j < planets[i].moonsArr.length; j++)
                {
                    mySystem.drawSolarObjectAbout(planets[i], planets[i].moonsArr[j]);
                    planets[i].moonsArr[j].angle += planets[i].moonsArr[j].rotationSpeed;
                }
            }

            for(int i = 0; i < asteroidBelt.length; i++)
            {
                mySystem.drawSolarObjectAbout(sun, asteroidBelt[i]);
                asteroidBelt[i].angle += asteroidBelt[i].rotationSpeed;
            }
            
            mySystem.finishedDrawing();
        }
    }
}