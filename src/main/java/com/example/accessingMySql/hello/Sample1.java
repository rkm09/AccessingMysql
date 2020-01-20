package com.example.accessingMySql.hello;

import java.util.Optional;

public class Sample1 {
    public static void main(String[] args) {
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if(checkNull.isPresent()) {
            System.out.println(words[5].toLowerCase());
        } else {
            System.out.println(words[5]);
        }
    }
}
