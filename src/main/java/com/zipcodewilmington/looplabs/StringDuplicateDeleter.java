package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    String [] stringArray = super.array;

    public StringDuplicateDeleter(String[] stringArray) {
        super(stringArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Stream<String> stringStream = Arrays.stream(stringArray).filter(string -> counter(string) < maxNumberOfDuplications);
        String[] arrayWithoutDuplicates = stringStream.toArray(String[]::new);
        return arrayWithoutDuplicates;
    }

    public Integer counter(String string) {
        int counter = 0;
        for (String word: stringArray) {
            if(word.equals(string)) {
                counter++;
            }
        } return counter;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Stream<String> stringStream = Arrays.stream(stringArray).filter(string -> counter(string) != exactNumberOfDuplications);
        String[] arrayWithoutDuplicates = stringStream.toArray(String[]::new);
        return arrayWithoutDuplicates;
    }
}
