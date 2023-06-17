public class LargestNumber {
    public static int largest_number(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(largest < arr[i]){
                largest= arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {13,2,9,5,8};
        System.out.println("largest is "+largest_number(arr));
    }
}
