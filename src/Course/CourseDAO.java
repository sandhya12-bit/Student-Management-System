package Course;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {
    private List<Course> courses = new ArrayList<>();

    public boolean addCourse(Course course) {
        return courses.add(course);
    }

    public boolean updateCourse(Course updatedCourse) {
        for (Course c : courses) {
            if (c.getCourseId() == updatedCourse.getCourseId()) {
                c.setCourseName(updatedCourse.getCourseName());
                c.setCredits(updatedCourse.getCredits());
                return true;
            }
        }
        return false;
    }

    public boolean deleteCourse(int courseId) {
        return courses.removeIf(c -> c.getCourseId() == courseId);
    }

    public List<Course> getAllCourses() {
        return courses;
    }
}

