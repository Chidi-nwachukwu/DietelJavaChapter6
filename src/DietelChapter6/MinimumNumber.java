package DietelChapter6;

public class MinimumNumber {

        private double minimum;



        public void checkMinimumOfThreeNumbers(double firstNumber, double secondNumber, double thirdNumber)
        {
            double x = Math.min(firstNumber, secondNumber);
            minimum = Math.min(x, thirdNumber);
        }

        public double getMinimum() {
            return minimum;
        }
    }



