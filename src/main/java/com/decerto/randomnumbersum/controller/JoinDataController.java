package com.decerto.randomnumbersum.controller;

import com.decerto.randomnumbersum.service.JoinIntegerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/random")
public class JoinDataController {

    @Autowired
    private JoinIntegerService joinIntegerService;

    @GetMapping("/add")
    public Integer add() throws IOException, InterruptedException {

        return joinIntegerService.add();
    }

}
