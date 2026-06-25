public class TrapWater {
    static void main(String[] args) {
        int[] arr ={0,1,0,2,1,0,1,3,2,1,2,1};
        int totalWater = 0;
        for(int i = 0 ; i<arr.length ; i++){
            int leftmax = arr[i];
            for(int j=0 ; j<=i ; j++){
                leftmax = Math.max(leftmax , arr[j]);
            }
            int rightmax = arr[i];
            for(int j = arr.length - 1 ; j>= i ; j--){
                rightmax = Math.max(rightmax , arr[j]);
            }
            int water = Math.min(leftmax , rightmax) - arr[i];
            if(water > 0){
                totalWater += water;
            }
        }
        System.out.println(totalWater);
    }
}
