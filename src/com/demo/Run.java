package com.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.utils.SortText;

public class Run {

	public static void main(String[] args) {
		//create variable
		String text ="",data ="";
		List<String> al = new ArrayList<String>(); 
		Scanner keyboard = new Scanner(System.in);
		
		//input data on console
		System.out.println("inputText : ");
		text = keyboard.nextLine() ;
		keyboard.close();	
		
		String[] textSort = text.split(" ");
		//loop Sorting string array
		for(String textData : textSort) {	
			String [] textData1 = textData.split("");
			// ex.1
			//call static function for sorting text 
			//	data = SortText.SortIgnoreCase(textData1); 
			
			// ex.2
			//call function for sorting text 
			SortText sort = new SortText();
			data = sort.SortIgnoreCase1(textData1);
			
			//add text to list
			al.add(data); 
		}	
		//loop print Result
		for(String s: al){ 
			System.out.print(s+" ");
		}

	}
}
