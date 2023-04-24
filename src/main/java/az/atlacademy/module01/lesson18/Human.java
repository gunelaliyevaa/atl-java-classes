package az.atlacademy.module01.lesson18;

import java.util.Arrays;

public class Human {
    private int iq;
    private int year;
    private String name;
    private String surname;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    private Human() {
    }

    public Human(int year, String name, String surname) {
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public Human(int year, String name, String surname, Human mother, Human father) {
        this.year = year;
        this.name = name;
        this.surname = surname;
        this.mother = mother;
        this.father = father;
    }

    public Human(int iq, int year, String name, String surname, Pet pet, Human mother, Human father,
                 String[][] schedule) {
        this.iq = iq;
        this.year = year;
        this.name = name;
        this.surname = surname;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.print("Hello, " + this.pet.getNickname());
    }

    public void describePet() {
        if (this.pet.getAge() > 50) {
            System.out.print("I have a" + this.pet.getSpecies() + ", he is" + this.pet.getAge() + " years old, he is very sly");
        } else {
            System.out.print("I have a" + this.pet.getSpecies() + ", he is" + this.pet.getAge() + " years old, he is almost not sly");
        }

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
