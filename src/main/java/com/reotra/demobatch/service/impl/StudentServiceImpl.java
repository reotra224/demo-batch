package com.reotra.demobatch.service.impl;

import com.reotra.demobatch.model.Student;
import com.reotra.demobatch.repository.StudentRepository;
import com.reotra.demobatch.service.IStudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student insertStudent(Student student) {
        return studentRepository.save(student);
    }
}
