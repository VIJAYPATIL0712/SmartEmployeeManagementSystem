package com.project.smartEMS.service;

import com.project.smartEMS.repository.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayrollService {

    @Autowired
    private PayrollRepository payrollRepository;
}
