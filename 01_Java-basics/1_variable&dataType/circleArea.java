//find area of circle radius is given by user
import java.util.*;
public class circleArea {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);

      System.out.print("enter radius ");
      float radius=sc.nextFloat();

      float area=radius*radius*3.14f;
      System.out.print(area);
      

      sc.close();
    }
}
