package com.example.manager.Models;

import com.example.manager.Dtos.Employees;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String managerId;
    private String managerName;
    private String emailId;
    private String password;
    private Boolean Status;
    private int mobileNum;
    private String address;

    @Transient
    private List<Employees> employeeList = new ArrayList<>();

}
