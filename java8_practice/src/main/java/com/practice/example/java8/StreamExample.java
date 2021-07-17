package com.practice.example.java8;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> elements = Arrays.asList("Welcome To ", "G","A","I","N"," ","J","A","V","A"," ","K","N","O","W","L","E","D","G","E");
		
		// sequential streams
		Long start1 = System.currentTimeMillis();
		elements.stream().forEach(System.out::print);
		Long end1 = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time taken by Sequential Stream : "+(end1-start1));
		
		// parallel streams
		Long start2 = System.currentTimeMillis();
		elements.stream().parallel().forEachOrdered(System.out::print);
		Long end2 = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time taken by Parrallel Stream : "+(end2-start2));
	}
}
