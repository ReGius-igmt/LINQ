package ru.regiuss;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] teams = {"Бавария", "Боруссия", "Реал Мадрид", "Манчестер Сити", "ПСЖ", "Барселона"};

        String[] selectedTeams = Arrays.stream(teams)
                .filter(t -> t.toUpperCase().startsWith("Б"))
                .sorted()
                .toArray(String[]::new);

        System.out.println(Arrays.toString(selectedTeams));
    }
}
