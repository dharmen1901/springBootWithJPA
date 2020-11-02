package com.test.jpaDemo.Service;

import com.test.jpaDemo.Entity.StudentEntity;
import com.test.jpaDemo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicCrudBusiness {
    @Autowired
    private StudentRepo studentRepo;

    public List<StudentEntity> getAllData(){
        List<StudentEntity> result = studentRepo.findAll();
        return result;
    }

    public List<StudentEntity> getOne(){
        List<StudentEntity> result = studentRepo.findOneBystudentName("Dharmen");
        return result;
    }
}
