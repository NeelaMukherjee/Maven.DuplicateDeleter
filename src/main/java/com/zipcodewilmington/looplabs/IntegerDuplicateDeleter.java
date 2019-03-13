package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    Integer[] intArray = super.array;

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }


    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        Stream<Integer> intStream = Arrays.stream(intArray).filter(integer -> counter(integer) < maxNumberOfDuplications);
        Integer[] arrayWithoutDuplicates = intStream.toArray(Integer[]::new);
        return arrayWithoutDuplicates;
    }

    public Integer counter(Integer integer) {
        int counter = 0;
        for (Integer num: intArray) {
            if(num.equals(integer)) {
                counter++;
            }
        } return counter;
    }




    @Override
    public Integer[] removeDuplicatesExactly ( int exactNumberOfDuplications) {

        Stream<Integer> intStream = Arrays.stream(intArray).filter(integer -> counter(integer) != exactNumberOfDuplications);
        Integer[] arrayWithoutDuplicates = intStream.toArray(Integer[]::new);
        return arrayWithoutDuplicates;
    }
    }

