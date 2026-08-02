//print number from 1 to n

import java.util.*;
public class printN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter n");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}
