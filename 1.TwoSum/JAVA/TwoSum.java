import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2,5,5,11};
        int target = 10;
        
        for(int i = 0; i < array.length; i++) {
            int result = 0;
            for(int j = 1 + i; j < array.length; j++) {
                result = array[i] + array[j];
                if(result == target) {
                    System.out.println(result);
                    int[] resArray = {i,j};
                    System.err.println(Arrays.toString(resArray));
                    break;
                } 
                System.out.println("i value: " + i);
                System.out.println("j value: " + j);
                System.out.println(result);
            }
           if(result == target) break;
        }
    }
}