package com.xxx.chatbot.util;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by himanshu dhawan on 09-06-2017.
 */
public class Randomizer {

    public static String get( List<String> speech){
        int size = speech.size();
        int random =  ThreadLocalRandom.current().nextInt(0, size);
        return speech.get(random);
    }
}
