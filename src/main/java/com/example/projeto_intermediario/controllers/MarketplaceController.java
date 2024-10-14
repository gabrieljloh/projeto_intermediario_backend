package com.example.projeto_intermediario.controllers;

import com.example.projeto_intermediario.model.Market;
import com.example.projeto_intermediario.services.MarketplaceServiceImpl;
import com.example.projeto_intermediario.services.Sobre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class MarketplaceController implements MarketplaceControllerInterface {

    @Autowired
    private MarketplaceServiceImpl marketService;

    @Autowired
    private Sobre sobreService;

    @GetMapping("/market")
    @ResponseBody
    public Market getMarket() {
        return marketService.getMarket();
    }

    @GetMapping("/sobre")
    @ResponseBody
    public HashMap<String, String> getSobre() {
        return sobreService.sobre();
    }

    @PostMapping("/market")
    @ResponseBody
    public Market postMarket(@RequestBody Object requestBody) {
        return marketService.postMarket(requestBody).block();
    }
}
