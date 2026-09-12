//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Simon Ingram
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    // Create an array with values {5, 9, 3, 12, 7, 3, 11, 5}
    int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};
    
    // Output the array in order using a while loop.
    System.out.println("\nArray in order (while loop):");
    int i = 0;
    while (i < numbers.length) {
      System.out.print(numbers[i] + " ");
      i++;
    }
    
    // Output the array in reverse using a for loop
    System.out.println("\nArray in reverse (for loop):");
    for (int j = numbers.length - 1; j >= 0; j--) {
      System.out.print(numbers[j] + " ");
    }
    System.out.println();

    // Output the first and last values of the array
    System.out.println("\nFirst value: " + numbers[0]);
    System.out.println("Last value: " + numbers[numbers.length - 1]);

     // Call the methods created in Lab1
    System.out.println("\nTesting Lab1 methods:");
    System.out.println("Max of 10 and 20: " + lab.max(10, 20));
    System.out.println("Min of 10 and 20: " + lab.min(10, 20));
    System.out.println("Sum of array: " + lab.sum(numbers));
    System.out.println("Average of array: " + lab.average(numbers));
    System.out.println("Max value in array: " + lab.max(numbers));
    System.out.println("Min value in array: " + lab.min(numbers)); 
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  // max(int a, int b): Use an if-statement to return the maximum value.
  public int max(int a, int b) {
    if (a > b) {
      return a;
    }
    return b;
  }

  // min(int a, int b): Use an if-statement to return the minimum value.
  public int min(int a, int b) {
    if (a < b) {
      return a;
    }
    return b;
  }

  // sum(int[] nums): Return the sum of all values in the array.
  public int sum(int[] nums) {
    int total = 0;
    for (int i = 0; i < nums.length; i++) {
      total += nums[i];
    }
    return total;
  }

  // average(int[] nums): Use a foreach loop to return the average.
  public double average(int[] nums) {
    if (nums.length == 0) return 0;
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return (double) total / nums.length;
  }

  // max(int[] nums): Use a for loop to return the maximum value.
  public int max(int[] nums) {
    int maximum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > maximum) {
        maximum = nums[i];
      }
    }
    return maximum;
  }

  // min(int[] nums): Use a for loop to return the minimum value.
  public int min(int[] nums) {
    int minimum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < minimum) {
        minimum = nums[i];
      }
    }
    return minimum;
  }
}