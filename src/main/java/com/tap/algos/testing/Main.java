package com.tap.algos.testing;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(toCamelCase(""));
    }

    static String toCamelCase(String s) {
        if (s != "") {
            String[] splitWord = s.split("[-_]");
            if (Character.isUpperCase(splitWord[0].charAt(0))) {
                splitWord[0] = splitWord[0].substring(0, 1).toUpperCase(Locale.ROOT) + splitWord[0].substring(1);
            }
            for (int i = 1; i < splitWord.length; i++) {
                splitWord[i] = splitWord[i].substring(0, 1).toUpperCase(Locale.ROOT) + splitWord[i].substring(1);
            }
            return String.join("", splitWord);
        }
        return s;
    }
}
