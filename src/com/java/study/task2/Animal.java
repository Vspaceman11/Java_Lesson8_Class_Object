package com.java.study.task2;

import com.java.study.task1.Monitor;

import java.util.Objects;

public class Animal {
    private String name;
    private int year;
    private boolean tale;

    public Animal(String name, int year, boolean tale) {
        this.name = name;
        this.year = year;
        this.tale = tale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isTale() {
        return tale;
    }

    public void setTale(boolean tale) {
        this.tale = tale;
    }

    @Override
    public String toString(){
        return String.format("Name: " + name + ", born: " + year + ", tale: " + tale);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        if (name != animal.name || year != animal.year || tale != animal.tale) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, year, tale);
    }
}
