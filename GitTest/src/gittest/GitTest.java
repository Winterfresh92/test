
package gittest;

import java.util.Scanner;

public class GitTest {

    private static final double PI = 3.14;
    
    public static void main(String[] args) {
        System.out.println("Hi! This is a test on how to use Git with Netbeans."
                + "\nMaybe I should watch a video or something...");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a radius for the circle.");
        double radius = scan.nextDouble();
        double area = PI * radius * radius;
        
        System.out.println("The area of a cirle of radius " + radius + " is "
                + area);
    }
    
}
