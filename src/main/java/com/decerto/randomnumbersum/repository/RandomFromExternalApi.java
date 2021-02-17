package com.decerto.randomnumbersum.repository;

import com.decerto.randomnumbersum.rest.RandomIntegerWebRequest;
import com.decerto.randomnumbersum.rest.RandomIntegerWebResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Optional;

@Repository
public class RandomFromExternalApi implements RandomIntegerRepository {

    private static final String RANDOM_NUMBER_GENERATOR_API_URL = "https://api.random.org/json-rpc/2/invoke";
    private static final String RANDOM_NUMBER_GENERATOR_API_KEY = "9d9cf82a-fb63-4d08-8bed-a9c6137aee68";
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public Integer getRandom() throws IOException {

        var restTemplate = new RestTemplate();

        var request = prepareGetRandomRequest();

        RandomIntegerWebResponse response = Optional.ofNullable(restTemplate
                .postForObject(RANDOM_NUMBER_GENERATOR_API_URL, request, RandomIntegerWebResponse.class))
                .orElse(new RandomIntegerWebResponse("Response is null"));


        if (response.getError() != null) {
            throw new RuntimeException(response.getError().getMessage());
        } else
            return response.getResult().getRandom().getData().get(0);
    }

    private HttpEntity<String> prepareGetRandomRequest() throws JsonProcessingException {

        var requestBody = objectMapper.writeValueAsString(new RandomIntegerWebRequest(RANDOM_NUMBER_GENERATOR_API_KEY));

        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return new HttpEntity<String>(requestBody, headers);
    }

}
