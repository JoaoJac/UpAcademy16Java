package pt.upacademy.desafios.desafio3;

public class Desafio {

	public static int points(String[] strings) {
		int score = 0;
		for (String s : strings) {
			String [] numbers = s.split(":");
			if(Integer.parseInt(numbers[0]) > Integer.parseInt(numbers[1])) {
				score += 3;
			}else if (Integer.parseInt(numbers[0]) == Integer.parseInt(numbers[1])) {
				score += 1;
			}
		}
		return score;
	}
}
