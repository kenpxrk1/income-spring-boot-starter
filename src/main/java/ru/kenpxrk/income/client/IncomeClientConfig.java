package ru.kenpxrk.income.client;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@ConditionalOnProperty(name = "income-client.enable", havingValue = "true")
public class IncomeClientConfig {

    @Bean
    @ConditionalOnMissingBean
    WebClient webClient() {
        return WebClient.create();
    }


    @Bean
    @ConditionalOnMissingBean
    public IncomeClient incomeClient(WebClient webClient) {
        return new IncomeClient(webClient);
    }
}
