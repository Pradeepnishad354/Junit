package com.tag.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

    private Long departmentId;

     @Column(name="department_name", nullable = false , length = 10)
    private String departmentName;
     
    @Column(name="department_address" ,nullable = false,length = 20) 
    private String departmentAddress;
    
    @Column(name="department_code",nullable = false,length = 25)
    private String departmentCode;



}
