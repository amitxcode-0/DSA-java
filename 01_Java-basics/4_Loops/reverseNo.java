//print reverse of no=10899

public class reverseNo {
    public static void main(String[] args) {
        int n=10899;
        int rev=0;
        while (n!=0) {
            int Lastdigit=n%10;
            rev=rev*10+Lastdigit;
            n=n/10;
        }
        System.out.println(rev);
    }
}
