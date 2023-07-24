package com.example.demo.service;

import com.example.demo.entity.StudentDetails;
import com.example.demo.entity.StudentLogin;
import com.example.demo.repository.StudentDetailsRepository;
import com.example.demo.repository.StudentLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentDetailsRepository details;
    @Autowired
    private StudentLoginRepository login;

    public void saveStudent(StudentDetails studentDetails, StudentLogin studentLogin) {
        login.save(studentLogin);
        studentDetails.setStudentLogin(studentLogin);
        details.save(studentDetails);

    }
}