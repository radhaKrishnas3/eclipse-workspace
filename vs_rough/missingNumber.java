
import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        missingNumber mn = new missingNumber();
        int[] arr = {0};
        System.out.println(mn.findMissing(arr));

    }

    public int findMissing(int[] arr){
        Arrays.sort(arr);;
        int i=0, startIndex=0;
        while(i<arr.length){
            if(startIndex != arr[i]){
                return startIndex;
            }
            i++;
            startIndex++;
        }
        return startIndex;
    }
}
