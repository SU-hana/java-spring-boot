package com.example.demo.controller;

import com.example.demo.entity.StudentDTO;
import com.example.demo.entity.StudentDetails;
import com.example.demo.entity.StudentLogin;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/saveStudent")
    public  String saveStudent(@RequestBody StudentDTO studentDTO){
        StudentDetails studentDetails=new StudentDetails();
        studentDetails.setName(studentDTO.getName());
        studentDetails.setAge(studentDTO.getAge());
        studentDetails.setGender(studentDTO.getGender());
        studentDetails.setAddress(studentDTO.getAddress());
        StudentLogin studentLogin=new StudentLogin();
        studentLogin.setUsername(studentDTO.getUsername());
        studentLogin.setPassword(studentDTO.getPassword());
        studentService.saveStudent(studentDetails, studentLogin);
        return "Successfull";

    }

}
