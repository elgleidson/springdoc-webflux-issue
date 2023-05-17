package com.github.elgleidson.springdoc.webflux.issue;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class Response {

  @Schema(description = "Formatted percentage", example = "0.10 = 10%")
  @NotEmpty
  String percentageFormatted;

}
