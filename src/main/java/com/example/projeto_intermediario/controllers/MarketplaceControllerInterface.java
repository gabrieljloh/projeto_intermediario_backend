package com.example.projeto_intermediario.controllers;

import org.springframework.web.bind.annotation.RestController;

public class MarketplaceControllerInterface {

    @RestController
    public interface MarketplaceService {
        String getMarket();
    }

}
