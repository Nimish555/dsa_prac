import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0 ; i<n1 ; i++){
            arr1 [i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0 ; i<n2 ; i++){
            arr2 [i] = sc.nextInt();
        }

        int[] ans = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
              ans[k++] = arr1[i++];

            }else{
                ans[k++] = arr2[j++];
            }
        }
         while(i<n1){
             ans[k++] = arr1[i++];
         }
         while(j<n2){
             ans[k++] = arr2[j++];
         }
        System.out.println(Arrays.toString(ans));

    }
}
