public class kadanes {
    public static void main(String args[]){
        int[] nums = {1 , -5 , 4 , 5 , 8 , -7};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length ; i++){
            currSum += nums[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0 ){
                currSum = 0 ;
            } 
        }
        System.out.println(maxSum);
    }
}
