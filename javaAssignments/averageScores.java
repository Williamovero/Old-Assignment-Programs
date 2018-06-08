package javaAssignments;
// Computes the average of a series of scores

import java.util.*;

public class averageScores {
  public static void main(String[] args) {
    // Prompt user to enter number of scores
      System.out.println("Enter the number of scores: ");
      Scanner sc = new Scanner(System.in);
      String userInput = sc.nextLine().trim();
    int numberOfScores = Integer.parseInt(userInput);
    System.out.println();

    // Create array to hold scores
    int[] scores = new int[numberOfScores];

    // Prompt user to enter scores and store them in an array
    int i;
    for (i=0;i<scores.length;i++){
        System.out.println("Enter score #" + (i + 1) + ": ");
      userInput = sc.nextLine().trim();
      scores[i] = Integer.parseInt(userInput);
    }

    // Compute sum of scores
    int sum = 0;
    i = 0;
    while (i < scores.length) {
      sum += scores[i];
      i++;
    }

    // Display average score
    System.out.println("\nAverage score: " + sum / scores.length);
  }
}
