package com.sourcecode.springdatajpa.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InputRequest<T> {

    @JsonProperty(value = "userId", required = true)
    private String loggedInUser;
    private T employee;
    private String timeZone;

}
