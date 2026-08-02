//keep enternig nu till user enter a multiple of 10

import java.util.*;
public class multipleOf10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter multiple of 10");
        int n=sc.nextInt();
        while (n%10==0) {
            System.out.println("Enter no");
            n=sc.nextInt();
        }
        System.out.println("you entered no not multiple of 10");
         sc.close();
    }
}
