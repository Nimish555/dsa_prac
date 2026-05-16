public class move0end {
    static void main(String[] args) {
        int[] arr = {1 , 5 , 0 , 2 , 0 , 0 ,5 ,0};
        movez(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }

    }
    static void movez(int []arr){
        int j = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]  = temp;
                j++;
            }
        }
    }

}
