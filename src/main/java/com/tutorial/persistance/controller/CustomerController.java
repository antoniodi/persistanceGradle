package com.tutorial.persistance.controller;

import com.tutorial.persistance.models.dao.ICustomerDao;
import com.tutorial.persistance.models.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private ICustomerDao aCustomerDao;
}
