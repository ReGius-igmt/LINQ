package ru.regiuss;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int age;
    private List<String> languages;

    public User(){
        this.languages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
}
