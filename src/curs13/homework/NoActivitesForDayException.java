package curs13.homework;


import java.util.List;

public class NoActivitesForDayException extends Exception{
    private final List<DaysOfTheWeek> days;

    public NoActivitesForDayException(List<DaysOfTheWeek> days) {
        super("There are no activities for " + days);
        this.days = days;
    }
    public List<DaysOfTheWeek> getDays() {
        return this.days;
    }
}
