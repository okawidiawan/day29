package co.g2academy.day29assignment.day29assignment.controller;

import co.g2academy.day29assignment.day29assignment.model.Student;
import co.g2academy.day29assignment.day29assignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    public String save(@RequestBody Student student) {
        studentRepository.save(student);
        return "Success Added New Student : " + student.getName();
    }

    @PutMapping("/student/{id}")
    public String update(@RequestBody Student student) {
        studentRepository.save(student);
        return "Success Update Student : " + student.getName();
    }

    @DeleteMapping("/student/delete/{id}")
    public String deleteById(@PathVariable Integer id) {
        studentRepository.deleteById(id);
        return "Success Deleted Student";
    }

    @DeleteMapping("/student/delete")
    public String delete() {
        studentRepository.deleteAll();
        return "Success Deleted All Student";
    }

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentRepository.findById(id).get();
    }
}
