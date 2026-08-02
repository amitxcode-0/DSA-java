//mini calculator

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first no:");
        int a=sc.nextInt();
        System.out.println("Enter second no:");
        int b=sc.nextInt();
        System.out.println("Enter operator");
        String op=sc.next();

        switch (op) {
    case "+": 
        System.out.println("Result: " + (a + b));
        break;
    case "-": 
        System.out.println("Result: " + (a - b));
        break;
    case "*": 
        System.out.println("Result: " + (a * b));
        break;
    case "/": 
        System.out.println("Result: " + (a / b));
        break;
    default: 
        System.out.println("Invalid operator!");
        break;
    }

    sc.close();
    }
}
