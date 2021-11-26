package com.codecool.oop.dates;

import java.time.LocalDate;

public class Event {
    public static final int LOW_IMPORTANCE = 1;
    public static final int MEDIUM_IMPORTANCE = 2;
    public static final int HIGH_IMPORTANCE = 3;
    public final String title;
    public final LocalDate date;
    public final int importance;

    public Event(String title, LocalDate date, int importance) {
        this.title = title;
        this.date = date;
        this.importance = importance;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", importance=" + importance +
                '}';
    }
}
