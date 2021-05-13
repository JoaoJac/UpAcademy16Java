package pt.upacademy.desafios.desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.stream.Stream;

public class Desafio {

	public static int[] ints(String string) {		
		Scanner sc = new Scanner(string);
		List<Integer> list = new ArrayList<>();
		
		while(sc.hasNext()) {
			if(sc.hasNextInt()) {
				list.add(sc.nextInt());
			}else {
				sc.next();
			}	
		}
		sc.close();
		
		int [] intArr = list.stream().mapToInt(x -> x).toArray();
		return intArr;	
		
		
//		if (string.length() == 0) {
//			return new int[0];
//		}
//		String[] strArr = string.split(" ");
//		return Stream.of(strArr)
//				.filter(x -> x.chars().allMatch(Character::isDigit))
//				.mapToInt(i -> Integer.parseInt(i))
//				.toArray();
	}
}
