package springTest2.example.Aliboudemo.Student;

import java.time.LocalDate;

public class Student {
    private String firstname;
    private String lastname;
    private LocalDate date;
    private String email;
    private int Age;

    public Student(String firstname, String lastname, LocalDate date, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.date = date;
        this.email = email;
        Age = age;
    }

    public Student() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
