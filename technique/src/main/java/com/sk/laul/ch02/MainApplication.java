package com.sk.laul.ch02;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainApplication {

    //본 소스는 프로젝트 하위 모듈이므로, technique 부터 시작해야 함
    private static final String RESOURCES = "technique/src/main/resources/";

    public static void main(String[] args) throws IOException {

        Path path = Paths.get(RESOURCES+args[0]);

        double total = 0l;
        final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            final String[] columns = line.split(",");
            final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
            //특정달의 입출금만 합산
            if(date.getMonth() == Month.JANUARY){
                final double amount = Double.parseDouble(columns[1]);
                total += amount;
            }
        }
        System.out.println(total);
    }
}