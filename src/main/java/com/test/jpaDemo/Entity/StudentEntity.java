package com.test.jpaDemo.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@Getter
@Setter
public class StudentEntity {
    @Id
    @Column(name = "Id")
    private int Id;
    @Column(name = "Name")
    private String studentName;
    @Column(name = "lastname")
    private String studentLastName;
    @Column(name = "City")
    private String city;
}
