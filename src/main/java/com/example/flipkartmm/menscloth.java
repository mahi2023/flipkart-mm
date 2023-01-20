package com.example.flipkartmm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class menscloth {
    @GetMapping("/menscloth")
    public String getData(){
        return " only boys allowed   ";
    }
}
