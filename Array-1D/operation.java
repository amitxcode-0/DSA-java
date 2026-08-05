//perform operation using array(create,input,output,update)

import java.util.*;
public class operation {
    public static void main(String[] args) {
        int marks[]=new int[10];
        Scanner sc=new Scanner(System.in);

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("physics " +marks[0]);
        System.out.println("chemistry " +marks[1]);
        System.out.println("math " +marks[2]);

        marks[2]=100;
        System.out.println("math"+marks[2]);

        sc.close();
    }
}