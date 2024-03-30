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
        System.arraycopy(arrayToMerge,0,newArr,0,arrayToMerge.length);
        System.arraycopy(array, 0, newArr, arrayToMerge.length, array.length);
        for(T t: arrayToMerge){
            System.out.println(t);
        }
        return null;
    }

    public T removeValue(T valueToRemove) {
        return (T) array;
    }

    public T getNumberOfOccurrences(T valueToEvaluate) {
        return null;
    }
}
