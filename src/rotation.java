
public class rotation {
    public static void main(String[] args) {
        int[] arr = {5 , 6 , 9 , 23 , 8 , 75 , 65 };
        int k = 3;
        int n = arr.length;
        k = k%n;
        reverse(arr , 0 , n-1);  //whole arr reverse
        reverse(arr , 0 , k-  1 );        //first part
        reverse(arr, k , n-1);
    }
    static void reverse(int[] arr ,int  start ,int  end){
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
