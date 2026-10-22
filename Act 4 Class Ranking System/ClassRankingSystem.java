public class ClassRankingSystem {

    
    public static void main(String[] args) {
        String[] Names = {"Ezekiel", "Joash", "Jeff", "Vince", "Uno"};
        int[][] QuizData = {
            {92, 97, 89, 95},
            {93, 98, 88, 92},
            {94, 99, 87, 83},
            {95, 91, 86, 92},
            {96, 90, 85, 84}
        };

        Students[] students = new Students[Names.length];
        for (int a = 0; a < students.length; a++) {
            students[a] = new Students(Names[a], QuizData[a]);
        }

        for (int a = 0; a < students.length - 1; a++) {
            for (int b = 0; b < students.length - 1 - a; b++) {
                if (students[b].getAverage() < students[b + 1].getAverage()) {
                    Students temp = students[b];
                    students[b] = students[b + 1];
                    students[b + 1] = temp;
                }
            }
        }

        System.out.println("CLASS LEADERBOARD");
        System.out.println("-------------------------------------");
        System.out.printf("%-8s %-11s %-12s%n", "Rank", "Name", "Average");
        System.out.println("-------------------------------------");

        int Rank = 1;
        double epsilon = 0.00001;

        for (int a = 0; a < students.length; a++) {
            if (a > 0 && Math.abs(students[a].getAverage() - students[a - 1].getAverage()) > epsilon) {
                Rank = a + 1;
            }
            System.out.printf("%-8d %-12s %-10.2f%n",
                    Rank, students[a].getName(), students[a].getAverage());
        }
        System.out.println("-------------------------------------");

        String searchName = "Aco";
        int studentRank = findRank(students, searchName);

        if (studentRank != -1) {
            System.out.println(searchName + "'s rank is: " + studentRank);
        } else {
            System.out.println(searchName + " is not found.");
        }
    }

    public static int findRank(Students[] students, String searchName) {
        int currentRank = 1;
        double epsilon = 0.00001;
        
        for (int a = 0; a < students.length; a++) {
            if (a > 0 && Math.abs(students[a].getAverage() - students[a - 1].getAverage()) > epsilon) {
                currentRank = a + 1;
            }
            if (students[a].getName().equalsIgnoreCase(searchName)) {
                return currentRank;
            }
        }
        return -1;
    }
    }
    

