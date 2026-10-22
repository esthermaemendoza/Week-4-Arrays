/**
 *
 * @author ADMIN
 */
public class ClassStatisticsCalculatorWeek5 {
    public static void main(String[] args) {
        int[] Scores = {75, 80, 85, 90, 93, 95, 98, 100};

        int sum = 0;
        int highest = Scores[0];
        int lowest = Scores[0];

        for (int a = 0; a < Scores.length; a++) {
            sum += Scores[a];

            if (Scores[a] > highest) {
                highest = Scores[a];
            }

            if (Scores[a] < lowest) {
                lowest = Scores[a];
            }
        }

        double ave = (double) sum / Scores.length;

        System.out.println("Class Statistics");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + ave);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
