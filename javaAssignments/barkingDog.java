/*
William Orgertrice 
Practice java project
 */
package javaAssignments;
import java.util.*;
public class barkingDog {
    public static void main(String[] args) {
        Dog dog2=new Dog();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the dog that's barking");
        dog2.setname(sc.nextLine().trim());
        System.out.println("What is the height of the dog in cm?");
        dog2.setheight(sc.nextLine().trim());
        bark(dog2);
        guessheight(dog2);
    }
    private static void bark(Dog e){
        System.out.println(e.getname() + " says Woof Woof");
    }
    private static void guessheight(Dog e){
        System.out.println(e.getname() + " is " + e.getheight() + " cm");
    }
}
class Dog{
    String name;
    String height;
    public String getname(){
        return name;
    }
    public void setname(String e){
        name = e;
    }
    public String getheight(){
        return height;
    }
    public void setheight(String e){
        height = e;
    }
}
