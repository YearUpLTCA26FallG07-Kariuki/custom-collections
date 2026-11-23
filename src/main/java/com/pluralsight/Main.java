package com.pluralsight.collection;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // creates a list that can hold 3 numbers
        FixedList<Integer> numbers = new FixedList<>(3);

        numbers.add(10);
        numbers.add(3);
        numbers.add(92);

        // displays how many numbers are in the list
        System.out.println("number of items: " + numbers.getItems().size());

        // tries adding another number after the list is full
        try {
            numbers.add(43);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        // creates a list that can hold 2 dates
        FixedList<LocalDate> dates = new FixedList<>(2);

        dates.add(LocalDate.now());
        dates.add(LocalDate.now());

        // displays how many dates are in the list
        System.out.println("number of dates: " + dates.getItems().size());

        // tries adding another date after the list is full
        try {
            dates.add(LocalDate.now());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}