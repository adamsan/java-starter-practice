package com.codecool.oop.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class AgendaImpl implements Agenda {
    private Map<LocalDate, List<Event>> eventsMap = new HashMap<>();

    public AgendaImpl() {

        LocalDate today = LocalDate.now();
        LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        LocalDate nextSaturday = today.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        LocalDate nextSunday = today.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        LocalDate twoWeeksAfterSunday = nextSunday.minusWeeks(2);

        add(new Event("Today's task", today, Importance.LOW));
        add(new Event("Checking registration", nextMonday, Importance.LOW));
        add(new Event("Visiting the barber", nextTuesday, Importance.LOW));
        add(new Event("HIIT training with J", nextTuesday, Importance.HIGH));
        add(new Event("Fishing", nextSaturday, Importance.MEDIUM));
        add(new Event("Fixing chair", nextSunday, Importance.MEDIUM));
        add(new Event("Call grandma", nextSunday, Importance.LOW));
        add(new Event("Celebrating the future", twoWeeksAfterSunday, Importance.LOW));
    }

    public void add(Event event) {
        if (!eventsMap.containsKey(event.date)) {
            eventsMap.put(event.date, new ArrayList<>());
        }
        eventsMap.get(event.date).add(event);
    }

    @Override
    public Map<LocalDate, List<Event>> getFutureEvents() {
        Set<LocalDate> dates = eventsMap.keySet();
        Map<LocalDate, List<Event>> m = new HashMap<>();
        LocalDate today = LocalDate.now();
        for (LocalDate d : dates) {
            if (d.isAfter(today)) {
                m.put(d, new ArrayList<>(eventsMap.get(d)));
            }
        }
        return m;
    }

    @Override
    public Event findNextEvent() {
        Map<LocalDate, List<Event>> events = getFutureEvents();
        if (events.keySet().isEmpty()) return null;
        LocalDate min = Collections.min(events.keySet());
        return events.get(min).get(0);
    }

    @Override
    public Event findNextImportantEvent() {
        Map<LocalDate, List<Event>> events = getFutureEvents();
        List<LocalDate> dates = new ArrayList<>(events.keySet());
        Collections.sort(dates);

        for (LocalDate d : dates) {
            for (Event e : events.get(d)) {
                if (e.importance == Importance.HIGH) {
                    return e;
                }
            }
        }
        return null;
    }

    @Override
    public List<Event> findEventsOnWeekends() { // Finds Events for next weekends
        Map<LocalDate, List<Event>> events = getFutureEvents();
        List<Event> result = new ArrayList<>();
        for (LocalDate date : nextWeekendDates()) {
            if (events.containsKey(date))
                result.addAll(events.get(date));
        }
        return result;
    }

    private List<LocalDate> nextWeekendDates() {
        List<LocalDate> nextWeekend = new ArrayList<>();
        LocalDate now = LocalDate.now();
        for (int i = 1; i < 8; i++) {
            LocalDate d = now.plusDays(i);
            DayOfWeek day = d.getDayOfWeek();
            if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                nextWeekend.add(d);
            }
        }
        System.out.println(nextWeekend);
        return nextWeekend;
    }
}
