package org.example;

import org.example.Game;

// Main class to execute the simulations and display results
public class Main {
    public static void main(String[] args) {

        // Create an instance of the Game class
        final Game game = new Game();

        // Set the number of plays
        final int numberOfPlays = 1000000;

        // Initialize arrays to store outcomes of each play for the respective games
        final int[] plays4 = new int[numberOfPlays];
        final int[] plays24 = new int[numberOfPlays];

        // Variables to count wins in each game
        int count4Win = 0, count24Win = 0;

        // Simulate the game of 4 rolls
        for (int i = 0; i < plays4.length; i++) {
            plays4[i] = game.rollDiceGameOf4();
            if (plays4[i] == 1) {
                count4Win++;
            }
        }

        // Simulate the game of 24 rolls
        for (int i = 0; i < plays24.length; i++) {
            plays24[i] = game.rollDiceGameOf24();
            if (plays24[i] == 1) {
                count24Win++;
            }
        }

        // Calculate counts of losses for both games
        int count24Loose = numberOfPlays - count24Win;
        int count4Loose = numberOfPlays - count4Win;

        // Calculate mean, variance, and standard deviation for the game of 4 rolls
        double meanGameOf4 = game.calculateMean(plays4);
        double variance4 = game.calculateVariance(plays4, meanGameOf4);
        double standardDeviation4 = game.calculateStandardDeviation(variance4);

        // Calculate mean, variance, and standard deviation for the game of 24 rolls
        double meanGameOf24 = game.calculateMean(plays24);
        double variance24 = game.calculateVariance(plays24, meanGameOf24);
        double standardDeviation24 = game.calculateStandardDeviation(variance24);

        // Display results
        System.out.println("Wins in Game of 4 Rolls: " + count4Win);
        System.out.println("Losses in Game of 4 Rolls: " + count4Loose);
        System.out.println("Mean Payout in Game of 4 Rolls: " + meanGameOf4);
        System.out.println("Variance of Payouts in Game of 4 Rolls: " + variance4);
        System.out.println("Standard Deviation of Payouts in Game of 4 Rolls: " + standardDeviation4);

        System.out.println("Wins in Game of 24 Rolls: " + count24Win);
        System.out.println("Losses in Game of 24 Rolls: " + count24Loose);
        System.out.println("Mean Payout in Game of 24 Rolls: " + meanGameOf24);
        System.out.println("Variance of Payouts in Game of 24 Rolls: " + variance24);
        System.out.println("Standard Deviation of Payouts in Game of 24 Rolls: " + standardDeviation24);
    }
}

