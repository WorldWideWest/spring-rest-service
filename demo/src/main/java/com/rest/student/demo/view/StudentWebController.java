package com.rest.student.demo.view;

import java.util.List;

import javax.validation.Valid;

import com.rest.student.demo.student.Student;
import com.rest.student.demo.student.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentWebController {

    private StudentService studentService;

    @Autowired
    public StudentWebController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public String studentForm(Model model){
        Student student = new Student();
        model.addAttribute("student", student);

        List<Student> students = studentService.findAll();
        model.addAttribute("students", students);

        return "student-form";
    }
    
    @PostMapping("/student")
    public String studentProcessing(@Valid @ModelAttribute Student student, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            List<Student> students = studentService.findAll();
            model.addAttribute("students", students);
            return "student-form";
        }
        studentService.save(student);
        return "redirect:/student";

    }

    @GetMapping("/student/delete/{studentId}")
    public String deleteStudent(@ModelAttribute("studentId") int id){
        studentService.deleteById(id);
        return "redirect:/student";

    }


}
