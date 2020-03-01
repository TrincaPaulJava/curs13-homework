package curs13.homework;

import static curs13.homework.DaysOfTheWeek.*;

public class Main {
    public static void main(String[] args) throws NoActivitesForDayException {
        DailyPlanner planner = new DailyPlanner();
        planner.addActivity(MONDAY, "running");
        planner.addActivity(MONDAY, "swimming");
        planner.addActivity(TUESDAY, "eating");
        planner.addActivity(SATURDAY, "going out");
        System.out.println(planner.endPlanning());
        System.out.println(planner.getActivities(MONDAY));
        planner.removeActivity(MONDAY,"watching movie");
        System.out.println(planner.getActivities(MONDAY));
        System.out.println(planner.endPlanning());
        //planner.removeActivity(MONDAY, "walking");
        //planner.addActivity(TUESDAY, "");

    }
}
