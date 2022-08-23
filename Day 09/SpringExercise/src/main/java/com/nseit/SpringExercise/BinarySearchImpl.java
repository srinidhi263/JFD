package com.nseit.SpringExercise;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component

public class BinarySearchImpl {
    @Autowired
    private SortAlg sortAlg;

    public int binarySearch(int[] numbers, int numberToSearch) {
        int sortedNumbers = sortAlg.sort(numbers);
        return numberToSearch;
    }
}
