/**
 * Date
 */
public class Date {

    public int month; 
    public int day;
    public int year;

    public Date (int month, int day, int year )
    {
        this.month = month; 
        this.day = day;
        this.year = year;
    }

    public Date ( String Month_Name, int day, int year)
    {
        this.day = day;
        this.year = year;
        if (Month_Name.equals("January")) this.month = 1;
        else if (Month_Name.equals("February")) this.month = 2;
        else if (Month_Name.equals("March")) this.month = 3;
        else if (Month_Name.equals("April")) this.month = 4;
        else if (Month_Name.equals("May")) this.month = 5;
        else if (Month_Name.equals("June")) this.month = 6;
    }

    public Date ( int day_number_of_year , int year)
    {
        this.year = year;
        
    })
}