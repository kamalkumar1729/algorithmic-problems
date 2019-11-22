package recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(findPower(2,5));
    }


    private static long findPower(long n, long p) {
        if (p==0) return 1;
        else return n*findPower(n,p-1);
    }

}
