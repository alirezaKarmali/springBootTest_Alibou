package springTest2.example.Aliboudemo.Student;



import java.util.List;


public interface StudentService {
    List<Student> getAllStudent();
    Student save(Student student);
    Student update(Student student);
    String Delete(String email);
    Student findByEmail(String email);
}
