import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(int index, Student student) {
        if (index >= 0 && index < students.size()) {
            students.set(index, student);
        }
    }

    public void deleteStudent(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
        }
    }

    public List<Student> getAllStudents() {
        return students;
    }



    public List<Student> searchStudents(String togriKeladiganNimadur) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getIsm().contains(togriKeladiganNimadur) ||
                    student.getFamilya().contains(togriKeladiganNimadur) ||
                    student.getHobbies().toString().contains(togriKeladiganNimadur)) {
                result.add(student);
            }
        }
        return result;
    }

}



