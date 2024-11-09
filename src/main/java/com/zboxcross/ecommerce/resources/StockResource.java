package com.zboxcross.ecommerce.resources;

import com.zboxcross.ecommerce.entities.Stock;
import com.zboxcross.ecommerce.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/stocks")
public class StockResource {

    @Autowired
    private StockService service;

    @GetMapping
    public ResponseEntity<List<Stock>> findAll(){
        List<Stock> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Stock> findById(@PathVariable Long id){
        Stock obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
