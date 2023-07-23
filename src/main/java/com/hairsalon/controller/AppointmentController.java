package com.hairsalon.controller;

import com.hairsalon.entity.ResponseObject;
import com.hairsalon.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api/v1/appointments")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @GetMapping("")
    ResponseEntity<ResponseObject> getAll() {
        return appointmentService.getAll();
    }

    @PostMapping("/makeApm")
    ResponseEntity<Object> makeAppointment(@RequestBody String json) {
        return appointmentService.makeAppointment(json);
    }

    @GetMapping("/{id}")
    ResponseEntity<ResponseObject> getAllByStatusId(@PathVariable Integer id) {
        return appointmentService.getAllByStatusId(id);
    }

    @GetMapping("/customer/{id}")
    ResponseEntity<ResponseObject> getAllByCustomerId(@PathVariable Integer id) {
        return appointmentService.getAllByCustomerId(id);
    }

    @PutMapping("/update-status")
    ResponseEntity<Object> updateStatusCodeAppointment(@RequestBody String json) {
        return appointmentService.updateStatusAppointment(json);
    }
}
