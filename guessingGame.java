import java.util.*;
public class guessingGame{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max = 100;
        int min = 1;
        
        int numberGenerated  =  min + (int)(Math.random()*((max-min)+1));
        System.out.println("Welcome to the guessing game!!");
        while(true){
        System.out.println("Press 1 to Start the game");
        System.out.println("Press 2 to Exit");
        
        int userChoice = sc.nextInt();

        if(userChoice==2)
            System.exit(0);
        
        else if(userChoice==1){
        
        System.out.println("Rules of the Game");
        System.out.println();
        System.out.println("1. You will be allowed to guess only for 10 times");
        System.out.println("2. Each right answer will gain you 10 points");
        System.out.println("3. Each wrong answer will give you -1");
        System.out.println("4. Scores will be displayed after each round");
        System.out.println();
        System.out.println("So let the round begin");
        System.out.println();
        System.out.println("..waiting for the computer to choose!");
        try{
        Thread.sleep(5000);
        }
        catch(Exception e){
            System.out.println(e);
        }

        int round=1;
        int count = 0;
        int score=0;
        while(count<round ){
        System.out.println("Computer has choosen it's number!");
        System.out.println();
         int userNumber = -1;
        for(int i=0;i<10 && userNumber!=numberGenerated;i++){

            System.out.println("Take a guess now!!");
            userNumber = sc.nextInt();

            if(userNumber == numberGenerated){
            System.out.println("Woww!! Guessed it right");
            score+=5;
            }
            else{
            System.out.println("Oopsiee take a guess again!");
            if(userNumber<numberGenerated){
                System.out.println("Clue: The number is higher than the entered value!");
            }
            else{
                System.out.println("Clue: The number is lower than the entered value!");
            }
            System.out.println();
            score-=1;
            }
        }
        count++;
        System.out.println();
        System.out.println("Your current score after round "+round+" is: "+score);
        System.out.println();
        System.out.println("Wanna play another round?? Press 1 for yes!");
        int yes = sc.nextInt();
        if(yes==1)
            round++;
        }
        
    }
    else{
        System.out.println("Please enter a correct choice");
    }
    }
    }
}