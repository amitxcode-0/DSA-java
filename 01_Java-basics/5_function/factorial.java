//find factorial of number by using function/method 

import java.util.*;
public class factorial {
    
    static int fact(int n){
        int fact=1;
       for(int i=1;i<=n;i++){
        fact*=i;
       }
       return fact;
    }
    public static void main(String[] args) {
        System.out.println("enter no:-");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int x=fact(n);
        System.out.println(x);

    sc.close();
  }
}
    
