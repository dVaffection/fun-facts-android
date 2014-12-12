package com.example.dv.funfacts;

import java.util.Random;

/**
 * Created by dv on 12/11/14.
 */
public class FactBook {

    final private String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly from silver.",
            "11% of people are left handed.",
            "August has the highest percentage of births",
            "The average person falls asleep in 7 minutes",
            "A bear has 42 teeth",
            "An ostrich's eye is bigger than it's brain",
            "Most lipsticks contain fish scales",
            "Lemons contain more sugar than strawberries",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
    };

    final private Random random = new Random();

    public String getRandomFact() {
        return facts[random.nextInt(facts.length)];
    }

}
