# Java Program to Swap Two Numbers Without Using a Temporary Variable

## Introduction

In this challenge, you will create a Java program to swap two numbers without using a temporary variable. Swapping is a fundamental operation in programming and is often used in algorithms like sorting, data manipulation, and memory optimization. This task focuses on understanding how to manipulate variables using arithmetic operations or bitwise XOR to achieve the desired result. By completing this challenge, you will learn how to implement efficient swapping techniques and write reusable functions for practical use cases.

## Requirements

To complete this challenge, you must implement the following:

1. **Function Name**: ```swapUsingArithmetic```
- Swaps two integers using arithmetic operations (addition and subtraction).
- Returns an array containing the swapped values.

2. **Function Name**: ```swapUsingXOR```
- Swaps two integers using bitwise XOR operations.
- Returns an array containing the swapped values.

## Input

- Two integers (a and b) to be swapped.
- The integers can be positive, negative, or zero.

## Output

- An array containing the two integers in swapped order.

## Examples

// Example 1: Positive integers
Input: a = 5, b = 10
Output: [10, 5]

// Example 2: Negative integers
Input: a = -5, b = -10
Output: [-10, -5]

// Example 3: Mixed integers
Input: a = -5, b = 10
Output: [10, -5]

// Example 4: One number is zero
Input: a = 0, b = 10
Output: [10, 0]

// Example 5: Large integers
Input: a = 1000000, b = 2000000
Output: [2000000, 1000000]

## Constraints

- The input integers can range from ```-2^31``` to ```2^31 - 1``` (standard integer range in Java).
- The program should handle edge cases such as zero, negative numbers, and large integers.
- Avoid using a temporary variable for swapping.

## Expected Time Complexity

- **Time Complexity**: O(1) for both methods (```swapUsingArithmetic``` and ```swapUsingXOR```).

- Each method performs a fixed number of operations regardless of the input size.

## Expected Auxiliary Space

- **Space Complexity**: O(1). 
    - Both methods use a constant amount of extra space for storing intermediate results.

## Hint

For ```swapUsingArithmetic```, use addition and subtraction to manipulate the values of a and b. Be cautious of potential integer overflow when adding large numbers.

For ```swapUsingXOR```, leverage the properties of bitwise XOR to swap values without modifying their original bits. This method avoids overflow risks entirely.