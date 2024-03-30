package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T>{
    T[] array;

    public ArrayUtility(T[] inputArray) {
        array = inputArray;
    }

    private T[] merge(T[] arrayToMerge){
        Object[] newArr = new Object[arrayToMerge.length + array.length];

        // Combine the two arrays into the newArr
        System.arraycopy(arrayToMerge,0,newArr,0,arrayToMerge.length);
        System.arraycopy(array, 0, newArr, arrayToMerge.length, array.length);

        return (T[]) newArr;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {

        T[] newArr = merge(arrayToMerge);
        // Find number of times valueToEvaluate occurs
        return getNumberOfOccurrences(valueToEvaluate, newArr);
    }

    public T[] removeValue(T valueToRemove) {
        return array;
    }

    private Integer getNumberOfOccurrences(T valueToEvaluate, T[] array){
        int total = 0;
        for(T t : array){
            if(t == valueToEvaluate){
                total += 1;
            }
        }
        return total;
    }
    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        return getNumberOfOccurrences(valueToEvaluate, array);
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return array[1];
    }


}
