public class stockSell{
    public static void main(String args[]){
        int[] price = {4 , 5 , 1 , 3 , 11 , 58  , 6};
        int min = price[0];
        int maxprof = 0;
        for(int i = 1 ; i<price.length ; i++){
            int prof = price[i] - min;
            if(prof > maxprof){
                maxprof = prof;
            }
            if(price[i] < min){
               min = price[i];
            }
        }
        System.out.println(maxprof);
        System.out.println(min);
    }
}