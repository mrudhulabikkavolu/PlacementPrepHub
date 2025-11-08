package com.placementprephub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.placementprephub.model.Student;
import com.placementprephub.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Create
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // Read all
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Read by ID
    public Student getStudentById(Long id) {
        Optional<Student> opt = studentRepository.findById(id);
        return opt.orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
    }

    // Update
    public Student updateStudent(Long id, Student updatedStudent) {
        Student existing = getStudentById(id);
        existing.setName(updatedStudent.getName());
        existing.setEmail(updatedStudent.getEmail());
        existing.setBranch(updatedStudent.getBranch());
        existing.setCgpa(updatedStudent.getCgpa());
        return studentRepository.save(existing);
    }

    // Delete
    public void deleteStudent(Long id) {
        Student existing = getStudentById(id);
        studentRepository.delete(existing);
    }
}