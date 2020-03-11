package src.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		List<Integer>lis=new ArrayList<>();
		lis.add(10);
		lis.add(20);
		lis.add(30);
		lis.add(40);
		lis.add(80);
		lis.add(50);
		lis.add(70);
		lis.add(10);
		
		int size = lis.size();
		System.out.println(size);
		Integer integer = lis.get(5);
		System.out.println(integer);
		int indexOf = lis.indexOf(10);
		System.out.println(indexOf);
		int lastIndexOf = lis.lastIndexOf(10);
		System.out.println(lastIndexOf);
		Integer integer2 = lis.get(7);
		System.out.println(integer2);
		int indexOf2 = lis.indexOf(80);
		System.out.println(indexOf2);
		lis.add(2, 70);
		System.out.println(lis);
		lis.add(lastIndexOf, 45);
		System.out.println(lis);
		
		
		
 
	}

}
