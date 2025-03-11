package springTest2.example.Aliboudemo.Student;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class InMemoryStudentService implements StudentService{

    private final StudentDAO dao;

    public InMemoryStudentService(StudentDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Student> getAllStudent() {
        return dao.getAllStudent();
    }

    @Override
    public Student save(Student student) {
        return dao.save(student);
    }

    @Override
    public Student update(Student student) {
        return dao.update(student);
    }

    @Override
    public String Delete(String email) {
        return dao.Delete(email);
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

}
