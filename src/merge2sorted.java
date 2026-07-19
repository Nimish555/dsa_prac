public class merge2sorted {
    public static void main(String[] args) {
        int[] A = {1,2,3,0,0,0};
        int[] B = {2,5,6};

        int m = 3;
        int n = 3;

        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(A[i]>= B[j]){
                A[k] = A[i];
                i--;
                k--;
            }else{
                A[k] = B[j];
                j--;
                k--;
            }

        }
        while(j>=0){
            A[k--] = B[j--];
        }
         for(int p = 0 ; p<A.length - 1 ; p++){
             System.out.print(A[p]  + " ");
         }

    }
}
