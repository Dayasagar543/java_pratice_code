package com.practice1.practice;

public class ReverseString {
    public String reverseString(String val) {
        char[] value = val.toCharArray();
        int left = 0, right = value.length-1;
        while (left < right) {
            char temp = value[left];
            value[left] = value[right];
            value[right] = temp;
            left++;
            right--;
        }
        return new String(value);
    }

}
     