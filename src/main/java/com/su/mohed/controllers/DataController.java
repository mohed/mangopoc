package com.su.mohed.controllers;

import com.su.mohed.SqlRepository;
import com.su.mohed.tables.Masterdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by mohed on 2017-04-26.
 */

@RestController
public class DataController {

    @Autowired
    SqlRepository repo;

    @GetMapping("/api")
    public Masterdata[] getMasterdata() {
        List<Masterdata> allData = repo.findAll();
        Masterdata[] allDataArray = allData.toArray(new Masterdata[allData.size()]);
        return allDataArray;
    }

    @PostMapping("/api")
    public ModelAndView addMasterdata(@RequestParam("tagname") String tagname, @RequestParam("value") String value) {
        Masterdata md = new Masterdata(tagname, value);
        repo.save(md);
        return new ModelAndView("index");
    }

    @PutMapping("/api")
    public ModelAndView modifyRow(@RequestBody Masterdata md){
        //Masterdata md = new Masterdata(Integer.parseInt(id), tagname, value);
        repo.save(md);
        return new ModelAndView("index");
    }
}
