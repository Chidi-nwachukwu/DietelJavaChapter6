package DietelChapter6;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            MinimumNumber myNumber = new MinimumNumber();

            System.out.print("Enter first numbers");
            double firstNumber = input.nextDouble();
            System.out.print("Enter second numbers");
            double secondNumber = input.nextDouble();
            System.out.print("Enter third numbers");
            double thirdNumber = input.nextDouble();

            myNumber.checkMinimumOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

            double result = myNumber.getMinimum();
            System.out.println(result);
        }
    }


