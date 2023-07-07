package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedArray = new String[array.length];
        int count = array.length - 1;

        for (int i = 0; i < array.length; i++){
            reversedArray[i] = array[count - i];
        }
        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
       String[] reversedArray = reverse(array);
       for (int i = 0; i < array.length; i++){
           if(reversedArray[i]  != array[i]){
               return false;
       }

        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] formattedArray = new String[array.length];
        boolean result = true;

        for (int i = 0; i < array.length; i++){
            if(array[i].contains(" ")){
                array[i].replace(" ", "");
                formattedArray[i] = array[i];
            } else {
                formattedArray[i] = array[i];
            }
        }

        for (int j = 0; j < alphabet.length(); j++){
            Character charC = alphabet.charAt(j);
            String charCheck = charC.toString();
            if (!Arrays.toString(formattedArray).toLowerCase().contains(charCheck)){ // Kept failing because I didn't account for lowercase.
                return false;
            }
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrayAsList = new ArrayList<>();

        for (int i = 0; i < array.length; i++){
            if (!array[i].equals(valueToRemove)){
                arrayAsList.add(array[i]);
            }
        }
//            String[] result = new String[arrayAsList.size()];
//        for (int j = 0; j < result.length; j++){
//            result[j] = arrayAsList.get(j);
//        }
        return arrayAsList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> removedDuplicatesArray = new ArrayList<>();
        int lastCount = array.length - 2;

        //go through each element of the array
         //           1     2      3                           4          unchecked
        // {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"}
        for (int i = 0; i < array.length - 1; i++) {
            String current = array[i];
            String next = array[i + 1];

            //if the element after it is the same as it
            if (!current.equals(next)){
                //remove the element.
                removedDuplicatesArray.add(current);
            }
            if (i == lastCount){
                removedDuplicatesArray.add(next);
            }

        }
        //if the element after it is the same as it
        //remove the element.

        return removedDuplicatesArray.toArray(new String[0]);

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
//        String[] array = {"a", "a", "a", "b", "c", "c", "a", "a", "d"};
//        String[] expected = {"aaa", "b", "cc", "aa", "d"};

        //Look through the array
        //if there is a duplicate character
        //add the characters together into one element.
        List<String> newArray = new ArrayList<>(Arrays.asList(array));
        List<String> packedArray = new ArrayList<>();

        for(int i = 0; i < newArray.size() - 1; i++){
         String theCharacter = newArray.get(i);
         String theNextCharacter = newArray.get(i + 1);

         if (theCharacter.charAt(0) == (theNextCharacter.charAt(0))){
             newArray.set(i, theCharacter + theNextCharacter);
             newArray.remove(theNextCharacter);
             i--;
            }
        }





        return newArray.toArray(new String[0]);
    }
}
