package com.umut.demo_umut.api;

import com.umut.demo_umut.entity.Student;
import com.umut.demo_umut.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "student/")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "create")
    ResponseEntity<Student> create (Student s){
        return ResponseEntity.ok(studentService.create(s));
    }

    @PutMapping(value = "update")
    ResponseEntity<Student> update (Student s){
        return ResponseEntity.ok(studentService.update(s));
    }


    @GetMapping(value = "readAll")
    ResponseEntity<List<Student>> read (){
        return ResponseEntity.ok(studentService.readAll());
    }

    @GetMapping(value = "read")
    ResponseEntity<Student> read (UUID id){
        return ResponseEntity.ok(studentService.read(id));
    }


}
