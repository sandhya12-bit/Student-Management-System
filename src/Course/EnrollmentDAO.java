package Course;
import java.util.*;
public class EnrollmentDAO {
// studentId -> list of courses
    private Map<Integer, List<Course>> enrollments = new HashMap<>();

    public boolean enrollStudent(int studentId, int courseId, List<Course> allCourses) {
        for (Course c : allCourses) {
            if (c.getCourseId() == courseId) {
                enrollments
                    .computeIfAbsent(studentId, k -> new ArrayList<>())
                    .add(c);
                return true;
            }
        }
        return false;
    }

    public boolean removeEnrollment(int studentId, int courseId) {
        List<Course> courses = enrollments.get(studentId);
        if (courses != null) {
            return courses.removeIf(c -> c.getCourseId() == courseId);
        }
        return false;
    }

    public List<Course> getCoursesByStudent(int studentId) {
        return enrollments.getOrDefault(studentId, new ArrayList<>());
    }
}

