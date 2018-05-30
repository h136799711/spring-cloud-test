package main.java.Main;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Component
public class SheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("当前时间是 {}", dateFormat.format(new Date()));
        Mono<String> resp = WebClient.create()
                .method(HttpMethod.GET)
                .uri(uriBuilder -> uriBuilder.scheme("http")
                        .host("127.0.0.1")
                        .port("6004")
                        .path("/bookstore/category").build())
                .retrieve()
                .bodyToMono(String.class);
        resp.subscribe(log::info);
    }
}
