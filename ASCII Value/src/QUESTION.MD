# Java Program to Determine the ASCII Value of a Character

## Introduction

In this challenge, you will create a Java program to determine the ASCII value of a given character. ASCII (American Standard Code for Information Interchange) is a standard that assigns unique numerical values to characters, enabling computers to process and represent text. By completing this challenge, you will learn how to perform typecasting in Java to convert a char into its corresponding ASCII integer value. This task emphasizes understanding basic data type conversions and writing modular, reusable functions.

## Requirements

To complete this challenge, you must implement the following:

1. **Function Name**: ```findAsciiValue```

    - Accepts a single character as input.
    - Returns the ASCII integer value of the character using typecasting.

2. **Function Name**: ```getAsciiValue```

    - Calls the ```findAsciiValue``` function and returns the ASCII value of the input character.

## Input
The program should accept a single character as input. The input may include:

- Lowercase and uppercase alphabets (a to z, A to Z).
- Digits (0 to 9).
- Special characters (e.g., space, !, @, etc.).
- Extended ASCII characters (values 128–255).
- Edge cases like the null character (\0) and DEL character (127).

## Output
The program should return the ASCII integer value of the input character.

## Examples

```
// Example 1: Lowercase alphabet
Input: 'a'
Output: 97
 
// Example 2: Uppercase alphabet
Input: 'Z'
Output: 90
 
// Example 3: Digit
Input: '5'
Output: 53
 
// Example 4: Special character
Input: '@'
Output: 64
 
// Example 5: Space character
Input: ' '
Output: 32
 
// Example 6: Null character
Input: '\0'
Output: 0
 
// Example 7: Extended ASCII character
Input: (char) 128
Output: 128
```

## Constraints

- The input will always be a single character.
- The character can belong to the standard ASCII range (0–127) or extended ASCII range (128–255).
- The program should handle edge cases like the null character (\0) and DEL character (127).

## Expected Time Complexity

- Time Complexity: O(1).
- Typecasting a char to an int is a constant-time operation.

## Expected Auxiliary Space

- Space Complexity: O(1).
- The program uses a fixed amount of memory regardless of the input size.







