//maxSubarray sum(brute force)
public class maxSubarray1 {
    public static void maxSubarray(int arr[]){
        int currsum=0;
        int maxNu=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=arr[k];
                }
                System.out.println(currsum);
                if(maxNu<currsum){
                    maxNu=currsum;
                }
            }
        }
        System.out.println("max sum="+maxNu);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxSubarray(arr);
    }
}
