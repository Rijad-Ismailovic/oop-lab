import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        //exerciseOne();
        //exerciseTwo();
        //exerciseThree();
        //exerciseFour();
        //exerciseFive();
        //exerciseSix();
        //exerciseSeven(6);
        //exerciseEight(6);
        //exerciseNine(6);
        //exerciseTen();
    }

    public static void exerciseOne(){
        Scanner reader = new Scanner(System.in);
        String correctPassword = "carrot";
        String attemptedPassword = "";
        while (true){
            System.out.print("Type the password:");
            attemptedPassword = reader.nextLine();
            if (attemptedPassword.equals(correctPassword)){
                System.out.println("Right!\nThe secret is: jryy qbar!");
                reader.close();
                break;
            }
            System.out.println("Wrong!");
        }
    }

    public static void exerciseTwo(){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 3; i++){
            System.out.print("Enter number:");
            sum += reader.nextInt();
        }
        System.out.println("Sum: " + sum);
        reader.close();
    }

    public static void exerciseThree(){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int input;
        while (true){
            System.out.print("Enter number: ");
            input = reader.nextInt();
            sum += input;
            if (input == 0){
                reader.close();
                break;
            }
        }
        System.out.print("Sum: " + sum);
    }

    public static void exerciseFour(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = reader.nextInt();
        System.out.println("Enter end: ");
        int end = reader.nextInt();
        for(int i = start; i <= end; i++){
            System.out.print(i + " ");
        }
        reader.close();
    }

    public static void exerciseFive(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = reader.nextInt();
        int sum = 0;
        for(int i = 0; i <= number; i++){
            System.out.println(i);
            sum += Math.pow(2, i);
        }
        System.out.println(sum);
        reader.close();
    }

    public static void exerciseSix(){
        System.out.println("In the beggining there were the swamp, the hoe and Java\n");
    }

    public static void exerciseSeven(int n){
        for(int i = 0; i <= n; i++){
            System.out.print("*");
        }
    }

    public static void exerciseEight(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void exerciseNine(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public static void exerciseTen(){
        Scanner reader = new Scanner(System.in);
        int correctNumber = 14;
        int guessNumber;
        int numberOfAttempts = 0;
        while (true){
            System.out.print("Enter number: ");
            guessNumber = reader.nextInt();
            numberOfAttempts++;
            if(guessNumber == correctNumber){
                System.out.println("Correct!\nNumber of attempts: " + numberOfAttempts);
                reader.close();
                break;
            } else if(guessNumber < correctNumber){
                System.out.println("Number is higher.");
            } else{
                System.out.println("Number is lower.");
            }
        }
    }
}
