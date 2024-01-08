package com.luv2code.springbootlibrary.requestmodels;

import lombok.Data;

@Data
public class AdminQuestionRequest {
// this object is the request object sent from the front-end to update a message with a response from an adnmin
    private Long id;

    private String response;
}
