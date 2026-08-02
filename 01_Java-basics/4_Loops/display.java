//display all number entered by user except multiple of 10

import java.util.*;
public class display {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter no not multiple of 10");
      int n=sc.nextInt();
      while (n%10!=0) {
        System.out.println("Enter no");
         n=sc.nextInt();
      }
      System.out.println("you entered no multiple of 10");
      sc.close();
    }
}
