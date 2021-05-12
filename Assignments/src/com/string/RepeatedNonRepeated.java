package com.string;

import java.util.HashMap;
import java.util.Scanner;
  
public class RepeatedNonRepeated
{    
    static void RepeatedNonRepeatedChar(String inputString)
    {
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();

         for (char ch : strArray)
        {
            if(charCount.containsKey(ch))
            {
                charCount.put(ch, charCount.get(ch)+1);
            }
            else
            {
                charCount.put(ch, 1);
            }
        }
       
        for (char ch : strArray)
        {
            if (charCount.get(ch) == 1)
            {
                System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+ch+"'");
                break;
            }
        }
        for (char ch : strArray)
        {
            if (charCount.get(ch) > 1)
            {
                System.out.println("First Repeated Character In '"+inputString+"' is '"+ch+"'");
                 break;
            }
        }
    }     
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String input = sc.next();
        RepeatedNonRepeatedChar(input);
    }
}
