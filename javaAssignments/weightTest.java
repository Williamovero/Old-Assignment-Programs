/*
William Orgertrice 
Practice java project
Planet Weight Comparisons to Earth
1.Venus 0.78
2.Mars 0.39
3.Jupiter 2.65
4.Saturn 1.17
5.Uranus 1.05
6.Neptune 1.23
 */
package javaAssignments;

import java.util.*;

public class weightTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much do you weigh?");
        double weight = sc.nextDouble();
        System.out.println("You weigh "+weight+"ibs on Earth\n"
                + "What planet do you want to visit?\n"
                + "1.Venus\n"
                + "2.Mars\n"
                + "3.Jupiter\n"
                + "4.Saturn\n"
                + "5.Uranus\n"
                + "6.Neptune");
        String planet = sc.next().toLowerCase().trim();
        switch(planet){
            case "venus": weight=weight *0.78;
            break;
            case "mars": weight=weight *0.39;
            break;
            case "jupiter": weight=weight *2.65;
            break;
            case "saturn": weight=weight *1.17;
            break;
            case "uranus": weight=weight *1.05;
            break;
            case "neptune": weight=weight *1.23;
            break;
            default: System.out.println("Please enter a planet on the list of planets");
                return;
        }
        System.out.println("Your weight on "+ planet + " would be " +weight+ "ib");
    }
}
