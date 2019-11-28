package recursion;

public class AddNumbers {

    private static Integer count = 0;

    public static void main(String[] args) {
        //System.out.println(addNumbersTailRecursive(100000,100,0));
        System.out.println(addNumbers(100000,100));
        System.out.println(count);
    }

    private static int addNumbers(int a, int b) {
        if (a==0) return b;
        if (b==0) return a;
        return addNumbers(a-1,b-1)+2;
    }

    /*tail recursive program */
    private static int addNumbersTailRecursive(int a, int b,int res) {
        count++;
        if (a==0) return res+b;
        else if (b==0) return res+a;
        else return addNumbersTailRecursive(a-1,b-1,res+2);
    }



}
