package com.example.projeto_intermediario.services;


import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class Sobre {
    public HashMap<String, String> sobre() {
        HashMap<String, String> sobre = new HashMap<>();
        sobre.put("nome", "Gabriel Jorge Lóh");
        sobre.put("projeto", "Buscador de produtos");
        return sobre;
    }
}
