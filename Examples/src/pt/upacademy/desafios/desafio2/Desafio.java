package pt.upacademy.desafios.desafio2;

public class Desafio {
		
	public static String order(String string) {
		String [] ArrayOfWords = string.split(" ");
		StringBuilder output = new StringBuilder();
		int numberOfWords = ArrayOfWords.length;
		int currentNumber = 1;
		
		while(currentNumber <= numberOfWords) {
			for (int i = 0; i < numberOfWords; i++) {
				if(ArrayOfWords[i].contains(""+currentNumber)) {
					output.append(ArrayOfWords[i]).append(" ");
					continue;
				}	
			}
			currentNumber++;
		}
		return output.toString().trim();
	}
}
