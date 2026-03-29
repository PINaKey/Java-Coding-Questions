# Java Program to Calculate Quotient and Remainder

## Introduction

In this challenge, you will create a Java program that computes the quotient and remainder when dividing two integers. This task focuses on understanding basic arithmetic operations in Java, handling edge cases like division by zero, and implementing modular functions to achieve the desired functionality. By completing this challenge, you will learn how to perform integer division and modulus operations, validate inputs, and write reusable functions. Additionally, you will practice writing unit tests to ensure your program behaves as expected under various scenarios.

## Requirements

To complete this challenge, you must implement the following:

1. **Function Name**: ```computeQuotient```

- Computes the quotient of two integers (dividend and divisor). 
- Throws an ```ArithmeticException``` if the divisor is zero.

2. **Function Name**: ```computeRemainder```
- Computes the remainder of two integers (dividend and divisor).
- Throws an ```ArithmeticException``` if the divisor is zero.

3. **Function Name**: ```getQuotientAndRemainder```
- Calls the ```computeQuotient``` and ```computeRemainder``` functions.
- Returns both the quotient and remainder as an array [quotient, remainder].

## Input

The program accepts two integers as input:

- **Dividend**: The number to be divided.
- **Divisor**: The number by which the dividend is divided.

## Output

The program returns an array containing two integers:

- **Quotient**: The result of integer division ```(dividend / divisor)```.
- **Remainder**: The result of the modulus operation ```(dividend % divisor)```.

If the divisor is zero, the program throws an ```ArithmeticException``` with the message: "Division by zero is not allowed."

## Examples

// Example 1: Positive dividend and divisor
Input: dividend = 10, divisor = 3
Output: [3, 1]

// Example 2: Negative dividend
Input: dividend = -10, divisor = 3
Output: [-3, -1]

// Example 3: Negative divisor
Input: dividend = 10, divisor = -3
Output: [-3, 1]

// Example 4: Both negative
Input: dividend = -10, divisor = -3
Output: [3, -1]

// Example 5: Zero dividend
Input: dividend = 0, divisor = 5
Output: [0, 0]

// Example 6: Division by one
Input: dividend = 7, divisor = 1
Output: [7, 0]

// Example 7: Exact division
Input: dividend = 12, divisor = 4
Output: [3, 0]

// Example 8: Division by zero
Input: dividend = 10, divisor = 0
Output: ArithmeticException("Division by zero is not allowed.")

## Constraints

- The dividend and divisor can be any integer (positive, negative, or zero).

- Division by zero is not allowed and should throw an ```ArithmeticException```.

- The program should handle all edge cases, including negative numbers and zero.

## Expected Time Complexity

- **Time Complexity**: O(1) per operation. 
    - Each arithmetic operation (division and modulus) is performed in constant time.

## Expected Auxiliary Space

- **Space Complexity**: O(1). 
    - The program uses a fixed amount of memory regardless of the input size.

## Hint

Use the ```/``` operator to compute the quotient and the ```%``` operator to compute the remainder. Handle division by zero explicitly by throwing an ```ArithmeticException```. Modularize your code by separating the logic for computing the quotient and remainder into their own functions.

