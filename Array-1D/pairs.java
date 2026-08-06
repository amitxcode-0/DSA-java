//pairs in an array
public class pairs {
    public static void reverseArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+count +")," +"("+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        reverseArr(arr);
    }
}
