//linear search

public class linearSearch {
   public static int binarySear(int arr[],int key){
      for(int i=0;i<arr.length;i++){
         if(arr[i]==key){
            return i;
         }
      }
      return -1;
   }
   public static void main(String[] args) {
    int arr[]={2,4,6,8,10,12,14};
    int key=10;

    int indx=binarySear(arr, key);
    if(indx==-1){
      System.out.println("key not found");
    }
    else{
      System.out.println("key found at:"+indx);
    }
   }    
}
