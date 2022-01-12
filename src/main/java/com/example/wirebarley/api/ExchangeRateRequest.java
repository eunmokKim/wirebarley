package com.example.wirebarley.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRateRequest {

    @Pattern(regexp = "[0-9]", message = "송금액이 바르지 않습니다")
    @NotNull(message = "송금액이 바르지 않습니다")
    @Min(value = 0, message = "송금액이 바르지 않습니다")
    @Max(value = 10000, message = "송금액이 바르지 않습니다")
    private String usd;
}
