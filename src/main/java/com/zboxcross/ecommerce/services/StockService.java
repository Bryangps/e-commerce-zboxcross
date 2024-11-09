package com.zboxcross.ecommerce.services;

import com.zboxcross.ecommerce.entities.Stock;
import com.zboxcross.ecommerce.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository repository;

    public List<Stock> findAll(){
        return repository.findAll();
    }

    public Stock findById(Long id){
        Optional<Stock> obj = repository.findById(id);
        return obj.get();
    }
}
