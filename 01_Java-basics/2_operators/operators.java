//using of operators

public class operators{
    public static void main(String arg[]){

     int a=7;
     int b=9;

     //arithematic operators
     System.out.println(a+b); 
     System.out.println(a-b); 
     System.out.println(a*b); 
     System.out.println(a/b); 
     System.out.println(a%b);
     

     //relational operators
     System.out.println(a>b);
     System.out.println(a<b);
     System.out.println(a>=b);
     System.out.println(a<=b);
     System.out.println(a==b);

     //logical operators
     System.out.println(a>b && a==b);
     System.out.println(a<b || a==b);
     System.out.println(!(a==b));
     
     //assignment operators
     int d=10;
        d+=10;
     System.out.print(d);

    }
}