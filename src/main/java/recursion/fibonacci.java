package recursion;

public class fibonacci {
    private static Long count = 0L;
    public static void main(String[] args) {
        System.out.println(new fibonacci().fib(30L));
        System.out.println(count);
    }
    private static Long fib(Long N) {
        count ++;
        if (N == 0L || N == 1L)
            return 1L;
        else
            return fib(N - 1L) + fib(N - 2L);
    }
}
