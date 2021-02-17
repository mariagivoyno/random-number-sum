package com.decerto.randomnumbersum.controller;

import com.decerto.randomnumbersum.service.NumberAddingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/random")
public class NumberAddingController {

    @Autowired
    private NumberAddingService numberAddingService;

    @GetMapping("/add")
    public Integer add() throws IOException, InterruptedException {

        return numberAddingService.add();
    }

}
