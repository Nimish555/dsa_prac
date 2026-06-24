public class countDigi {
    public static void main(String args[]){
        int n = 565698;
        int count =0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
    
}
