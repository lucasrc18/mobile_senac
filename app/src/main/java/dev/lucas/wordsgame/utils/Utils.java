package dev.lucas.wordsgame.utils;

import java.lang.Math;

public class Utils {
    public static Object choice(Object[] object_list){
        return object_list[(int) Math.floor(Math.random() * object_list.length)];
    }
}
