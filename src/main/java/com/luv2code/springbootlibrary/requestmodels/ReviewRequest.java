package com.luv2code.springbootlibrary.requestmodels;

import lombok.Data;

import java.util.Optional;

@Data
public class ReviewRequest {

    private double rating;

    private Long bookId;

    // description is optional when leaving a review
    private Optional<String> reviewDescription;

}
