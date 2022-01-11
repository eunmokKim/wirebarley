package com.example.wirebarley.service;

import com.example.wirebarley.infra.ExchangeRateClient;
import com.example.wirebarley.infra.ExchangeRateFeignResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ExchangeRateService {

    @Value("${exchange.api.key}")
    private String key;
    private final ExchangeRateClient exchangeRateClient;

    public ExchangeRateService(ExchangeRateClient exchangeRateClient) {
        this.exchangeRateClient = exchangeRateClient;
    }

    public ExchangeRateView getRateView(){
        return this.convert(exchangeRateClient.live(key));
    }

    private ExchangeRateView convert(ExchangeRateFeignResponse res){
        return ExchangeRateView.builder()
                .usdjpy(res.getQuotes().getUsdjpy())
                .usdkrw(res.getQuotes().getUsdkrw())
                .usdphp(res.getQuotes().getUsdphp())
                .build();
    }
}
