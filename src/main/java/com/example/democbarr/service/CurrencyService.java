package com.example.democbarr.service;

import com.example.democbarr.client.CurrencyClient;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
    private final CurrencyClient currencyClient;

    public CurrencyService(CurrencyClient currencyClient) {
        this.currencyClient = currencyClient;
    }

    public String getCurrencyRates(String date) {
        return currencyClient.getCurrencyRates(date);
    }
}
