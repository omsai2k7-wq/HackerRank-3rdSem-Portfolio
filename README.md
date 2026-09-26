# HackerRank 3rd Sem Portfolio

This repository contains my 3rd Semester B.Tech CSE HackerRank Algorithmic Problem-Solving Portfolio, implemented using Java 8.

The portfolio demonstrates my ability to solve algorithmic problems, analyse time and space complexity, implement efficient solutions, and maintain a structured programming portfolio using GitHub.

## Important Links

GitHub Repository:
https://github.com/omsai2k7-wq/HackerRank-3rdSem-Portfolio

HackerRank Profile:
https://www.hackerrank.com/profile/omsai2k7

## Technology Used

Programming Language: Java 8

Platform: HackerRank

Repository Platform: GitHub

## Repository Structure

HackerRank-3rdSem-Portfolio/
│
├── Diagonal-Difference/
│   └── Solution.java
│
├── Dynamic-Array/
│   └── Solution.java
│
├── Time-Conversion/
│   └── Solution.java
│
├── Compare-the-Triplets/
│   └── Solution.java
│
├── Sparse-Arrays/
│   └── Solution.java
│
├── HR1.png
├── HR2.png
├── HR3.png
├── HR4.png
├── HR5.png
├── HR6.png
├── HR7.png
├── HR8.png
├── HR9.png
├── HR10.png
├── HR11.png
├── HR12.png
├── HR13.png
├── HR14.png
├── HR15.png
├── HR16.png
├── HR17.png
├── HR18.png
├── HR19.png
│
├── 3-Star-Badge.png
└── README.md


# Mandatory HackerRank Problems

The following five problems were completed as part of the required coursework.


## 1. Diagonal Difference

The problem requires calculating the absolute difference between the sums of the two diagonals of a square matrix.

Implementation: Java 8

Approach:
The matrix is traversed once while simultaneously calculating the primary diagonal sum and secondary diagonal sum. The absolute difference between the two sums is then returned.

Time Complexity: O(N)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/diagonal-difference/problem


## 2. Dynamic Array

The problem involves maintaining multiple sequences and processing queries to determine which sequence should be accessed and modified.

Implementation: Java 8

Approach:
The required sequence is determined using the query parameters. Elements are added to the selected sequence, and type-2 queries retrieve the required element while updating the answer variable.

Time Complexity: O(N + Q)

Space Complexity: O(N)

HackerRank:
https://www.hackerrank.com/challenges/dynamic-array/problem


## 3. Time Conversion

The problem converts a given time from the 12-hour AM/PM format into the 24-hour format.

Implementation: Java 8

Approach:
The hour, minute, second, and AM/PM components are identified from the input string. The hour is adjusted according to the AM or PM designation and the final time is constructed in 24-hour format.

Time Complexity: O(1)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/time-conversion/problem


## 4. Compare the Triplets

The problem compares the scores of Alice and Bob across three categories and calculates the points obtained by each participant.

Implementation: Java 8

Approach:
Each of the three corresponding scores is compared. A point is awarded to the participant with the higher score, while equal scores do not contribute a point.

Time Complexity: O(1)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/compare-the-triplets/problem


## 5. Sparse Arrays

The problem determines how many times each query string occurs in a collection of input strings.

Implementation: Java 8

Approach:
The input strings are stored and their frequencies are counted. Each query is then matched against the stored strings to determine its occurrence count.

Time Complexity: O(N + Q)

Space Complexity: O(N)

HackerRank:
https://www.hackerrank.com/challenges/sparse-arrays/problem


# Complexity Summary

| Problem | Time Complexity | Space Complexity |
|---|---|---|
| Diagonal Difference | O(N) | O(1) |
| Dynamic Array | O(N + Q) | O(N) |
| Time Conversion | O(1) | O(1) |
| Compare the Triplets | O(1) | O(1) |
| Sparse Arrays | O(N + Q) | O(N) |


# Accepted Submission Screenshots

The following screenshots document the accepted HackerRank submissions for the five mandatory problems.

## HR1 - Diagonal Difference

![Diagonal Difference](HR1.png)

## HR2 - Dynamic Array

![Dynamic Array](HR2.png)

## HR3 - Time Conversion

![Time Conversion](HR3.png)

## HR4 - Compare the Triplets

![Compare the Triplets](HR4.png)

## HR5 - Sparse Arrays

![Sparse Arrays](HR5.png)


# HackerRank 3-Star Achievement

I achieved the required 3-Star Problem Solving badge on HackerRank.

![HackerRank 3-Star Badge](3-Star-Badge.png)

HackerRank Profile:
https://www.hackerrank.com/profile/omsai2k7


# Additional HackerRank Practice

In addition to the five mandatory problems, I completed several additional HackerRank challenges to improve my algorithmic problem-solving skills and achieve the required HackerRank milestone.

The accepted submissions for these additional problems are documented through HR6.png to HR19.png.


## 6. Simple Array Sum

The problem requires calculating the sum of all elements present in an integer array.

Implementation: Java 8

Approach:
The array is traversed from beginning to end and each element is added to a running sum.

Time Complexity: O(N)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/simple-array-sum/problem


## 7. A Very Big Sum

The problem requires calculating the sum of a large number of integers where the result may exceed the range of a standard integer.

Implementation: Java 8

Approach:
The values are stored using the long data type and added together during a single traversal of the array.

Time Complexity: O(N)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/a-very-big-sum/problem


## 8. Plus Minus

The problem requires calculating the proportions of positive, negative, and zero values in an array.

Implementation: Java 8

Approach:
The array is traversed once while maintaining separate counters for positive numbers, negative numbers, and zeros. Each count is divided by the total number of elements to obtain the required ratios.

Time Complexity: O(N)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem


## 9. Staircase

The problem requires printing a right-aligned staircase pattern of a specified height.

Implementation: Java 8

Approach:
Nested loops are used to print the required number of spaces followed by the required number of hash characters for each row.

Time Complexity: O(N²)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/staircase/problem


## 10. Mini-Max Sum

The problem requires finding the minimum and maximum sums that can be obtained by summing exactly four out of five given integers.

Implementation: Java 8

Approach:
The values are analysed to determine the smallest and largest possible sums. The total sum can also be used to calculate the minimum and maximum values by excluding the appropriate element.

Time Complexity: O(N)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/mini-max-sum/problem


## 11. Birthday Cake Candles

The problem requires determining how many candles have the maximum height.

Implementation: Java 8

Approach:
The array is traversed while maintaining the current maximum height and the number of times that maximum occurs.

Time Complexity: O(N)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/birthday-cake-candles/problem


## 12. Grading Students

The problem requires rounding student grades according to specified grading rules.

Implementation: Java 8

Approach:
Each grade is examined individually. Grades below the minimum passing value are not rounded, while eligible grades are rounded to the next multiple of five when the difference is less than the specified threshold.

Time Complexity: O(N)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/grading/problem


## 13. Kangaroo

The problem determines whether two kangaroos moving at different starting positions and jump distances can land at the same location at the same time.

Implementation: Java 8

Approach:
The positions and jump rates are analysed mathematically to determine whether a common position can be reached after the same number of jumps.

Time Complexity: O(1)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/kangaroo/problem


## 14. Breaking the Records

The problem counts how many times a player breaks their previous highest and lowest score records during a season.

Implementation: Java 8

Approach:
The scores are traversed in order while maintaining the current maximum and minimum scores. Whenever a new maximum or minimum is encountered, the corresponding counter is increased.

Time Complexity: O(N)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem


## 15. Apple and Orange

The problem determines how many apples and oranges land within a specified house range after being thrown from their respective trees.

Implementation: Java 8

Approach:
The landing position of every fruit is calculated by adding its distance to the position of the corresponding tree. The resulting position is checked to determine whether it falls within the house boundaries.

Time Complexity: O(A + O)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/apple-and-orange/problem


## 16. Migratory Birds

The problem requires identifying the bird type that appears most frequently in the given list, with the smallest type number selected when frequencies are equal.

Implementation: Java 8

Approach:
The frequency of each bird type is counted. The type with the highest frequency is selected, and ties are resolved by choosing the smaller bird type number.

Time Complexity: O(N)

Space Complexity: O(K)

HackerRank:
https://www.hackerrank.com/challenges/migratory-birds/problem


## 17. Solve Me First

The problem requires calculating the sum of two integers.

Implementation: Java 8

Approach:
The two input integers are read and directly added together.

Time Complexity: O(1)

Space Complexity: O(1)

HackerRank:
https://www.hackerrank.com/challenges/solve-me-first/problem


## 18. Sales by Match

The problem determines the number of matching pairs of socks in a pile.

Implementation: Java 8

Approach:
The frequency of each sock colour is tracked. Every two socks of the same colour form one pair.

Time Complexity: O(N)

Space Complexity: O(K)

HackerRank:
https://www.hackerrank.com/challenges/sock-merchant/problem


## 19. Cut the Sticks

The problem repeatedly cuts all sticks by the length of the shortest remaining stick and records the number of sticks before each cut.

Implementation: Java 8

Approach:
The remaining stick lengths are processed to identify the smallest length. After each cut, the number of remaining sticks is recorded and sticks that reach zero length are removed from further processing.

Time Complexity: O(N²) for the direct repeated-processing approach

Space Complexity: O(N)

HackerRank:
https://www.hackerrank.com/challenges/cut-the-sticks/problem


# Additional Practice Summary

| No. | Problem | Time Complexity | Space Complexity |
|---|---|---|---|
| 6 | Simple Array Sum | O(N) | O(1) |
| 7 | A Very Big Sum | O(N) | O(1) |
| 8 | Plus Minus | O(N) | O(1) |
| 9 | Staircase | O(N²) | O(1) |
| 10 | Mini-Max Sum | O(N) | O(1) |
| 11 | Birthday Cake Candles | O(N) | O(1) |
| 12 | Grading Students | O(N) | O(1) |
| 13 | Kangaroo | O(1) | O(1) |
| 14 | Breaking the Records | O(N) | O(1) |
| 15 | Apple and Orange | O(A + O) | O(1) |
| 16 | Migratory Birds | O(N) | O(K) |
| 17 | Solve Me First | O(1) | O(1) |
| 18 | Sales by Match | O(N) | O(K) |
| 19 | Cut the Sticks | O(N²) | O(N) |


# Key Algorithmic Techniques

The problems in this portfolio provided practice with several fundamental programming and algorithmic techniques.

1. Array traversal

2. Matrix traversal

3. String manipulation

4. Conditional statements

5. Frequency counting

6. HashMap-based data structures

7. Dynamic arrays

8. Query processing

9. Mathematical calculations

10. Pattern printing

11. Input and output handling

12. Time complexity analysis

13. Space complexity analysis

14. Algorithm optimisation


# Learning Outcome

Through this activity, I developed a more systematic approach to algorithmic problem solving.

I learned to analyse problem requirements, identify suitable algorithms and data structures, implement solutions using Java, test solutions against different cases, and evaluate their time and space complexity.

The mandatory problems provided practice with arrays, matrices, strings, dynamic arrays, and frequency-based searching. The additional HackerRank problems provided further practice with mathematical reasoning, array manipulation, frequency counting, conditional logic, sorting-related concepts, and iterative processing.

The activity also reinforced the importance of considering computational complexity while designing a solution. Instead of focusing only on obtaining the correct output, I learned to consider how efficiently a solution performs as the input size increases.

Overall, this portfolio helped strengthen my Java programming, algorithmic thinking, debugging, optimisation, and competitive programming skills.


# Portfolio Objectives

This portfolio demonstrates:

- Practical algorithmic problem-solving skills
- Java 8 programming ability
- Understanding of time and space complexity
- Practical use of arrays and data structures
- HackerRank problem-solving practice
- Efficient algorithm implementation
- Proper GitHub project organisation
- Consistent programming practice


# Author

B.Tech Computer Science and Engineering - 3rd Semester

GitHub:
https://github.com/omsai2k7-wq/HackerRank-3rdSem-Portfolio

HackerRank:
https://www.hackerrank.com/profile/omsai2k7
