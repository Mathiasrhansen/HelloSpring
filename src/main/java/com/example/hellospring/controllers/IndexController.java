package com.example.hellospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class IndexController {

    @GetMapping("/")
        public String index(){
            return "Welcome to my page";
        }

    @GetMapping("/echo")
        public String echo(@RequestParam String input){
        return input;
    }

    @GetMapping("/fredag")
        public String fredag(){
        LocalDate dag = LocalDate.now();
        int dagNum = dag.getDayOfWeek().getValue();

        if (dagNum == 5){
            return "Det er fredag!!";
        }
        else {
            return "Det er ikke fredag";
        }
    }
}
