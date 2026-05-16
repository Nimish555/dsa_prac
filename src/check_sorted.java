public class check_sorted {
    static void main(String[] args) {
        int[] arr = {4 , 5 , 8 , 1 , 5};
        boolean sort = true;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] > arr[i+1]){
                sort = false;
                break;
            }
        }
        if(sort){
            System.out.println("sorted");
        }else{
            System.out.println("unsorted");
        }
    }
}
