import java.util.Scanner;

public class secMin {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int fMin = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for(int i = 0 ; i< n ; i++){
            if(arr[i] < fMin){
                sec = fMin;
                fMin = arr[i];
            }
            else if(arr[i] < sec && arr[i] != fMin){
                sec = arr[i];
            }
        }
        System.out.println(sec);
    }
}
