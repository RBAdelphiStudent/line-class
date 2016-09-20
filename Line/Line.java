
/**
 * This class creates the equation of a line based on an inputted slope and y-intercept.
 * 
 * @author Ryan Barrett
 * @version 1.0
 */
public class Line
{
    //Declares the String variable that will contain the data of the line of the equation.
    private String lineEquation;
    /**
     * Initializes a line's equation based on an inputted slope and y-intercept.
     * Two doubles, named slope and yIntercept, are input by the user.
     * The constructor initializes a String value for lineEquation in a y=mx+b format.
     * m=slope
     * b=yIntercept
     * Example: The user inputs 3.5 for slope and 2 for yIntercept.
     * String lineEquation will be y=3.5x+2
     */
    public Line(double slope, double yIntercept)
    {
        lineEquation="y="+slope+"x+"+yIntercept;
    }

    /**
     * Prints the line's equation (String lineEquation)
     * This method has no inputs and prints lineEquation when initialized.
     * Example: lineEquation= y=3.5x+2
     * The system outputs and prints:
     * y=3.5x+2
     */
    public void getLineEquation()
    {
       System.out.println(lineEquation);
    }
}
