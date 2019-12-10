package com.algorithms.one;

import java.util.*;
import java.util.stream.Collectors;

public class AlgorithmsFunctions {
    public static int findTarget(int[] arr, int target) {
        int low_index = 0;
        int high_index = arr.length;
        int middle_index= (low_index + high_index)/2;
        final int NOT_FOUND = -1;
        while(low_index <= high_index && middle_index <= (arr.length -1) && middle_index >= 0){
            if (target > arr[middle_index]){
                low_index = middle_index + 1;
                middle_index = (low_index + high_index)/2;
            }
            else if(target < arr[middle_index]){
                high_index = middle_index -1;
                middle_index = (low_index + high_index)/2;
            }
            else if(target == arr[middle_index]){
                return middle_index;
            }
        }
        return NOT_FOUND;
    }
    public static String vowelOnly(String input) {
        String output = input.replaceAll("[^AEIOUaeiou]", "");
        return output;
    }
    public static List<String>[] groupString(List<String> input) {
        ArrayList<String> words = new ArrayList(input);
        LinkedList<String> output [] = new LinkedList [3];
        output[0] = new LinkedList<String>();
        output[1] = new LinkedList<String>();
        output[2] = new LinkedList<String>();
        for(String word: words){
            if(word.charAt(0)=='a'){
                output[0].add(word);
            }
            else if(word.charAt(0)=='b'){
                output[1].add(word);
            }
            else{
                output[2].add(word);
            }
        }
        return output;
    }
    public static HashMap<String, Integer> wordFrenquency(List<String> input) {
        HashMap<String, Integer> output= new HashMap<>();
        for(String word: input){
            Integer value = output.get(word);
            if(value != null){
                output.replace(word, value+1);
            }
            else{
                output.put(word, 1);
            }
        }
        return output;
    }
    public static int findDuplicate(String input){
        int output = -1;
        boolean charAlreadyInserted = false;
        HashSet<Character> charsInStrings = new HashSet<>();
        for(int i = 0 ; i < input.length(); i++){
            charAlreadyInserted = !(charsInStrings.add(input.charAt(i)));
            if(charAlreadyInserted){
                output = i;
                break;
            }
        }
        return output;
    }
    public static boolean twoSum(int[] nums, int target) {
        boolean twoSumPossible = false;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            for (j= i; j < nums.length; j++){
                if((i!=j) && (nums[i] + nums[j]) == target){
                    twoSumPossible = true;
                    return twoSumPossible;
                }
            }
        }
        return twoSumPossible;
    }
    public static String reverseString(String s) {
        StringBuffer reverStringResult = new StringBuffer(s);
        return reverStringResult.reverse().toString();
    }

    public static List<Integer> topKLarger(int[] arr, int k) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num :  arr) {
            treeSet.add(num);
            if (treeSet.size() > k) {
                treeSet.pollFirst();
            }
        }
        return treeSet.stream().collect(Collectors.toList());
    }
}
