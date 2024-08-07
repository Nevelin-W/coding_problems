public class Palindrome {
    public static void main(String[] args) {
        int x = 121;
        String xs = String.valueOf(x);
        StringBuilder xr = new StringBuilder(String.valueOf(x));
        String sxr = String.valueOf(xr.reverse().toString());
        System.out.println(xs);
        System.out.println(sxr);
        System.out.println(xs.equals(sxr));
        
    
       
    }
}
