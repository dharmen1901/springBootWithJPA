package com.test.jpaDemo.Controller;

import com.test.jpaDemo.Entity.StudentEntity;
import com.test.jpaDemo.Service.BasicCrudBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/test")
public class BasicCrud {
    @Autowired
    private BasicCrudBusiness basicCrudBusiness;

    @GetMapping("/test")
    public List<StudentEntity> getOne(){
        return basicCrudBusiness.getOne();
    }

    @GetMapping
    public List<StudentEntity> getAllList(){
        return basicCrudBusiness.getAllData();
    }
}
