//binarysearch
public class binarySearch {
    public static int binarySear(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            //comparision
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    }
   public static void main(String[] args) {
    int arr[]={2,4,6,8,10,12,14};
    int key=12;

    int indx=binarySear(arr, key);
    if(indx==-1){
        System.out.println("key not found");
    }
    else{
          System.out.println("key found at :"+indx);
    }
   }
}