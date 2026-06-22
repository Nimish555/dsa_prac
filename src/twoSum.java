public class twoSum {
    static void main(String[] args) {
        int[] arr = {4 , 5 , 6 ,8 ,9 , 7 , 12 ,3};
        int targ = 16;
        for(int i = 0 ; i< arr.length-1 ; i++){
            for(int j = i+1 ; j< arr.length  ; j++ ){
                if(arr[i] + arr[j] == targ){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + targ);
                    break;
                }
            }
        }
    }
}
