//check given no i sprime or not

import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no");
        int n=sc.nextInt();

        boolean isPrime=true;

        if(n<=1){
           isPrime=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
        }
        if(isPrime){
            System.out.print("given no is prime");
        }
        else{
            System.out.println("gien no is not prime");
        }
        sc.close();
    }
}
