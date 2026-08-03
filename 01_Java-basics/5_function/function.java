//using function type
public class function {

    //NO parameter+ NO return
    static void hello(){
        System.out.println("hello bro");
    }

    //Parameter + NO return
    static void name(String name){
        System.out.println("hello " +name);
    }

    //NO parameter +Return
    static int getNumber(){
        return 10;
    }

    //Parameter + return
    static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {

    hello();

    name("amiy");
        
    int x=getNumber();
    System.out.println(x);

   int y= sum(2, 6);
   System.out.println(y);
    }
}
