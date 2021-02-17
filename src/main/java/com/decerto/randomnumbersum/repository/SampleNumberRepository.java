package com.decerto.randomnumbersum.repository;

import com.decerto.randomnumbersum.model.SampleNumberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleNumberRepository extends JpaRepository<SampleNumberEntity, Integer> {

}
