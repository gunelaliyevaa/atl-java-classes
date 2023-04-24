package az.atlacademy.module01.lesson18;

import java.util.Arrays;

public class Pet {
    private int age;
    private int trickLevel;
    private String species;
    private String nickname;
    private String[] habits;

    private Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(int age, int trickLevel, String species, String nickname, String[] habits) {
        this.age = age;
        this.trickLevel = trickLevel;
        this.species = species;
        this.nickname = nickname;
        this.habits = habits;
    }

    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.print("Hello, owner. I am " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "age=" + age +
                ", trickLevel=" + trickLevel +
                ", species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}



