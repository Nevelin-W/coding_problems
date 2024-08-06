public class Steps {
    public static void main(String[] args) {
        int num = 0;
        if(num == 0) {
            System.out.println(0);
        } else
        for(int i = 1; num >= 0; i++) {
            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num = num -1;
            } 
            if(num == 0){
                System.out.println(i);
                break;
              
            }
        }
    }
}
