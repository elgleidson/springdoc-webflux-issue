package com.github.elgleidson.springdoc.webflux.issue;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/1/format")
@Validated
@AllArgsConstructor
@Slf4j
public class Controller {

  private static final BigDecimal ONE_HUNDRED = new BigDecimal("100");

  @Operation(description = "Format API")
  @PostMapping
  public Mono<Response> format(@Valid @RequestBody Request request) {
    log.info("enter: {}", request);
    return Mono.just(request)
        .map(req -> new Response(ONE_HUNDRED.multiply(req.getPercentage()) + "%"))
        .doOnSuccess(response -> log.info("exit: {}", response));
  }

}
