package com.example.cryptotracker.controller;

import com.example.cryptotracker.model.Cryptocurrency;
import com.example.cryptotracker.service.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CryptoController {

    @Autowired
    private CryptoService cryptoService;


    @GetMapping("/cryptocurrencies")
    public String getCryptocurrencies(Model model) {
        List<Cryptocurrency> cryptocurrencies = cryptoService.getAllCryptocurrencies();
        model.addAttribute("cryptocurrencies", cryptocurrencies);
        return "cryptocurrencies"; // Nome della vista Thymeleaf
    }




    @GetMapping("/")
    public String home(){return"redirect:cryptocurrencies";}
    @GetMapping("/home")
    public String home1(){return"redirect:cryptocurrencies";}

}
