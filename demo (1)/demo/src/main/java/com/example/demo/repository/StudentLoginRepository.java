package com.example.demo.repository;

import com.example.demo.entity.StudentLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentLoginRepository extends JpaRepository<StudentLogin,Integer> {
}
