package com.example.server.Service;

import com.example.server.model.view;
import com.example.server.repository.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class viewService {


    @Autowired
    ViewRepository vp;




    public Iterable<view> get(){
        return vp.findAll();
    }

    public Optional<view> get(Integer id){
        return vp.findById(id);
    }


//    //public void remove(Integer id){
//        vp.deleteById(id);
//    }

    public void remove(Integer id){
        vp.deleteById(id);
    }


    public view save(view v){
        vp.save(v);
        return v;
    }

}
