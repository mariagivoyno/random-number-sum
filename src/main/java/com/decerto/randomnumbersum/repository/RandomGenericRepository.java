package com.decerto.randomnumbersum.repository;

import java.io.IOException;

public interface RandomGenericRepository<T> {

    T getRandom() throws IOException, InterruptedException;

}
