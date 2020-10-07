package be.intecbrussel.dierenopvang;

import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Vaccinateable, Treatable {

    Map<Disease, Boolean> isVaccinated = new HashMap<>();
    isVaccinated.put("CHICKENPOCKS", false);
    isVaccinated.put("FLUE", false);
    isVaccinated.put("POLIO", false);
    isVaccinated.put("HEPATITISA", false);

    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;

    public Animal() {

    }

    public Animal(Map<Disease, Boolean> isVaccinated, boolean isClean, int age, String name, int animalNumber) {



    }


}
