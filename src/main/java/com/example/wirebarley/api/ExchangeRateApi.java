package com.example.wirebarley.api;

import com.example.wirebarley.service.ExchangeRateService;
import com.example.wirebarley.service.ExchangeRateView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ExchangeRateApi {

    private final ExchangeRateService exchangeRateService;

    public ExchangeRateApi(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @GetMapping(value = "/currentExchangeRate")
    public ApiResponse<ExchangeRateView> getExchangeRate(){
        return ApiResponse.ok(exchangeRateService.getRateView());
    }

    @PostMapping(value = "/currentExchangeRate")
    public ApiResponse<ExchangeRateView> getExchangeRate(@Valid @RequestBody ExchangeRateRequest req){
        return ApiResponse.ok(exchangeRateService.getRateView());
    }
}
