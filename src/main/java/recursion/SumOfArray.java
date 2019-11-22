package recursion;

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println(findSum(new long[]{1,2,3,4,5,6},5,0));
    }
    
    private static long findSum(long[] arr,int index,long sum){
        if (index < 0) return sum;
        else return findSum(arr,index-1,sum+arr[index]);
    }
}
