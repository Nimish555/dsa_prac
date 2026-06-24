import java.util.Scanner;

public class maxProdSubarray {
   public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int maxPro = Integer.MIN_VALUE;
        for(int i = 0 ; i< n ; i++){
           int product = 1;
           for(int j=i ; j<n ; j++){
               product *= arr[j];
               maxPro = Math.max(maxPro , product);
           }
        }
       System.out.println(maxPro);
    }
}
