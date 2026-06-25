//public class threeSum {
//    static void main(String[] args) {
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        for(int i = 0 ; i< nums.length - 2 ; i++){
//            for(int j = i + 1 ; j< nums.length - 1 ; j++){
//                for(int k = j + 1 ; k< nums.length  ; k++){
//                    if(nums[i] + nums[j] + nums[k] == 0){
//                        System.out.println(
//                                nums[i]+" "+nums[j] + " "+nums[k]
//                        );
//
//                    }
//                }
//
//            }
//
//        }
//
//    }
//}

import java.util.Arrays;

public class threeSum {
    static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length -2 ; i++){
           int left = i + 1;
           int right = nums.length - 1  ;
           while(left<right){
               int sum = nums[i] + nums[left] + nums[right];
               if(sum == 0){
                   System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
                   right--;
                   left++;

               }
               else if(sum>0){
                   right--;
               }
               else{
                   left++;
               }
           }

        }
    }
}
