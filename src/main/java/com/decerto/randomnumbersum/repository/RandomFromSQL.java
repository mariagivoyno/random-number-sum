package com.decerto.randomnumbersum.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RandomFromSQL implements RandomIntegerRepository {

    @Autowired
    private SampleNumberRepository sampleNumberRepository;

    @Override
    public Integer getRandom() {

        var numberOfRecords = sampleNumberRepository.count();
        var id = (int) (System.currentTimeMillis() % numberOfRecords + 1);
        var selectedNumber = sampleNumberRepository.getOne(id);

        return selectedNumber.getValue();
    }

}
