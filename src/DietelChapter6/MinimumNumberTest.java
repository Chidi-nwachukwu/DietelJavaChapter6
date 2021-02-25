package DietelChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    void test(){

    }
    @Test
    void testToCheckForMinimumNumberOfThreeNumbers(){
        MinimumNumber myNumber = new MinimumNumber();

        int firstNumber = 6;
        int secondNumber = 4;
        int thirdNumber = 8;

        myNumber.checkMinimumOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        assertEquals(4,myNumber.getMinimum());

    }
}