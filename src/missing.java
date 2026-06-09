public class missing {
    static void main(String[] args) {
        int[] arr = { 1,2,4,5,6};
        int n= arr.length + 1;
        int actSum = 0;
        int expSum = n*(n+1)/2;
        for(int num: arr){
            actSum = actSum  + num;
        }
        int miss = expSum - actSum;
        System.out.println(miss);
    }
}
