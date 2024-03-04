package com.pipeline.TestPipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestPipelineController {

    @GetMapping("/test")
    public String getData(){
        return "Hello";
    }

}
