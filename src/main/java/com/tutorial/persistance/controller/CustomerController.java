package com.tutorial.persistance.controller;

import com.tutorial.persistance.models.dao.ICustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private ICustomerDao aCustomerDao;
}
