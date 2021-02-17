package com.decerto.randomnumbersum.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RandomFromSQL implements RandomIntegerRepository {

    @Autowired
    private SampleNumberRepository sampleNumberRepository;

    @Override
    public Integer getRandom() {

        var sampleNumbers = sampleNumberRepository.findAll();
        if (sampleNumbers.size() > 0)
            return sampleNumbers.get(0).getValue();
        else
            return (int) (Integer.MAX_VALUE * Math.random());
    }

}
