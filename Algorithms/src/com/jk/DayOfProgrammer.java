package com.jk;

/**
 * Marie invented a Time Machine and wants to test it by time-traveling to visit
 * Russia on the Day of the Programmer (the 256th day of the year) during a year
 * in the inclusive range from 1700 to 2700.
 * <p>
 * From 1700 to 1917, Russia's official calendar was the Julian calendar; since
 * 1919 they used the Gregorian calendar system. The transition from the Julian
 * to Gregorian calendar system occurred in 1918, when the next day after
 * January 31st was February 14th. This means that in 1918, February 14th was
 * the 32nd day of the year in Russia.
 * <p>
 * In both calendar systems, February is the only month with a variable amount
 * of days; it has 29 days during a leap year, and 28 days during all other
 * years. In the Julian calendar, leap years are divisible by 4; in the
 * Gregorian calendar, leap years are either of the following:
 * <p>
 * Divisible by 400. Divisible by 4 and not divisible by 100. Given a year, y,
 * find the date of the 256th day of that year according to the official Russian
 * calendar during that year. Then print it in the format dd.mm.yyyy, where dd
 * is the two-digit day, mm is the two-digit month, and yyyy is .
 * <p>
 * For example, the given year = 1984. 1984 is divisible by 4, so it is a leap
 * year. The 256th day of a leap year after 1918 is September 12, so the answer
 * is 12.09.1984.
 */
public class DayOfProgrammer {
    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        if (year < 1918) {
            // for leap years
            if (year % 4 == 0)
                return "12.09." + year;
                // for non leap years
            else
                return "13.09." + year;
        }
        /*
         * for 1918, special year because 32nd day was 14th February and it was a non
         * leap year. So february had days till 28th. Now from 14th to 28th, wehave 15
         * days. So let's add now: 31+15+31+30+31+30+31+31+26(september) = 256
         */
        else if (year == 1918)
            return "26.09.1918";
            // For leap years in Gregorian Calendar
        else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return "12.09." + year;
        }
        // for non leap years
        else
            return "13.09." + year;

    }

    public static void main(String[] args) {
        int year = 1647;
        System.out.println("The 256th day in the year " + year + " was " + dayOfProgrammer(year));
    }

}
