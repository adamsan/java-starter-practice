package com.codecool.oop.dates;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface Agenda {
    Map<LocalDate, List<Event>> getFutureEvents();

    Event findNextEvent();

    Event findNextImportantEvent();

    List<Event> findEventsOnWeekends();
}
