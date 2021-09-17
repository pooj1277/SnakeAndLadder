
/*
 * Snake and Ladder game played with single player at start position 0
 */

package com.SnakeAndLadder;
public class snakeAndLadderUC1 {
    public static void main(String[] args) {        
        int startPosition = 0;
        System.out.println("-------SNAKE AND LADDER PROGRAM------");
        System.out.println("[ This is Snake and Ladder game program played with single player at start position 0 ]\n ");
        System.out.println("Players Starting Position : " + startPosition);
        // Assuming scenarios for the ladder game using random
        int noPlay = 0;
        int isLadder = 1;
        int isSnake = 2;
        
        int position = 0;
        int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("The dice is rolled and the output is " + diceNumber);
        int play = (int) Math.floor(Math.random() * 10) % 3;
        if(play==1)            	
          	System.out.println("The outcome of playing dice number  " +diceNumber + " is a Ladder");
        else if(play==2)
           	System.out.println("The outcome of playing dice number  " +diceNumber + " is a Snake");
        else
           	System.out.println("The outcome of playing dice number  " +diceNumber + " is No Play");
        switch (play) {
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

