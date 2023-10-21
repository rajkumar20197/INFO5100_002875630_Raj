public class Main {
    public static void main(String[] args) {
        Session session = new Session();

        String[] partTimeNames = generateNames(15, "Part-Time Student");
        String[] fullTimeNames = generateNames(5, "Full-Time Student");

        for (int i = 0; i < 15; i++) {
            PartTimeStudent partTimeStudent = new PartTimeStudent(partTimeNames[i]);
            for (int j = 0; j < 15; j++) {
                partTimeStudent.addQuizScore(j, (int) (Math.random() * 100));
            }
            session.addStudent(partTimeStudent);
        }

        for (int i = 0; i < 5; i++) {
            FullTimeStudent fullTimeStudent = new FullTimeStudent(fullTimeNames[i],
                    (int) (Math.random() * 100), (int) (Math.random() * 100));
            for (int j = 0; j < 15; j++) {
                fullTimeStudent.addQuizScore(j, (int) (Math.random() * 100));
            }
            session.addStudent(fullTimeStudent);
        }
        session.printQuizScoresAscending();
        session.printIndividualQuizScores();
        session.printPartTimeStudents();
        session.printExamScores();
    }

    private static String[] generateNames(int count, String prefix) {
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            names[i] = prefix + " " + (i + 1);
        }
        return names;
}
}