package pt.upacademy.desafios.desafio1;

public class Desafio {

	private int countMultiple3 = 0;
	private int countMultiple5 = 0;
	private int numToCount;
	
	public Desafio(int i) {
		numToCount=i;
	}

	public void run() {
		for(int i=1; i <= numToCount; i++) {
			if(i % 3 == 0) {
				countMultiple3++;
			}
			if(i % 5 == 0) {
				countMultiple5++;
			}
		}	
	}

	public int getBig3Count() {
		return countMultiple3;
	}

	public int getBig5Count() {
		return countMultiple5;
	}

}
