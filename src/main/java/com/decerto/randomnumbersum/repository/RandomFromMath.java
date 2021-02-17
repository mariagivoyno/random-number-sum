package com.decerto.randomnumbersum.repository;

import org.springframework.stereotype.Repository;

@Repository
public class RandomFromMath implements RandomIntegerRepository {

    @Override
    public Integer getRandom() {

        return (int) (Integer.MAX_VALUE * Math.random());
    }

}
