package com.project.smartEMS.service;

import com.project.smartEMS.dto.EmployeeDTO;
import com.project.smartEMS.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

        @Autowired
        private EmployeeRepository employeeRepository;
}
