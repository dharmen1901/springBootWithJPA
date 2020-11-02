package com.test.jpaDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.jpaDemo.Entity.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
    public List<StudentEntity> findOneBystudentName(String studentName);
}
