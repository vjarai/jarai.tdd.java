package de.jarai.kniffel_kata;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class KniffelCalculatorTest {

    @Test
    public void testKniffel() {
        assertEquals(50, KniffelCalculator.Kniffel(new int[]{1, 1, 1, 1, 1}));
        assertEquals(0, KniffelCalculator.Kniffel(new int[]{1, 1, 1, 1, 2}));
    }

    @Test
    public void testOnes() {
        assertEquals(2, KniffelCalculator.Ones(1, 1, 2, 3, 4));
        assertEquals(0, KniffelCalculator.Ones(2, 3, 4, 5, 6));
    }

    @Test
    public void testTwos() {
        assertEquals(4, KniffelCalculator.Twos(2, 2, 3, 4, 5));
        assertEquals(0, KniffelCalculator.Twos(1, 3, 4, 5, 6));
    }

    @Test
    public void testThrees() {
        assertEquals(9, KniffelCalculator.Threes(3, 3, 3, 4, 5));
        assertEquals(0, KniffelCalculator.Threes(1, 2, 4, 5, 6));
    }

    @Test
    public void testFours() {
        KniffelCalculator calculator = new KniffelCalculator(4, 4, 4, 4, 5);
        assertEquals(16, calculator.Fours());
    }

    @Test
    public void testFives() {
        KniffelCalculator calculator = new KniffelCalculator(5, 5, 5, 5, 5);
        assertEquals(25, calculator.Fives());
    }

    @Test
    public void testSixes() {
        KniffelCalculator calculator = new KniffelCalculator(6, 6, 6, 6, 6);
        assertEquals(30, calculator.Sixes());
    }

    @Test
    public void testScorePair() {
        assertEquals(8, KniffelCalculator.ScorePair(4, 4, 3, 2, 1));
        assertEquals(0, KniffelCalculator.ScorePair(1, 2, 3, 4, 5));
    }

    @Test
    public void testTwoPair() {
        int d1 = 3, d2 = 3, d3 = 5, d4 = 4, d5 = 5;
        assertEquals(16, KniffelCalculator.TwoPair(3, 3, 5, 4, 5));
        assertEquals(0, KniffelCalculator.TwoPair(1, 2, 3, 4, 5));
    }

    @Test
    public void testFourOfAKind() {
        assertEquals(12, KniffelCalculator.FourOfAKind(3, 3, 3, 3, 2));
        assertEquals(0, KniffelCalculator.FourOfAKind(1, 2, 3, 4, 5));
    }

    @Test
    public void testThreeOfAKind() {
        assertEquals(9, KniffelCalculator.ThreeOfAKind(3, 3, 3, 2, 1));
        assertEquals(0, KniffelCalculator.ThreeOfAKind(1, 2, 3, 4, 5));
    }

    @Test
    public void testSmallStraight() {
        assertEquals(15, KniffelCalculator.SmallStraight(1, 2, 3, 4, 5));
        assertEquals(0, KniffelCalculator.SmallStraight(1, 2, 2, 4, 5));
    }

    @Test
    public void testLargeStraight() {
        assertEquals(20, KniffelCalculator.LargeStraight(2, 3, 4, 5, 6));
        assertEquals(0, KniffelCalculator.LargeStraight(1, 2, 3, 4, 5));
    }

    @Test
    public void testFullHouse() {
        //   int d1 = 2, d2 = 2, d3 = 3, d4 = 3, d5 = 3;
        assertEquals(13, KniffelCalculator.FullHouse(2, 2, 3, 3, 3));
        assertEquals(0, KniffelCalculator.FullHouse(1, 2, 3, 4, 5));
    }
}