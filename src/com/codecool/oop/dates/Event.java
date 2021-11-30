package com.codecool.oop.dates;

import java.time.LocalDate;

public class Event {
    public final String title;
    public final LocalDate date;
    public final Importance importance;

    public Event(String title, LocalDate date, Importance importance) {
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
