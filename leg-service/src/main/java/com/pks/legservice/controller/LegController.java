package com.pks.legservice.controller;

import com.pks.legservice.config.LegConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/leg")
public class LegController {

    @Autowired
    private LegConfig legconfig;

    @GetMapping("/getUrl")
    public Mono<String> getUrl(){

        return Mono.just(legconfig.getUrl());
    }
}
