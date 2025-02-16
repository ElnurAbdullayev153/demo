package com.example.democbarr.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "currency-client", url = "https://cbar.az")
public interface CurrencyClient {
    @GetMapping("/currencies/30.12.2019.xml")
    String getCurrencyRates(@RequestParam("Date") String date);
}
