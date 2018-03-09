package crapsgame;

import java.security.SecureRandom;

public class CrapsGame {

	private static final SecureRandom randomNumbers= new SecureRandom(); // static field;
	
	private enum Status { LOST,WON,CONTINUE }; // struct gibi
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static int rollDice() {
		int die1 = randomNumbers.nextInt(6)+1;
		int die2 = randomNumbers.nextInt(6)+1;

		int sum = die1 + die2;

		System.out.printf("The first die is %d, The second die is %d,Sum is %d\n", die1, die2,die1+die2);

		return sum;
	}

	public static void main(String[] args) {
		int myPoint = 0;  // yerel değişkene diret olarak 0 atanmıyor, bu şekilde atamak lazım
		Status gameStatus;

		int sumOfDice = rollDice();

		switch(sumOfDice) {
			case SEVEN:
			case YO_LEVEN:
				gameStatus=Status.WON;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus=Status.LOST;
				break;
			default:
				myPoint=sumOfDice;
				gameStatus=Status.CONTINUE;
				System.out.println("My Point is "+myPoint);
		}

		while(gameStatus==Status.CONTINUE) {
			sumOfDice=rollDice();
			if (sumOfDice==SEVEN) {
				gameStatus=Status.LOST;
			}
			else
				if (sumOfDice==myPoint) {
					gameStatus=Status.WON;
				}
		}

		if(gameStatus==Status.WON)
			System.out.println("The player won!");
		else
			System.out.println("The player lost!");
	}
}
