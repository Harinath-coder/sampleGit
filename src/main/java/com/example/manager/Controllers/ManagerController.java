package com.example.manager.Controllers;

import com.example.manager.Dtos.Employees;
import com.example.manager.Models.Manager;
import com.example.manager.Services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @PostMapping("/addManager")
    public String addManager(@RequestBody Manager manager){
        return managerService.addManager(manager);
    }

    @GetMapping("/getEmpUnderManager")
    public List<Employees> getEmpUnderManger(@RequestParam("managerId") String managerId){

        return managerService.getEmpUnderManager(managerId);
    }

    @GetMapping("/getManager")
    public Manager getManager(@RequestParam("managerId") String managerID){
        return managerService.getmanager(managerID);
    }
}
