//print largest of two number

import java.util.*;
public class largestof2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first no");
        int a=sc.nextInt();
        System.out.print("Enter second no");
        int b=sc.nextInt();

        if(a>b){
            System.out.print("a is largest");
        }
        else{
            System.out.print("b is largest");
        }

        sc.close();

    }
}
