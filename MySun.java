/**
 * Subclass of myObject which represents the sun. close to no differences from the MyObject class,
 * making it the most basic object in this solar system.
 */
public class MySun extends SolarObject
{
    /**
     * MySun constructor, which takes in all the values used in MyObject but automatically puts sun in the center of the frame.
     * @param distance the distance from the centre of the frame
     * @param angle angle in the polar coordinates system
     * @param diameter the diameter of the sun object you wish to draw
     * @param col the colour of the object
     */
    public MySun(double distance, double angle, double diameter, String col)
    {
        super(0, 0, diameter, "YELLOW");
    }
}