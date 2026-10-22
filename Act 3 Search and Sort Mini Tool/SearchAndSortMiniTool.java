import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class SearchAndSortMiniToolWeek5 {
    public static void main(String[] args) {
        int[] Scores = {85, 80, 75, 93, 100, 95, 98, 90};
        int targ = 75;
        boolean found = false;

        for (int a = 0; a < Scores.length; a++) {
            if (Scores[a] == targ) {
                System.out.println(targ + " was found at index " + a);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(targ + " was not found.");
        }

        // sorting a copy in order to make the original scores stay the same.
        int[] sortedScores = Arrays.copyOf(Scores, Scores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original Array: " + Arrays.toString(Scores));
        System.out.println("Sorted Array: " + Arrays.toString(sortedScores));
    }
}
