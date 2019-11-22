package recursion;

import java.util.Date;

public class SumOfNatural {
    public static void main(String[] args) {
        System.out.println(new Date().toString());
        System.out.println(sum(10000L));
        System.out.println(new Date().toString());
    }
    private static Long sum(Long num) {
        if (num == 1) return 1L;
        return sum(num - 1L) + num;
    }
}
