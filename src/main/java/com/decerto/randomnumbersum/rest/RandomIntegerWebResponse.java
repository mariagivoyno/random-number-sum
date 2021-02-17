package com.decerto.randomnumbersum.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomIntegerWebResponse {

    @JsonProperty
    private Result result;

    @JsonProperty
    private Error error;

    public RandomIntegerWebResponse(String message) {

        this.error = new Error(message);
    }

    @Getter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {

        @JsonProperty
        private Random random;


        @Getter
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class Random {

            @JsonProperty
            private List<Integer> data;

        }

    }

    @Getter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Error {

        @JsonProperty
        private final String message;
        @JsonProperty
        private String code;

        public Error(String message) {

            this.message = message;
        }

    }

}
