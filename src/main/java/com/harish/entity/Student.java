package com.harish.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String firstname;

    private String lastname;

    private LocalDate dateOfBirth;

    private String email;

    private int age;

}
