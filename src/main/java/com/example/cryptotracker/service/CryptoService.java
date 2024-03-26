package com.example.cryptotracker.service;

import com.example.cryptotracker.model.Cryptocurrency;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CryptoService {

    private static final String API_URL = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100&page=1&sparkline=false";

    public List<Cryptocurrency> getAllCryptocurrencies() {
        RestTemplate restTemplate = new RestTemplate();
        Cryptocurrency[] cryptocurrencies = restTemplate.getForObject(API_URL, Cryptocurrency[].class);
        //Vengono passati parametri API ad attributi
        System.out.println(Arrays.asList(cryptocurrencies));
        return Arrays.asList(cryptocurrencies);
    }



}
