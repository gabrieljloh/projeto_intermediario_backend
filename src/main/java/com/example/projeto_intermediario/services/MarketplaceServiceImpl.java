package com.example.projeto_intermediario.services;


import com.example.projeto_intermediario.model.Market;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestClient;


import java.util.ArrayList;

@Service
public class MarketplaceServiceImpl {
    private RestClient cliente = RestClient.create("https://graphql.canopyapi.co/");

    @GetMapping("/market")
    @ResponseBody
    public Market market() {
        ArrayList<Market> resposta = cliente
                .get()
                .uri()
                .retrieve()
                .body(ArrayList.class)
            return resposta.get(0);


    }
}
