package com.unicamp.mc322.lab13.utils;

public class RandomString {
    
	public static String generate() { 
        int stringLenght = 8;
        StringBuilder builder;
        
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"; 

        //create the StringBuffer
        builder = new StringBuilder(stringLenght); 

        for (int m = 0; m < stringLenght; m++) {
            int myindex = (int)(characters.length() * Math.random());
            builder.append(characters.charAt(myindex)); 
        } 

        return builder.toString(); 
    } 
}
