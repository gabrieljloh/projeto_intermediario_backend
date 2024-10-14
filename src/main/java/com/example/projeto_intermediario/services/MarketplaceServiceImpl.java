package com.example.projeto_intermediario.services;

import com.example.projeto_intermediario.controllers.MarketplaceControllerInterface;
import com.example.projeto_intermediario.model.Market;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class MarketplaceServiceImpl implements MarketplaceControllerInterface {

    private final WebClient webClient;

    @Autowired
    public MarketplaceServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder
                .baseUrl("https://graphql.canopyapi.co/")
                .defaultHeader("Authorization", "Bearer 7265f7da-5e58-48a2-9fac-b3217ff7c41e")
                .build();
    }

    public Market getMarket() {
        return webClient.get()
                .uri("?query=query+amazonProduct+%7B%0A++amazonProduct%28input%3A+%7BasinLookup%3A+%7Basin%3A+%22B0D1XD1ZV3%22%2C+domain%3A+US%7D%7D%29+%7B%0A++++title%0A++++brand%0A++++mainImageUrl%0A++++ratingsTotal%0A++++rating%0A++++%0A++%7D%0A%7D")
                .retrieve()
                .bodyToMono(Market.class).block();
    }

    public Mono<Market> postMarket(Object requestBody) {
        return webClient.post()
                .uri("") // Coloque a URI apropriada aqui
                .header("Content-Type", "application/json")
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(Market.class);
    }
}
