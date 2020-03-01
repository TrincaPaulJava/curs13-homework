package curs13.homework;

import java.util.*;

public class DailyPlanner {
    private List<DaySchedule> daySchedule = new ArrayList<>();

    public void addActivity(DaysOfTheWeek day, String activity){
        if (activity.isEmpty()) {
            throw new NoActivityException(activity);
        }
        this.daySchedule.add(new DaySchedule(day, activity));
    }

    public void removeActivity(DaysOfTheWeek day, String activity){
        for(DaySchedule schedule : this.daySchedule){
            if(schedule.getDay().equals(day) && !daySchedule.contains(activity)){
                throw new NoActivityException(activity);
            }
        }
        this.daySchedule.remove(new DaySchedule(day, activity));
    }

    public List<String> getActivities(DaysOfTheWeek day){
        List<String> result = new ArrayList<>();
        for(DaySchedule schedule : this.daySchedule){
            if(schedule.getDay().equals(day)) {
                result.add(schedule.getActivity());
            }
        }
        return result;
    }

    public Map<DaysOfTheWeek, List<String>> endPlanning() throws NoActivitesForDayException {
        Map<DaysOfTheWeek, List<String>> result = new HashMap<>();
        for (DaySchedule schedule : this.daySchedule) {
            if (!result.containsKey(schedule.getDay())) {
                result.put(schedule.getDay(), new ArrayList<>());
            }
            result.get(schedule.getDay()).add(schedule.getActivity());
        }
        List<DaysOfTheWeek> exceptionDays = new ArrayList<>();
        Set<DaysOfTheWeek> dayActivities = result.keySet();
        DaysOfTheWeek[] days = DaysOfTheWeek.values();
        int count = 0;
        for (DaysOfTheWeek day : days) {
            if (!dayActivities.contains(day)) {
               exceptionDays.add(day);
               count++;
            }
        }
        if(count!=0){
            throw new NoActivitesForDayException(exceptionDays);
        }
        return result;
    }
}
