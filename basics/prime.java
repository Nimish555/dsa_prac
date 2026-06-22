public class prime {
    public static void main(String args[]){
        int n = 55;
        if(n<1){
            System.out.println("not prime");
            return;
        }
        boolean isprm = true;
        for(int i = 2 ; i<n ; i++){
            if(n%i == 0){
            isprm = false;
            break;
            }
        }
        if(isprm){
            System.out.println("prime");
        }else{
            System.out.println("false");
        }
    }
}
