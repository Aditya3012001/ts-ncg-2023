package com.example.server.Service;

import com.example.server.model.view;
import com.example.server.repository.ViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class viewService {


    @Autowired
    ViewRepository vp;




    public ResponseEntity<List<view>> get(){
        List<view> l= vp.findAll();
        return new ResponseEntity<>(l,HttpStatus.OK);
    }

    public ResponseEntity<view> get(Integer id){
        Optional<view> _view= vp.findById(id);
        if(_view.isPresent()){
            return new ResponseEntity<>(_view.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



    public ResponseEntity<view> remove(Integer id){

        Optional<view > view_data = vp.findById(id);

        if(view_data.isPresent()){
            vp.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


    }


    public ResponseEntity<view> save(view v){

       view _view=  vp.save(new view(v.getChartType(),v.getCountry(),v.getIndicator(),v.getStartDate(),v.getEndDate()));
       return new  ResponseEntity<>(_view,HttpStatus.CREATED);
    }


    public ResponseEntity<view> updateView(Integer id, view v){
        Optional<view> view_data = vp.findById(id);

        if(view_data.isPresent()){
            view _view= view_data.get();
            _view.setChartType(v.getChartType());
            _view.setCountry(v.getCountry());
            _view.setIndicator(v.getIndicator());
            _view.setEndDate(v.getEndDate());
            _view.setStartDate(v.getStartDate());
            return new ResponseEntity<>(vp.save(_view),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
