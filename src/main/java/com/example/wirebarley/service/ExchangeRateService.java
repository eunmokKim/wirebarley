package com.example.wirebarley.service;

import com.example.wirebarley.api.ExchangeRateRequest;
import com.example.wirebarley.infra.ExchangeRateClient;
import com.example.wirebarley.infra.ExchangeRateFeignResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
                .jpy(Optional.ofNullable(res.getQuotes()).map(ExchangeRateFeignResponse.CountryData::getFormatUsdjpy).orElse(""))
                .krw(Optional.ofNullable(res.getQuotes()).map(ExchangeRateFeignResponse.CountryData::getFormatUsdkrw).orElse(""))
                .php(Optional.ofNullable(res.getQuotes()).map(ExchangeRateFeignResponse.CountryData::getFormatUsdphp).orElse(""))
                .build();
    }
}
