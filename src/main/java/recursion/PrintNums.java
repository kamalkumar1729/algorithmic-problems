package recursion;

public class PrintNums {
    /* print N numbers without using iteration*/
    public static void main(String[] args) {
        print(1,100);
    }

    private static void print(int n, int limit) {
        if (n==limit) return;
        else {
            System.out.println(n);
            print(n+1,limit);
        }
    }
}
