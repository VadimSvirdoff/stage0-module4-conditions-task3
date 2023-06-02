package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month >= 1 && month <= 12) {
            String season;

            if (month >= 3 && month <= 5) {
                season = "Spring";
            } else if (month >= 6 && month <= 8) {
                season = "Summer";
            } else if (month >= 9 && month <= 11) {
                season = "Autumn";
            } else {
                season = "Winter";
            }

            System.out.println(season);
        } else {
            System.out.println("wrong number!");
        }
    }
}
