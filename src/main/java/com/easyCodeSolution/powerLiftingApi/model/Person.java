package com.easyCodeSolution.powerLiftingApi.model;

import lombok.Data;

import java.util.Date;

@Data
public class Person {
    private int personId;
    private int genderId;
    private int countryId;
    private int identificationTypeId;
    private String firstName;
    private String secondName;
    private String surname;
    private String secondSurname;
    private Date birthday;
    private String identification;
    private String email;
}
