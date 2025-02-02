package LeetCodeArrays;

import java.util.Scanner;

public class SpecialArray3151 {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 != nums[i + 1] % 2) {
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        SpecialArray3151 specialArray = new SpecialArray3151();
        boolean result = specialArray.isArraySpecial(nums);
        System.out.println("Is the array special? " + result);
        
        scanner.close();
    }
}