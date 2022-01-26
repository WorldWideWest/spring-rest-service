package com.rest.student.demo.student;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
    
    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/student/{studentId}")
    public Student findById(@PathVariable("studentId") int id){
        return studentService.findById(id);
    }

    @PostMapping("/student")
    public void save(@RequestBody Student student){
        studentService.save(student);
    }
    
    @PutMapping("/student")
    public void put(@RequestBody Student student){
        studentService.save(student);
    }

    @DeleteMapping("/student/{studentId}")
    public void deleteById(@PathVariable("studentId") int id){
        studentService.deleteById(id);
    }

}
