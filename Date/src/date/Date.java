/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

/**
 *
 * @author Alex
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
    
    public String dateAsString()
    {
        String dateString = 
                String.format( "%d/%d/%d", this.getDay(), this.getMonth(), 
                this.getYear());
        return dateString;
    }
    
    
}
