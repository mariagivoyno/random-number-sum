package com.decerto.randomnumbersum.service;

import java.io.IOException;

public interface DataAddingService<T> {

    T add() throws IOException, InterruptedException;

}
