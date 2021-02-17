package com.decerto.randomnumbersum.service;

import com.decerto.randomnumbersum.repository.RandomIntegerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class NumberAddingService implements DataAddingService<Integer> {

    @Autowired
    private List<RandomIntegerRepository> randomIntegerRepositories;

    @Override
    public Integer add() throws IOException, InterruptedException {

        int sum = 0;
        for (RandomIntegerRepository repository : randomIntegerRepositories) {
            sum += repository.getRandom();
        }
        return sum;
    }

}
