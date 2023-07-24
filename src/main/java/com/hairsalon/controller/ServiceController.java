package com.hairsalon.controller;

import com.hairsalon.entity.*;
import com.hairsalon.service.ServiceHairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/services")
public class ServiceController {

    @Autowired
    private ServiceHairService hairService;

    @GetMapping("")
    public ResponseEntity<ResponseObject> getAllService() {
        return hairService.getAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<ResponseObject> getServiceById(@PathVariable Integer id) {
        return hairService.findById(id);
    }

}