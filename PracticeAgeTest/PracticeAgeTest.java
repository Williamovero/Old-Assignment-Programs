/*
William Orgertrice 
Practice java project
 */
package practice.java.files.PracticeAgeTest;

import java.util.*;
public class PracticeAgeTest {
    public static void main(String args[]){
        String Drive;
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = sc.nextInt();
        if(age<15){
       Drive = "You aren't old enough to drive!";
            System.out.println(Drive);
        }
        else{
        Drive = "You are old enough to drive!";
            System.out.println(Drive); 
        }
    } 
}