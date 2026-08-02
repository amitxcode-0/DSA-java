//calculate student pass or fail by using their marks

import java.util.*;
public class passFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your marks");
        float mark=sc.nextFloat();

       String mar=(mark>33)?"pass":"fail";
       System.out.println(mar);
      
       sc.close();
    }
}
