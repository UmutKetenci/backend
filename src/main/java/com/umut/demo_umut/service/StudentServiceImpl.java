package com.umut.demo_umut.service;

import com.umut.demo_umut.dao.StudentRepository;
import com.umut.demo_umut.entity.Student;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> createAll(List<Student> studentList) {
        return studentRepository.saveAll(studentList);
    }

    @Override
    public Student update(Student student) {

        if(Objects.nonNull(studentRepository.findById(student.getId()))){
            return studentRepository.save(student);
        }
       return this.create(student);
    }

    @Override
    public List<Student> updateAll(List<Student> entityList) {
        List<Student> responseEntityList = new ArrayList<>();
        for (Student student:entityList) {
            responseEntityList.add(this.update(student));
        }
        return responseEntityList;
    }

    @Override
    public void delete(UUID id) {
      Optional<Student> student= studentRepository.findById(id);
      if(student.isPresent()) {
          studentRepository.delete(student.get());
      }
    }

    @Override
    public List<Student> readAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student read(UUID id) {
        return studentRepository.readById(id);
    }
}
