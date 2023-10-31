package com.example.manager.Services;

import com.example.manager.Dtos.Employees;
import com.example.manager.Models.Manager;
import com.example.manager.Repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ManagerService {
    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private RestTemplate restTemplate;

    public String addManager(Manager manager) {
        String managerId = UUID.randomUUID().toString();
        manager.setManagerId(managerId);
        managerRepository.save(manager);
        return "new manager added in manager database";
    }

    public List<Employees> getEmpUnderManager(String managerId) {
        List<Employees> employeesList = restTemplate.getForObject("http://employee-service/emp/getEmpUnderManager?managerId="+managerId,List.class);

        return employeesList;
    }

    public Manager getmanager(String managerID) {
        return managerRepository.findByManagerId(managerID);
    }
}
