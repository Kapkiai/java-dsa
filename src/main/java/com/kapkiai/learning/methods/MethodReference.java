package com.kapkiai.learning.methods;

import java.util.Arrays;
import java.util.Collection;

public class MethodReference {

    public static void println(String s){
        System.out.println("name: " + s);
    }

    public static void main(String[] args){
        final Collection<String> names = Arrays.asList("Mathew", "John", "Edward");
        names.forEach(MethodReference::println);
    }
}
