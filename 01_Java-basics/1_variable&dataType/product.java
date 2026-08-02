///product of two number

import java.util.*;
public class product{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter first no-");
    int a=sc.nextInt();

    System.out.print("Enter second no-");
    int b=sc.nextInt();

    int pdt=a*b;
    System.out.print("product is :-"+pdt);

    sc.close();
    }
}