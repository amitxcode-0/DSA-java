//print given number is even or odd

import java.util.*;
public class evenOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter no");
        int n=sc.nextInt();
        if(n%2==0){
            System .out.print("EVEN");
        }
        else{
            System.out.print("ODD");
        }

        sc.close();
    }
}