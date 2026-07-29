import java.util.Scanner;
import java.util.Random;

public class Main{

    public static void main(String[] args){

        Random rm= new Random();
        int randomNumber= rm.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number from 0 to 100: ");
        int guessNumber= sc.nextInt();

        if(guessNumber > 100 || guessNumber<0){
            System.out.println("The number is out of range, it should be between 0 and 100");
        }
        else if(guessNumber< randomNumber){
            System.out.println("Too low " + randomNumber + " is the correct number");
        } else if (guessNumber>randomNumber) {
            System.out.println("Too high " + randomNumber + " is the correct number");
        }
        else{
            System.out.println("Correct!");
        }
    }
}