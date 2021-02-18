package com.decerto.randomnumbersum.service;

import java.io.IOException;

public interface JoinDataService<T> {

    T add() throws IOException, InterruptedException;

}
