package com.examples;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import com.algorithms.one.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(AlgorithmsFunctions.vowelOnly("Hello World"));
        int arr1 [] = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
        int arr2 [] = {1, 2, 3, 4, 5};
        int arr3 [] = {1, 2, 3, 4, 5,6,7,10};
        System.out.println(AlgorithmsFunctions.findTarget(arr1, 11));
        System.out.println(AlgorithmsFunctions.findTarget(arr2, 10));
        System.out.println(AlgorithmsFunctions.findTarget(arr3, 10));
        List<String> input = Arrays.asList("abc", "bcd", "bbb", "ace", "snb", "aaaa", "bbbbb", "eeee");
        List<String> input2 = Arrays.asList("abc", "bcd", "abc");
        String testFindDuplicate = "dcadc";
        System.out.println(AlgorithmsFunctions.findDuplicate(testFindDuplicate));
        int [] twoSumTest = {1,4,5,1,6}; int target = 2;
        System.out.println(AlgorithmsFunctions.twoSum(twoSumTest, target));
        System.out.println(AlgorithmsFunctions.reverseString("Hello world!"));
    }

}
