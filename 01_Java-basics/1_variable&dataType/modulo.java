//modulous of two number

import java.util.*;
public class modulo {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);

      System.out.print("enter first no");
      float a=sc.nextFloat();
      System.out.print("enter second no");
      float b=sc.nextFloat();

      float mod=a/b;
      System.out.print(mod);

      sc.close();
    }
}