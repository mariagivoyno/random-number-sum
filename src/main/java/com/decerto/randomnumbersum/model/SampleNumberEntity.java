package com.decerto.randomnumbersum.model;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "sample_number")
public class SampleNumberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "value")
    private Integer value;

}
