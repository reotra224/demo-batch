package com.reotra.demobatch.config;

import com.reotra.demobatch.model.Student;
import com.reotra.demobatch.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class StudentWriter implements ItemWriter<Student> {

    @Autowired
    private IStudentService studentService;

    @Override
    public void write(List<? extends Student> students) {
        students.forEach(student -> {
            log.info("Enregistrement en base de l'objet {}", student);
            log.debug("Saved Object => {}", studentService.insertStudent(student));
        });
    }
}
