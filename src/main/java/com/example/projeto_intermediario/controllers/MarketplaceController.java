package com.example.projeto_intermediario.controllers;


import com.example.projeto_intermediario.model.Market;
import com.example.projeto_intermediario.services.MarketplaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketplaceController {

    @Autowired
    private MarketplaceServiceImpl marketService;


    @GetMapping("/market")
    @ResponseBody
    public Market[] getMarket() {
        return marketService.market();
    }

   /*
    @PostMapping("/graphql")
    @ResponseBody
    public String postQuery(@RequestBody String query) {
        return marketService.postQuery(query);
    }*/
}
