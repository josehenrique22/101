package oop;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeAndDate {
    // Java does not have a built-in Date class, but we can import the java.time package
    // to work with the date and time API. the package includes many date and time

    // Class	Description
    //  LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
    //  LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
    //  LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
    //  DateTimeFormatter	Formatter for displaying and parsing date-time objects

    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now(); // Create data obj
        System.out.println("Display Current Date: " + myDate);

    // Display Current Time
        //To display the current time (hour, minute, second, and nanoseconds), import the java.time.LocalTime class, and use its now() method:
        LocalTime myTime = LocalTime.now();
        System.out.println("Display Current Time: " + myTime);

    // Display Current Date and Time
    // To display the current date and time, import the java.time.LocalDateTime class, and use its now() method:
        LocalTime myLocalTime = LocalTime.now();
        System.out.println("Display Current Time: " + myTime);

    // Formatting Date and Time
    //The "T" in the example above is used to separate the date from the time. You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects. The following example will remove both the "T" and nanoseconds from the date-time:
        LocalDateTime myLocalDataTime = LocalDateTime.now();
        System.out.println("Before formatting: " + myLocalDataTime);
        DateTimeFormatter myFormatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myLocalDataTime.format(myFormatDate);
        System.out.println("After formatting: " + formattedDate);
        // yyyy-MM-dd	"1988-09-29"
        //  dd/MM/yyyy	"29/09/1988"
        //  dd-MMM-yyyy	"29-Sep-1988"
        //  E, MMM dd yyyy	"Thu, Sep 29 1988"
    }
}
