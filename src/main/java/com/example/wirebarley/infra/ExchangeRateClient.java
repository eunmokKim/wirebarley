package com.example.wirebarley.infra;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "exchange-rate-api"
        , url = "${exchange.api.url}")
public interface ExchangeRateClient {

    @GetMapping("/live")
    ExchangeRateFeignResponse live(@RequestParam String access_key);
}
