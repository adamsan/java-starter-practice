package com.codecool.oop.dates;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Write a calendar events program:
 * - data model: Event - contains the title of the event, the Date of the event, and the importance of the event [1,2,3].
 * <p>
 * - Create an interface with the following methods, then create and implementation for it:
 * - getFutureEvents - returns with a Map wit ha list of events for each day.
 * - findNextEvent() - returns with the next Event from now
 * - findNextImportantEvent - returns with the next important event from now.
 * - findEventsOnWeekends - returns with all the events for next weekend.
 */
public class App {
    public static void main(String[] args) {
        Agenda agenda = new AgendaImpl();

        System.out.println("Future events:");
        printEvents(agenda.getFutureEvents());
        System.out.println();

        System.out.println("Next event:");
        System.out.println(agenda.findNextEvent());

        System.out.println("Next important event:");
        System.out.println(agenda.findNextImportantEvent());

        System.out.println("Weekend events:");
        System.out.println(agenda.findEventsOnWeekends());
    }

    private static void printEvents(Map<LocalDate, List<Event>> events) {
        List<LocalDate> dates = new ArrayList<>(events.keySet());
        Collections.sort(dates);
        for (LocalDate d : dates) {
            System.out.println("Date:" + d);
            System.out.println(events.get(d));
        }
    }
}
