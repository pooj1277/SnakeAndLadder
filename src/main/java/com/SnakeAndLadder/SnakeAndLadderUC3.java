/*
 * The Player checks for a Option. They are No Play, Ladder or Snake. 
 * - Using ((RANDOM)) to check for Options 
 * - In Case of No Play the player stays in the same position
 * - In Case of Ladder the player moves ahead by the number of position received in the dice
 * - In Case of Snake the player moves behind by the number of position received in the dice
 */
package com.SnakeAndLadder;
public class SnakeAndLadderUC3 {
    public static void main(String[] args) {        
        int startPosition = 0;
        System.out.println("-------SNAKE AND LADDER PROGRAM------");
        
        System.out.println("Players Starting Position : " + startPosition);
        // Assuming scenarios for the ladder game using random
        int noPlay = 0;
        int isLadder = 1;
        int isSnake = 2;
        
        int position = 0;
        //using random to roll the dice
        int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("The dice is rolled and the output is " + diceNumber);
        //using random to get options
        int option = (int) Math.floor(Math.random() * 10) % 3;
        if(option==1)         
        	//Ladder - the player moves ahead by the number of position received in the dice
          	System.out.println("The outcome of playing dice number  " +diceNumber + " is a Ladder");
        else if(option==2)
        	//Snake - the player moves behind by the number of position received in the dice
           	System.out.println("The outcome of playing dice number  " +diceNumber + " is a Snake");
        else
        	//No Play- the player stays in the same position
           	System.out.println("The outcome of playing dice number  " +diceNumber + " is No Play");
        switch (option) {
            case 1:
            	position = diceNumber + position;
                System.out.println("Hence Players position after Ladder is : " + position);
                break;

            case 2:
                position = position - diceNumber;
                System.out.println("Hence Players position after encountering Snake is " + position);
                break;

            default:
                System.out.println("Its a No play for the player");
       }//switch
    
    }//main
    
}//class
