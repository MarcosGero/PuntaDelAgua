package com.pda.servicios;

import com.pda.dao.StockRepository;
import com.pda.models.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {


    @Autowired
    private StockRepository stockRepository;



    public List<Stock> findAll() {
        return stockRepository.findAll();
    }
}