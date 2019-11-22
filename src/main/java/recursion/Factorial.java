package recursion;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(fac(15L, 1L));
    }
    private static Long fac(long N, long result) {
        if ( N==1 )
            return result;
        else
            return fac(N-1,N*result);
    }
}
