package com.kapkiai.learning.challenges;

import java.util.*;

public class AWS {

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        // Write your code here
        //validate input
        if (customerQuery == null || repository == null) return new ArrayList<>(0);

        List<List<String>> result = new ArrayList<>();
        List<String> suggestionList = new ArrayList<>();


        for (int i = 2; i <= customerQuery.length(); i++) {
            for (String repo : repository) {

                if (repo.startsWith(customerQuery.substring(0, i))) {
                    suggestionList.add(repo);
                    System.out.println(repo + " " + i);

                }

            }
            result.add(suggestionList);

        }


        System.out.println(result);
        return result;
    }

    public static void main(String[] args){
        List<String> sug = new ArrayList<>();
        sug.add("bags");
         sug.add("baggage");
         sug.add("banner");
         sug.add("box");
         sug.add("cloths");
                sug.add("bags");
        searchSuggestions(sug, "bags");

    }


}
