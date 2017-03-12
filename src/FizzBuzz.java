/**
 * Created by Gavin on 3/10/17.
 */
public class FizzBuzz {
    public void doIt(int start, int end) {
        String fizz = "fizz";
        String buzz = "buzz";
        int i;
        for (i= start; i <= end; i++){
            if ((i % 3) == 0 && (i % 5 == 0)){
                System.out.println(fizz+buzz);
                continue;
            }
            else if (i % 3 == 0){
                System.out.println(fizz);
            }
            else if (i % 5 ==0){
                System.out.println(buzz);
            }
            else
                System.out.println(i);
        }
    }
}