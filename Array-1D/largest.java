//find largest element in given array

public class largest {

    public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={4,2,6,7,0,1};

        int indx=getLargest(arr);
        System.out.println(indx);
    }
}
