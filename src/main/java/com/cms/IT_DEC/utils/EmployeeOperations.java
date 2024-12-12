package com.cms.IT_DEC.utils;

import com.cms.IT_DEC.beans.EmpAndUserTypeResponse;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

@Component
public class EmployeeOperations {
    @Value("${employee.fetch.API}")
    String employeeFetchAPI;

    @CircuitBreaker(name = "empService", fallbackMethod = "fallbackEmployeeData")
    @TimeLimiter(name = "empService", fallbackMethod = "fallbackEmployeeData")
    public CompletableFuture<EmpAndUserTypeResponse> getEmployeeData(Long empId){
        WebClient webClient = WebClient.builder()
                .exchangeStrategies(ExchangeStrategies.builder()
                        .codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(16 * 1024 * 1024))
                        .build())
                .build();

        return webClient.get()
                .uri(employeeFetchAPI + empId)
                .retrieve()
                .bodyToMono(EmpAndUserTypeResponse.class)
                .timeout(Duration.ofSeconds(60)).toFuture();
    }

    public CompletableFuture<EmpAndUserTypeResponse> fallbackEmployeeData(Long empId, Throwable throwable) {
        return CompletableFuture.completedFuture(null);
    }

}
