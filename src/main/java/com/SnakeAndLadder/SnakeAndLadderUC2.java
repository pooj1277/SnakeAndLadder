/*
 * The Player rolls the dice to get a number between 1 to 6.
 */
package com.SnakeAndLadder;

public class SnakeAndLadderUC2 {
	public static void main(String[] args) {
		System.out.println("-------SNAKE AND LADDER PROGRAM------");
        System.out.println("[ This is Snake and Ladder game program where the Player rolls the dice to get a number between 1 to 6 ]\n ");
        int startPosition = 0;
        System.out.println("The Players starting position is : " + startPosition);
      //using random to roll the dice
        int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("The Player rolled the dice and the output is " + diceNumber);
    }

}
