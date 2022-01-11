package com.example.wirebarley.api;

import com.example.wirebarley.service.ExchangeRateService;
import com.example.wirebarley.service.ExchangeRateView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeRateApi {

    private final ExchangeRateService exchangeRateService;

    public ExchangeRateApi(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @GetMapping(value = "/currentExchangeRate")
    public ExchangeRateView getExchangeRate(){
        return exchangeRateService.getRateView();
    }
}
