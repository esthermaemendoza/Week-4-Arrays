/**
 *
 * @author ADMIN
 */
public class Students {
    private String Names;
    private int[] Quizzes;

    public Students(String Names, int[] Quizzes) {
        this.Names = Names;
        this.Quizzes = Quizzes;
    }

    public double getAverage() {
        if (Quizzes == null || Quizzes.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int a = 0; a < Quizzes.length; a++) {
            sum += Quizzes[a];
        }
        return (double) sum / Quizzes.length;
    }

    public String getName() {
        return Names;
    }

    public int[] getQuizzes() {
        return Quizzes;
    }
}
