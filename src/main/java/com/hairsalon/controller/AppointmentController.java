package com.hairsalon.controller;

import com.hairsalon.entity.ResponseObject;
import com.hairsalon.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(path = "/api/v1/")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @PostMapping("appointments/makeApm")
    ResponseEntity<Object> makeAppointment(@RequestBody String json) {
            return appointmentService.makeAppointment(json);
    }
}
