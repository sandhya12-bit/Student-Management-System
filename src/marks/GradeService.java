package marks;

public class GradeService {

    // Calculate grade based on marks
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Assign grade to Marks object
    public boolean assignGrade(Marks marks) {
        String grade = calculateGrade(marks.getMarks());
        marks.setGrade(grade);
        return true;
    }
}
