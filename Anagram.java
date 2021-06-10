package com.oops;

import java.util.Arrays;
import java.util.Scanner;
//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//Example: Fired and fried.
public class Main {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Word 1 : ");
        char[] c1=anagram(input.next());
        System.out.print("Enter the Word 2 : ");
        char[] c2=anagram(input.next());
        System.out.println(Arrays.equals(c1,c2)?"WoW Anagram": " !! not a Anagram");
    }

    public  static char[] anagram(String s) {
        char[] str = new char[s.length()];
        int i = 0;
        while (i <= s.length() - 1) {
            str[i] = s.charAt(i);
            i++;
        }
        Arrays.sort(str);
        return str;
    }
}
