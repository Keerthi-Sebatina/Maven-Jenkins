package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> studentList = new ArrayList<>();

    public String addStudent(Student student) {
        studentList.add(student);
        return "Student added successfully";
    }

    public List<Student> getAllStudents() {
        return studentList;
    }

    public Student getStudentById(int id) {
        return studentList.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public String deleteStudent(int id) {
        studentList.removeIf(s -> s.getId() == id);
        return "Student deleted successfully";
    }
}
