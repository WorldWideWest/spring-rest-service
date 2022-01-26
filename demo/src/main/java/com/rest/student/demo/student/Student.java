package com.rest.student.demo.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "student")
public class Student {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
    private int id;

    @Column(name = "first_name", nullable = false)
    @NotBlank(message = "The field can't be empty")
    private String firstName;

    @Column(name = "last_name")
    @NotBlank(message = "The field can't be empty")
    private String lastName;

    @Column(name = "faculty")
    @NotBlank(message = "The field can't be empty")
    private String faculty;

    public Student() {}

    public Student(String firstName, String lastName, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student [faculty=" + faculty + ", firstName=" + firstName + ", id=" + id + ", lastName=" + lastName
                + "]";
    }
    

}
