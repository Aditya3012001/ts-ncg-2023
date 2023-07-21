package com.example.server.api;

import com.example.server.Service.viewService;
import com.example.server.model.view;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class viewController {

@Autowired
viewService vs;




    // getting all views
    @GetMapping("/view")
    public ResponseEntity<List<view>> get(){
        return vs.get();
    }

    @GetMapping("/")
    public ResponseEntity<String> fun(){
        return new ResponseEntity<String>("Welcome to views",HttpStatus.ACCEPTED);
    }

    // getting views by id
    @GetMapping("/view/{id}")
    ResponseEntity<view> getView(@PathVariable Integer id){
        ResponseEntity<view> v=vs.get(id);
        return v;
    }


    // delete view by id
    @DeleteMapping("/view/{id}")
    public ResponseEntity<view>  deleteView(@PathVariable Integer id){
        return vs.remove(id);
    }



    // creating a view
    @PostMapping("/view")
    public ResponseEntity<view>createView(@RequestBody view v){
       ResponseEntity<view> temp = vs.save(v);
       return temp;
    }

    @PutMapping("/view/{id}")
    public ResponseEntity<view> updateView(@PathVariable Integer id,@RequestBody view v){
        return vs.updateView(id,v);
    }
}


