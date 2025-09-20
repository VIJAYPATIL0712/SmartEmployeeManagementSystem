package com.project.smartEMS.controller;

import com.project.smartEMS.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendence")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;
}
