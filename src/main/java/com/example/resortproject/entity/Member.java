package com.example.resortproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@AllArgsConstructor

public class Member {
    @Id
    @GeneratedValue
    private Long Id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String pwd;
    @Column
    private String tel;


}
