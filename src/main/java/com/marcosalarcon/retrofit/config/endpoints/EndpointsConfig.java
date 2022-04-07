package com.marcosalarcon.retrofit.config.endpoints;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import okhttp3.logging.HttpLoggingInterceptor;


@Configuration
public class EndpointsConfig {

    @Bean
    @ConfigurationProperties(prefix = "http-client.api.json-place-holder")
    public Endpoint jsonPlaceHolderEndpoint(){
        return new Endpoint();
    }

    @Bean
    @ConfigurationProperties(prefix = "http-client.api.validate-iban")
    public Endpoint validateIbanEndpoint() {
        return new Endpoint();
    }

    @Getter
    @Setter
    public static class Endpoint {
        private String baseUrl;
        private long connectTimeout;
        private long readTimeout;
        private HttpLoggingInterceptor.Level loggingLevel;
    }

}
