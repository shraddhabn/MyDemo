package com.string;

public class RemoveAllSpace {
	public static void main(String[] args) {  
        String str = "I am   in      ojas now ";  
        //1st way  
        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
        System.out.println(noSpaceStr);  
        
    }  
}
