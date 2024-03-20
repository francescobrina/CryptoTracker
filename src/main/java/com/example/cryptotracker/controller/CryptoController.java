package com.example.cryptotracker.controller;

import com.example.cryptotracker.model.Cryptocurrency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class CryptoController {

    private static final String API_URL = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/")
    public String home(Model model) {
        Cryptocurrency[] cryptocurrencies = restTemplate.getForObject(API_URL, Cryptocurrency[].class);
        model.addAttribute("cryptocurrencies", cryptocurrencies);
        return "home";
    }
}
