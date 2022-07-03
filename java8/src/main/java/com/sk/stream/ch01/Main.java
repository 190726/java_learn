package com.sk.stream.ch01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static final String[] FORBIDDEN_WORDS = new String[]{"words", "lee", "est"};

    public static void main(String[] args) {
        example2();
    }

    public static void example1(){
        User user = new User();
        user.setId(1L);
        user.setName("sangkook");
        user.setRoles(Arrays.asList("10", "20","30"));

        Set authorities = new HashSet();

        //user.getRoles().forEach(role -> authorities.add(role));

        Set<Roles> collect = user.getRoles()
                .stream()
                .map(role -> new Roles(role))
                .collect(Collectors.toSet());

        System.out.println(authorities);
    }

    public static void example2() {
        String word = "st";
        List<String> forbiddenWords = Arrays.asList(FORBIDDEN_WORDS);
        for (int i = 0; i < forbiddenWords.size(); i++) {
            if (forbiddenWords.get(i).contains(word)){
                System.out.println("find!!");
            }
        }

        boolean isContain = Arrays.stream(FORBIDDEN_WORDS)
                .anyMatch(fw -> fw.contains(word));

        System.out.println(isContain);
    }
}