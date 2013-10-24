package date;

/**
 * @author Alex Macniven
 * A class to represent a date as three integer values, day, month, and year.
 */
public class Date
{
    // Instance variables
    private int day;
    private int month;
    private int year;
    private boolean leap;
	
    // Constructor
    public Date( int inDay, int inMonth, int inYear )
    {
        day = inDay;
	month = inMonth;
	year = inYear;
    }
	
    // Set day
    public void setDay( int inDay )
    {
	day = inDay;
    }
    // Get day
    public int getDay()
    {
	return day;
    }
	
    // Set month
    public void setMonth( int inMonth )
    {
	month = inMonth;
    }
    // Get month
    public int getMonth()
    {
        return month;
    }
	
    // Set year
    public void setYear( int inYear )
    {
	year = inYear;
    }
    // Get year
    public int getYear()
    {
	return year ;
    }
    
    /**
    * Method to check whether the given year is leap. Returns a boolean true
    * if the year is leap and false if the year isn't leap.
    * The math used for a true return of a leap year;
    * 1. Year is divisible by 4, and not by 100.
    * 2. Year is divisible by 4, and by 100, and by 400.
    */
    public boolean checkForLeap()
    {
        int inYear = this.getYear();
        if( inYear % 4 == 0 ) // If the year is divisible by 4
        {
            if( inYear % 100 != 0 ) // and not by 100...
            {
                leap = true;
            }
            else // If it is divisible by 100
            {
                if( inYear % 400 == 0) // and by 400...
                {
                    leap = true;
                }
                else 
                {
                    leap = false;
                }
            }
        }
        else
        {
            leap = false;
        }
        return leap;
    }
    
    /**
     * Creates a String which calls methods getDay(), getMonth(), getYear() and
     * returns them in the String format "dd/mm/yyyy"
     */
    public String dateAsString()
    {
        String dateString = 
                String.format( "%d/%d/%d", this.getDay(), this.getMonth(), 
                this.getYear());
        return dateString;
    }
    
    
}
