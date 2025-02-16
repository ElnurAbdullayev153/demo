package com.example.democbarr.controller;

import com.example.democbarr.service.CurrencyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/currency-rates")
    public String getCurrencyRates(@RequestParam String date) {
        return currencyService.getCurrencyRates(date);
    }
    //http://localhost:8282/currency-rates?date=30.12.2019
}
