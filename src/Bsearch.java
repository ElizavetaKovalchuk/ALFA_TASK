public class Bsearch {
    public static int bsearch (int[] arr, int x ){

        int index = 0;

        for(int i = 0 ; i < arr.length; i ++){
            if(arr[i] < x){
                index = i;
                break;
            } else {
                continue;
            }
        }

        return index;
    }
}
