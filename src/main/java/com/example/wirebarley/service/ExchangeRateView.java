package com.example.wirebarley.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRateView {
    private String usdphp;
    private String usdjpy;
    private String usdkrw;

}
