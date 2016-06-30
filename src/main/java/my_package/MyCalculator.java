package my_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lapte on 28.06.2016.
 */
public class MyCalculator {
    public static void main(String[] args) throws IOException {
        double firstNumber;
        double secondNumber;
        int mathematicalOperation;

        String myChoise = "my choise";
        while (!(myChoise.equals("q"))) {
            System.out.println("Enter the first number");
            firstNumber = enterTheNumber();
            System.out.println(firstNumber);
            System.out.println("Choose the mathematic operation");
            System.out.println("1 -> \"+\"");
            System.out.println("2 -> \"-\"");
            System.out.println("3 -> \"*\"");
            System.out.println("4 -> \"/\"");
            boolean flag = false;
            do {
                mathematicalOperation = chooseMathematicalOperation();
                if (mathematicalOperation == 1 || mathematicalOperation == 2
                        || mathematicalOperation == 3 || mathematicalOperation == 4) {

                    flag = true;
                } else {
                    System.out.println("Try again");
                }
            } while (!(flag));

            System.out.println("Enter the second number");
            secondNumber = enterTheNumber();
            System.out.println(secondNumber);


            switch (mathematicalOperation) {
                case 1: {
                    System.out.printf("%s + %s = %s%n", firstNumber, secondNumber, firstNumber + secondNumber);
                    break;
                }
                case 2: {
                    System.out.printf("%s - %s = %s%n", firstNumber, secondNumber, firstNumber - secondNumber);
                    break;
                }
                case 3: {
                    System.out.printf("%s * %s = %s%n", firstNumber, secondNumber, firstNumber * secondNumber);
                    break;
                }
                case 4: {
                    System.out.printf("%s / %s = %s%n", firstNumber, secondNumber, firstNumber / secondNumber);
                    break;
                }

            }
            System.out.println("Do you whant to calculate again? Enter: any word to continue or \"q\" for quit");

            myChoise = chooseToQuit();

        }
        System.out.println("Thank you!");
    }


    public static int chooseMathematicalOperation() throws IOException {
        int numberOfOperation;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        numberOfOperation = Integer.parseInt(reader.readLine());
        return numberOfOperation;
    }

    public static double enterTheNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;
        number = Integer.parseInt(reader.readLine());
        return number;
    }

    public static String chooseToQuit() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String myChoise;
        myChoise = reader.readLine();
        return myChoise;
    }
}
