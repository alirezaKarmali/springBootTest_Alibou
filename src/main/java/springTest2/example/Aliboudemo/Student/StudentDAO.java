package springTest2.example.Aliboudemo.Student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class StudentDAO {
    private final List<Student> STUDENTS = new ArrayList<>();
    public List<Student> getAllStudent(){

        return STUDENTS;
    }
    public Student save(Student student){
          STUDENTS.add(student);
          return student;
    }

    public Student findByEmail(String email){
        return STUDENTS.stream()
                .filter(s-> email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public Student update(Student s){
        var studentIndex = IntStream.range(0, STUDENTS.size())
                .filter(index-> STUDENTS.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex > -1){
            STUDENTS.set(studentIndex, s);
        }

          return s;
    }

    public String Delete(String email){
        var student = findByEmail(email);
        if(student != null){
            STUDENTS.remove(student);
            return student.getFirstname() +" "+ student.getLastname() + " is deleted "  ;
        }
        else
            return "Student not found!" ;
    }
}
