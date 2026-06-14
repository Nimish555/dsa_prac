public class leader {
    public static void main(String args[]){
        int[] arr= {16 ,17, 4, 3 ,5, 2};
        int n =arr.length;
        int maxRight = arr[n-1];
        System.out.println(maxRight+" ");
        for(int i = arr.length -2 ; i>=0 ; i--){
            if(arr[i]>maxRight){
                System.out.println(arr[i]+" ");
                maxRight = arr[i];
            }
        }
    }
    
}
