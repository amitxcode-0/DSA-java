//income tax calculator

import java.util.*;
public class taxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your income");
        int income=sc.nextInt();

        float tax;
        if(income<=500000){
            tax=0;
        }
        else if(income>500000 && income<1000000){
           tax=income*.05f;
        }
        else{
            tax=income*.1f;
        }
       System.out.println(tax);
       sc.close();
    }
}
