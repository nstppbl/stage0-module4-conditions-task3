package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month >=3 && month <= 5) {
            System.out.println("Spring");
        } if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } if (month >= 9 && month <= 11) {
            System.out.println("Fall");
        } if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month >= 13) {
            System.out.println("Wrong number");
        }
    }
}
