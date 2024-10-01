package com.example.examen;

public enum Language {
    ES("ES"),
    EN("EN"),
    FR("FR");
    private final String description;
    Language(String description){
        this.description = description;
    }
    public String toString(){
        return this.description;
    }
}
