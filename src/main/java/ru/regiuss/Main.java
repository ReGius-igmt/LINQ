package ru.regiuss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] teams = {"Бавария", "Боруссия", "Реал Мадрид", "Манчестер Сити", "ПСЖ", "Барселона"};

        String[] selectedTeams = Arrays.stream(teams)
                .filter(t -> t.toUpperCase().startsWith("Б"))
                .sorted()
                .toArray(String[]::new);

        System.out.println(Arrays.toString(selectedTeams));

        List<User> users = List.of(
            new User("Том", 23, List.of("английский", "немецкий")),
            new User("Боб", 27, List.of("английский", "французский")),
            new User("Джон", 29, List.of("английский", "испанский")),
            new User("Элис", 24, List.of("испанский", "немецкий"))
        );
        List<User> selectedUsers = users.stream()
                .filter(user -> user.getAge() > 25)
                .toList();
        System.out.println(selectedUsers);
    }
}
