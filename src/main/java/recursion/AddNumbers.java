package recursion;

public class AddNumbers {
    public static void main(String[] args) {
        System.out.println(addNumbers(5,-7));
    }

    private static int addNumbers(int a, int b) {
        if (a==0) return b;
        if (b==0) return a;
        return addNumbers(a-1,b-1)+2;
    }

}
