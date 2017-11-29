/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.alkfejl.carhire.api;

import hu.elte.alkfejl.carhire.model.*;
import hu.elte.alkfejl.carhire.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author tomeczpatrik3
 */
@RestController
@RequestMapping("/api/customers")
public class CustomerApiController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/visitor")
    private ResponseEntity<Iterable<Customer>> visitor() {
        Iterable<Customer> customers = customerService.listAll();
        return ResponseEntity.ok(customers);
    }
}