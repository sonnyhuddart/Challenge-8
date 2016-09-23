package challenge.pkg8;

import java.util.Scanner;

public class Challenge8 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = myScanner.nextInt();
        System.out.println("Enter a second number");
        int num2 = myScanner.nextInt();
        System.out.println("Would you like to add, substract, multiply or divide the numbers");
        String option = myScanner.next();
                
        if (option.contains("add")) {
            System.out.println("Your answer is " + (num1+num2));
        }else if (option.contains("subtract")) {
            System.out.println("Your answer is " + (num1-num2));
        }else if (option.contains("divide")) {
            System.out.println("Your answer is " + (num1/num2));
        }else if (option.contains("multiply")) {
            System.out.println("Your answer is " + (num1*num2));    
        }
        
      
    }
    
}
