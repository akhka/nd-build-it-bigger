package com.gcs.javajokelibrary;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class JokeMaker {

    public String tellJoke() {
        List<String> jokeList = asList(
                "What will we get if we removed a fish eye?\n\n-- Fsh  XD",
                "Son: Mom, does angels fly?\n\nMom: Yes, son. Why?\n\nSon: Because daddy said to the maid \"my angel\" but she didn't fly!\n\nMom: Don't worry, she'll fly right now!",
                "Someone: What is your usual coffee type?\n\nProgrammer: Java.",
                "Doctor: I'm sorry to tell you that, but you have only 10 left to live.\n\nPatient: 10 what??! years?! months?!\n\nDoctor: 9..",
                "Someone: You told me that everyday you run at least 3 or 4 times, why aren't you at a healthy shape?!\n\nProgrammer: Of course the type of running with lots of bugs isn't healthy at all!",
                "Programmer: Code doesn't work, and I have no idea why!\n\nAlso Programmer: Great, now code works totally fine, and I have no idea why!!",
                "Someone: I always lose my belongs at home, I feel stupid!\n\nProgrammer: Believe me, it isn't as stupid as a forgotten semicolon at the end of a line"
        );

        Random random = new Random();
        String joke = jokeList.get(random.nextInt(jokeList.size()));
        return joke;
    }

}
