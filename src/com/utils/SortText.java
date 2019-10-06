package com.utils;
import java.util.Arrays;

public class SortText {
	
    public static String SortIgnoreCase (String [] text) {
		Arrays.sort(text, String.CASE_INSENSITIVE_ORDER); 
		String data = Arrays.toString(text);	
		data = data.substring(1, data.length()-1).replace(", ", "");   
		
		return data;
    }
    
    public String SortIgnoreCase1 (String [] text) {
		Arrays.sort(text, String.CASE_INSENSITIVE_ORDER); 
		String data = Arrays.toString(text);		
		data = data.substring(1, data.length()-1).replace(", ", "");   
		
		return data;
    }
}

