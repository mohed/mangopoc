package com.su.mohed.controllers;
import com.su.mohed.SqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by mohed on 2017-04-26.
 */

@Controller
public class MainController {

    @Autowired
    SqlRepository repo;

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}