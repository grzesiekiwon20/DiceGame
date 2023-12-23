package org.example;

import java.util.Random;

// Class representing the dice games and statistical calculations
public class Game {

    // Simulates a game where a die is rolled four times, and you win if at least one roll results in a 6
    public int rollDiceGameOf4() {
        Random random = new Random();
        int dice = random.nextInt(6) + 1;
        for (int i = 0; i < 4; i++) {
            if (dice == 6) {
                return 1; // Win
            }
        }
        return 0; // Loss
    }

    // Simulates a game where two dice are rolled 24 times, and you win if at least one roll results in a double six
    public int rollDiceGameOf24() {
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        for (int i = 0; i < 24; i++) {
            if (dice1 == 6 && dice2 == 6) {
                return 1; // Win
            }
        }
        return 0; // Loss
    }

    // Helper method to calculate the variance of an array of values
    public double calculateVariance(int[] values, double mean) {
        double sumSquaredDiff = 0;
        for (int value : values) {
            double diff = value - mean;
            sumSquaredDiff += diff * diff;
        }
        return sumSquaredDiff / values.length;
    }

    // Helper method to calculate the mean of an array of values
    public double calculateMean(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }

    // Helper method to calculate the standard deviation given the variance
    public double calculateStandardDeviation(double variance) {
        return Math.sqrt(variance);
    }
}