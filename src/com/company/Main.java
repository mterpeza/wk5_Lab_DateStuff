package com.company;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {


    /**
     * Create a class that includes a main method that calculates how many days, months and years since U2 released the Joshua Tree album.
     * Rattle and Hum was produced the next year.  Print out when would be released if The Joshua Tree was released today and it took U2 the same amount of time to release the next album.
     * U2:
     * The Joshua Tree		9 March 1987
     * Rattle and Hum		10 October 1988

     *
     * @param args
     */


    public static void main(String[] args) {
        Date joshua = new GregorianCalendar(1987,3,9).getTime();
        Date rattle = new GregorianCalendar(1988,10,10).getTime();
        /** Today's date */
        Date today = new Date();

        // Get msec from each, and subtract.
        long diff = rattle.getTime() - joshua.getTime();
        System.out.println((diff / (1000 * 60 * 60 * 24)) + " days old.");
        long newDate = today.getTime() + diff;
        Date nextAlbum = new Date(newDate);
        DateFormat formatter = DateFormat.getDateTimeInstance(
                DateFormat.LONG,
                DateFormat.LONG,
                Locale.GERMAN);
        System.out.println(formatter.format(nextAlbum));

        //  System.out.println(nextAlbum. + " date of next album.");

    }
}
