package ru.kenpxrk.income.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

public class IncomeClient {
    private final WebClient webClient;
    @Value("${income-client.api}")
    private String incomeApi;

    IncomeClient(WebClient webClient) {
        this.webClient = webClient;
    }


    public List<IncomeDTO> getUserIncomes() {
        return webClient.get().uri(incomeApi).retrieve().bodyToFlux(IncomeDTO.class).collectList().block();
    }
}
