package com.sb.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {

		 List<Integer> list = new ArrayList<Integer>();
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
         
         Stream<Integer> stream = list.parallelStream(); 
         Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
         
         for(int i = 0; i < evenNumbersArr.length; i++){
        	 System.out.print(evenNumbersArr[i]);
        	 System.out.print("\n");
         }
		
	}

}
