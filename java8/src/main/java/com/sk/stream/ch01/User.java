package com.sk.stream.ch01;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {
    private Long id;
    private String name;
    private List<String> roles;
}
