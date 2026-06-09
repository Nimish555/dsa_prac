public class Duplicate {
    static void main(String[] args) {
        int[] arr = {5,6,5,5,8,9,9,3,66};
        int i = 0;
        for(int j=1 ; j<arr.length ; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("unique element");
        for(int k=0 ; k<=i ; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
