package com.example.server.api;

import com.example.server.Service.viewService;
import com.example.server.model.view;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class viewController {

@Autowired
viewService vs;




    // getting all views
    @GetMapping("/view")
    public Iterable<view> get(){
        return vs.get();
    }

    @GetMapping("/")
    public String fun(){
        return "Welcome to views";
    }

    // getting views by id
    @GetMapping("/view/{id}")
    Optional<view> getView(@PathVariable Integer id){
        Optional<view> v=vs.get(id);
        return v;
    }


    // delete view by id
    @DeleteMapping("/view/{id}")
    public void  deleteView(@PathVariable Integer id){
        vs.remove(id);
    }



    // creating a view
    @PostMapping("/view")
    public view createView(@RequestBody view v){
       return vs.save(v);
    }
}
