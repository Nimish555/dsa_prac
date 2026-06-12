import java.util.Scanner;

public class Binary {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        int str = 0;
        int end = n-1;
        boolean found = false;
        while(str <= end){
            int mid = (str + end) / 2;
            if(arr[mid] > tar){
                end = mid - 1;
            }else if(arr[mid] == tar){
                found = true;
                break;
            }else {
                str = mid + 1;
            }
        }
        if(found){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}
