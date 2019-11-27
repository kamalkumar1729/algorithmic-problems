package recursion;

public class PrintNums {
    /* print N numbers without using iteration*/
    public static void main(String[] args) {
        print(100);
    }

    private static void print(int num) {
        if (num > 0) print(num-1);
        System.out.println(num);
    }
}
