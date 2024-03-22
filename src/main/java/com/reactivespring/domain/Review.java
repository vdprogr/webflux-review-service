package com.reactivespring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Review {
    @Id
    private String reviewId;
    @NotNull(message = "review:movieInfoId must not be null")
    private Long movieInfoId;
    private String comment;
    @Min(value = 0, message = "review:rating must be positive")
    private Double rating;
}
