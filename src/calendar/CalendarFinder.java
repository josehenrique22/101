package calendar;
import java.util.Scanner;

public class CalendarFinder {
    public static void main(String[] args) {

        System.out.println("Calendar & Day of the Week Finder");
        System.out.println("\n");

        int x, y, i = 0;
        String z = "";
        int yc = 0;
        int m1 = 0;
        int date;
        Scanner s = new Scanner(System.in);

        // Date
        System.out.println("Enter Moth: ");
        date = s.nextInt();
        String m = s.next();
        String mj = "January";
        String mf = "February";

        // Year
        System.out.println("Enter Year: ");
        x = s.nextInt();
        int leap = x % 4;
        System.out.println("Day for " + date + "/" +
                m + "/" + x + " is: ");
        int firstD = x / 100; // First two digit of the year
        while (i < 2) {
            y = x % 10;
            z = y + "" + z;
            x = x / 10;
            i++;
        }
        int lastD = Integer.parseInt(z); // Last two digit of the year
        // Year code yc
        switch (firstD) {
            case 16:
                yc = 6;
                break;
            case 17:
                yc = 4;
                break;
            case 18:
                yc = 2;
                break;
            case 19:
                yc = 0;
                break;
            case 20:
                yc = 6;
                break;
            default:
                System.out.println("Check Year");
        }

        // Month Code
        switch (m) {
            case "January":
                m1=0;
                break;
            case "February":
                m1=3;
                break;
            case "March":
                m1=3;
                break;
            case "April":
                m1=6;
                break;
            case "May":
                m1=1;
                break;
            case "June":
                m1=4;
                break;
            case "July":
                m1=6;
                break;
            case "August":
                m1=2;
                break;
            case "September":
                m1=5;
                break;
            case "October":
                m1=0;
                break;
            case "November":
                m1=3;
                break;
            case "December":
                m1=5;
                break;
            default:
                System.out.println("No match"+" "+"Check Month");
        }

        int a1 = lastD / 4;
        int f = lastD + a1 + date + yc + m1;
        // For Year And January Month
        if ((leap == 0) && (m.equals(mj)) ) {
            int f2 = f - 1;
            int f1 = f2 % 7;
            switch (f1) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Check Date,Month,Year");
                    break;
            }
        }         // For leap Year and February Month
        else if ((leap == 0) && (m.equals(mf))) {
            int f3 = f - 1;
            int f1 = f3 % 7;
            switch (f1) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Check Date,Month,Year");
                    break;
            }
        }
        // For Other Conditions
        else {
            int f1 = f % 7;
            switch (f1) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Check Date,Month,Year");
                    break;
            }
        }

    }
}
