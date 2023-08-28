package com.example.tutorial_jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Entity
//@AllArgsConstructor
@Getter
@Setter
@Table(name = "memo")
public class Users {


    @Id//키값 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)//자동 정의
    private Long ID;

    @Column(length = 200, nullable = false)
    private String username;
}