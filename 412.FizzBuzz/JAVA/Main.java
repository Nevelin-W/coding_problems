import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int n = 15;
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList());  
        for(int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 ) {
                arrayList.add("FizzBuzz");
            } else if(i % 5 == 0) {
                arrayList.add("Buzz");
            } else if(i % 3 == 0) {
                arrayList.add("Fizz");
            } else {
                arrayList.add(Integer.toString(i));
            }
        }
        System.out.println(arrayList);
    }
}
