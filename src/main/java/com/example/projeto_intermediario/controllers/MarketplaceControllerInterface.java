package com.example.projeto_intermediario.controllers;


import com.example.projeto_intermediario.model.Market;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface MarketplaceControllerInterface {
    Market getMarket();
}
