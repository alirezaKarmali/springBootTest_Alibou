package springTest2.example.Aliboudemo.Student;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return service.getAllStudent();
    }

    @GetMapping("/{email}")
    public Student findByEmail(String email){
        return service.findByEmail(email);
    }
    @PostMapping
    public Student save(
            @RequestBody  Student student
    ){
        return  service.save(student);
    }

    @PutMapping
    public Student update(
            @RequestBody  Student student
    ){
        return service.update(student);
    }

    @DeleteMapping("/{email}")
    String Delete(
          @PathVariable  String email
    ){
        return service.Delete(email);
    }
}
