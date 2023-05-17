package com.github.elgleidson.springdoc.webflux.issue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class Request {

  @Schema(description = "Percentage (from 0-100%)", example = "10% = 0.10")
  @DecimalMin(value = "0")
  @DecimalMax(value = "1")
  BigDecimal percentage;


}
