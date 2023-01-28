import java.util.Scanner;

public class TwoSum {

    public static int[] findSum(int[] array, int n){
        for(int i=0; i<array.length; i++){
            for(int j= i + 1; j<array.length;j++){
                if(n == array[i]+array[j]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arr = input.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[arr];
        for(int i=0;i<arr;i++){
            array[i] = input.nextInt();
        }
        System.out.print("Enter target: ");
        int n = input.nextInt();

        int[] nums = findSum(array,n);
        if(nums.length == 2){
            System.out.println(nums[0] + " " + nums[1]);
        }
        else {
            System.out.println("No solution");
        }

    }
}