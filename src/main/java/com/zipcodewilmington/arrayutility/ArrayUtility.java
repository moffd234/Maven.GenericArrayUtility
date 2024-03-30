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

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        Object[] newArr = new Object[arrayToMerge.length + array.length];

        // Combine the two arrays into the newArr
        System.arraycopy(arrayToMerge,0,newArr,0,arrayToMerge.length);
        System.arraycopy(array, 0, newArr, arrayToMerge.length, array.length);

        // Find number of times valueToEvaluate occurs
        int total = 0;
        for(int i = 0; i < newArr.length; i++){
            if(newArr[i] == valueToEvaluate){
                total ++;
            }
        }
        return total;
    }

    public T[] removeValue(T valueToRemove) {
        return array;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int total = 0;
        for(T t : array){
            if(t == valueToEvaluate){
                total += 1;
            }
        }
        return total;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return array[1];
    }


}
