package com.example.wirebarley.infra;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeRateFeignResponse {
    private boolean success;
    private String terms;
    private String privacy;
    private Long timestamp;
    private String source;
    private CountryData quotes;

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CountryData{
        @JsonProperty(value = "USDPHP")
        private double usdphp;
        @JsonProperty(value = "USDJPY")
        private double usdjpy;
        @JsonProperty(value = "USDKRW")
        private double usdkrw;

        public String getUsdphp(){
            return String.format("%.2f", this.usdphp);
        }

        public String getUsdjpy() {
            return String.format("%.2f", this.usdjpy);
        }

        public String getUsdkrw() {
            return String.format("%.2f", this.usdkrw);
        }
    }
}
