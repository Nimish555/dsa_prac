import java.util.Scanner;

public class productExcept {
    static void main(String[] args) {
        int[] arr = {4 , 5 , 8 , 1 , 5};
        int n = arr.length;
        int[] ans  = new int[n];
        ans[0] = 1;
        for(int i = 1 ; i< n ; i++){
            ans[i] = ans[i-1] * arr[i-1];
        }
        int right = 1;
        for(int i = n-1 ; i>= 0 ; i--){
            ans[i] = ans[i] * right;
            right = right * arr[i];
        }
        for(int x : ans){
            System.out.println(x + " ");
        }
    }
}
