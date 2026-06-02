package com.devops.demo;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String message = "hello devops world";

        // Using the Apache Commons library we added
        String capitalized = StringUtils.capitalize(message);

        System.out.println("Original:    " + message);
        System.out.println("Capitalized: " + capitalized);
    }
}
