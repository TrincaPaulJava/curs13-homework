package curs13.homework;

import java.util.Objects;

public class DaySchedule {
    private DaysOfTheWeek day;
    private String activity;

    public DaySchedule(DaysOfTheWeek day, String activity) {
        this.day = day;
        this.activity = activity;
    }

    public DaysOfTheWeek getDay() {
        return day;
    }

    public String getActivity() {
        return activity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return day == that.day &&
                Objects.equals(activity, that.activity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, activity);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activity='" + activity + '\'' +
                '}';
    }
}
