import db.DBHelper;
import models.Course;
import models.Lesson;
import models.Mentor;
import models.Student;

public class Runner {

    public static void main(String[] args) {

        Course course = new Course("java", "phd");
        DBHelper.save(course);
        Lesson lesson = new Lesson("Hibernate", 1, course);
        DBHelper.save(lesson);
        Student student = new Student("Harry", 40, 1, course);
        DBHelper.save(student);

        Mentor mentor = new Mentor("Mr Smith", student);
        DBHelper.save(mentor);

    }

}
