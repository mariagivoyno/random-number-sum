package com.decerto.randomnumbersum.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RandomIntegerWebRequest {

    @JsonProperty
    private final String jsonrpc = "2.0";
    @JsonProperty
    private final String method = "generateSignedIntegers";
    @JsonProperty
    private final Integer id = 10720;
    @JsonProperty
    private final Params params;


    public RandomIntegerWebRequest(String apiKey) {

        this.params = new Params(apiKey);
    }

    private class Params {

        @JsonProperty
        private final String apiKey;
        @JsonProperty
        private final Integer n = 1;
        @JsonProperty
        private final Integer min = 0;
        @JsonProperty
        private final Integer max = 100;
        @JsonProperty
        private final boolean replacement = true;

        public Params(String apiKey) {

            this.apiKey = apiKey;
        }

    }

}
