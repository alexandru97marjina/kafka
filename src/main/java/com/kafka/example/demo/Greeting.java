package com.kafka.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {

    private String msg;
    private String name;

    @Override
    public String toString() {
        return msg + ", " + name + "!";
    }
}