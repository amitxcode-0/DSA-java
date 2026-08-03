/*print char pattern
         A
         A B
         A B C
         A B C D
*/
public class CharPattern {
    public static void main(String[] args) {
        char Ch='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(Ch);
                Ch++;
            }
            System.out.println();
        }
    }
}
