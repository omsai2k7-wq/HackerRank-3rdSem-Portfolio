# HackerRank 3rd Sem Portfolio

This repository contains my 3rd Semester B.Tech CSE HackerRank Algorithmic Problem-Solving Portfolio, implemented using Java 8.

## Links

GitHub Repository:  
https://github.com/omsai2k7-wq/HackerRank-3rdSem-Portfolio

HackerRank Profile:  
https://www.hackerrank.com/profile/omsai2k7

## Technology Used

| Category | Details |
|---|---|
| Programming Language | Java 8 |
| Platform | HackerRank |
| Repository Platform | GitHub |

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
    ├── HR20.png
    ├── 3-Star-Badge.png
    └── README.md

# Mandatory HackerRank Problems

## 1. Diagonal Difference

### Problem Description

Given a square matrix, calculate the absolute difference between the sums of its two diagonals.

### Implementation

The Java 8 solution traverses the matrix and calculates the sum of the primary and secondary diagonals.

### Approach

For every row, the primary diagonal element is accessed using the same row and column index. The secondary diagonal element is accessed using the row index and the reversed column index.

The absolute difference between the two sums is returned.

### Time Complexity

O(N)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/diagonal-difference/problem

### Submission Screenshot

![Diagonal Difference](HR1.png)

---

## 2. Dynamic Array

### Problem Description

The problem involves maintaining multiple dynamic sequences and processing two types of queries that add values to sequences or retrieve values from them.

### Implementation

The Java 8 solution uses dynamic lists to store the sequences and processes each query according to the required rules.

### Approach

For each query, the sequence index is calculated using the given values and the current value of `lastAnswer`.

Type 1 queries append an element to the selected sequence.

Type 2 queries retrieve the required element and update `lastAnswer`.

### Time Complexity

O(N + Q)

### Space Complexity

O(N)

### HackerRank Problem

https://www.hackerrank.com/challenges/dynamic-array/problem

### Submission Screenshot

![Dynamic Array](HR2.png)

---

## 3. Time Conversion

### Problem Description

Convert a time from 12-hour AM/PM format to 24-hour format.

### Implementation

The Java 8 solution separates the hour, minute, second and AM/PM components and converts the hour according to the required format.

### Approach

For PM times, 12-hour values are converted appropriately to 24-hour notation.

For 12 AM, the hour is changed to `00`.

All other values remain unchanged.

### Time Complexity

O(1)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/time-conversion/problem

### Submission Screenshot

![Time Conversion](HR3.png)

---

## 4. Compare the Triplets

### Problem Description

Compare Alice's and Bob's scores across three categories and calculate the points obtained by each participant.

### Implementation

The corresponding values from the two arrays are compared using conditional statements.

### Approach

If Alice's value is greater, Alice receives one point.

If Bob's value is greater, Bob receives one point.

If both values are equal, neither receives a point.

### Time Complexity

O(1)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/compare-the-triplets/problem

### Submission Screenshot

![Compare the Triplets](HR4.png)

---

## 5. Sparse Arrays

### Problem Description

Given a collection of strings and a set of query strings, determine how many times each query occurs in the collection.

### Implementation

A `HashMap` is used to store the frequency of each string.

### Approach

Each input string is stored in a frequency map.

For every query, the corresponding frequency is retrieved from the map.

If the query does not exist, the frequency is considered zero.

### Time Complexity

O(N + Q)

### Space Complexity

O(N)

### HackerRank Problem

https://www.hackerrank.com/challenges/sparse-arrays/problem

### Submission Screenshot

![Sparse Arrays](HR5.png)

---

# Complexity Summary

| No. | Problem | Time Complexity | Space Complexity |
|---:|---|---|---|
| 1 | Diagonal Difference | O(N) | O(1) |
| 2 | Dynamic Array | O(N + Q) | O(N) |
| 3 | Time Conversion | O(1) | O(1) |
| 4 | Compare the Triplets | O(1) | O(1) |
| 5 | Sparse Arrays | O(N + Q) | O(N) |

# HackerRank 3-Star Achievement

The required HackerRank 3-Star Problem Solving achievement has been earned and is included in the repository.

![HackerRank 3-Star Badge](3-Star-Badge.png)

### HackerRank Profile

https://www.hackerrank.com/profile/omsai2k7

# Additional HackerRank Practice

## 6. Simple Array Sum

### Problem Description

Calculate the sum of all elements in an integer array.

### Implementation

The array is traversed once and every element is added to a running total.

### Approach

A variable is maintained to store the running sum. Each array element is added to this variable.

### Time Complexity

O(N)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/simple-array-sum/problem

### Submission Screenshot

![Simple Array Sum](HR6.png)

---

## 7. A Very Big Sum

### Problem Description

Calculate the sum of a large number of integers where the result may exceed the range of a normal integer.

### Implementation

The Java `long` data type is used to store the total sum.

### Approach

Each element is added to a `long` variable while traversing the array.

### Time Complexity

O(N)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/a-very-big-sum/problem

### Submission Screenshot

![A Very Big Sum](HR7.png)

---

## 8. Plus Minus

### Problem Description

Calculate the proportions of positive, negative and zero values in an array.

### Implementation

Separate counters are maintained for positive numbers, negative numbers and zeros.

### Approach

The array is traversed once. Each value is classified as positive, negative or zero. The three counts are divided by the total number of elements.

### Time Complexity

O(N)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/plus-minus/problem

### Submission Screenshot

![Plus Minus](HR8.png)

---

## 9. Staircase

### Problem Description

Print a right-aligned staircase pattern of a given height.

### Implementation

Nested loops are used to print spaces and hash characters for every row.

### Approach

For each row, the required number of spaces is printed first, followed by the required number of hash characters.

### Time Complexity

O(N²)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/staircase/problem

### Submission Screenshot

![Staircase](HR9.png)

---

## 10. Mini-Max Sum

### Problem Description

Calculate the minimum and maximum sums that can be obtained by summing four of five integers.

### Implementation

The total sum, minimum value and maximum value are determined while processing the input.

### Approach

The minimum sum is calculated by subtracting the maximum value from the total sum.

The maximum sum is calculated by subtracting the minimum value from the total sum.

### Time Complexity

O(N)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/mini-max-sum/problem

### Submission Screenshot

![Mini-Max Sum](HR10.png)

---

## 11. Birthday Cake Candles

### Problem Description

Determine how many candles have the maximum height.

### Implementation

The maximum height and its frequency are tracked while traversing the array.

### Approach

Whenever a larger height is found, the maximum value is updated and the counter is reset.

If the same maximum value occurs again, the counter is increased.

### Time Complexity

O(N)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/birthday-cake-candles/problem

### Submission Screenshot

![Birthday Cake Candles](HR11.png)

---

## 12. Grading Students

### Problem Description

Round student grades according to the specified grading rules.

### Implementation

Each grade is checked and rounded when it is within the required range of the next multiple of five.

### Approach

Grades below the passing threshold are not rounded.

For other grades, the next multiple of five is calculated and the difference is checked.

### Time Complexity

O(N)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/grading/problem

### Submission Screenshot

![Grading Students](HR12.png)

---

## 13. Kangaroo

### Problem Description

Determine whether two kangaroos starting at different positions and moving at different jump distances can land at the same location at the same time.

### Implementation

The solution uses a mathematical condition to determine whether both kangaroos can meet.

### Approach

The difference in starting positions and jump distances is compared.

A meeting is possible only when the required number of jumps is a non-negative integer.

### Time Complexity

O(1)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/kangaroo/problem

### Submission Screenshot

![Kangaroo](HR13.png)

---

## 14. Breaking the Records

### Problem Description

Count how many times the highest and lowest scoring records are broken during a season.

### Implementation

The current maximum and minimum scores are maintained while processing the scores.

### Approach

Every score is compared with the current maximum and minimum.

If a new maximum is found, the maximum record counter increases.

If a new minimum is found, the minimum record counter increases.

### Time Complexity

O(N)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

### Submission Screenshot

![Breaking the Records](HR14.png)

---

## 15. Apple and Orange

### Problem Description

Determine how many apples and oranges land within the boundaries of a house.

### Implementation

The landing position of each fruit is calculated and checked against the house boundaries.

### Approach

For every apple and orange, its distance from the corresponding tree is added to the tree's position.

The resulting position is checked to determine whether the fruit lands on the house.

### Time Complexity

O(A + O)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/apple-and-orange/problem

### Submission Screenshot

![Apple and Orange](HR15.png)

---

## 16. Migratory Birds

### Problem Description

Find the bird type that occurs most frequently in the given list.

### Implementation

The frequency of each bird type is tracked while processing the array.

### Approach

A frequency structure is used to count occurrences.

The bird type with the highest frequency is selected. If multiple types have the same frequency, the smallest type number is selected.

### Time Complexity

O(N)

### Space Complexity

O(K)

### HackerRank Problem

https://www.hackerrank.com/challenges/migratory-birds/problem

### Submission Screenshot

![Migratory Birds](HR16.png)

---

## 17. Solve Me First

### Problem Description

Calculate the sum of two integers.

### Implementation

The two input integers are read and added together.

### Approach

The values are directly added and the result is returned.

### Time Complexity

O(1)

### Space Complexity

O(1)

### HackerRank Problem

https://www.hackerrank.com/challenges/solve-me-first/problem

### Submission Screenshot

![Solve Me First](HR17.png)

---

## 18. Sales by Match

### Problem Description

Determine the number of matching pairs of socks in a pile.

### Implementation

The frequency of each sock colour is tracked to determine the number of complete pairs.

### Approach

Each sock colour is counted.

For every colour, the number of complete pairs is calculated by dividing its frequency by two.

### Time Complexity

O(N)

### Space Complexity

O(K)

### HackerRank Problem

https://www.hackerrank.com/challenges/sock-merchant/problem

### Submission Screenshot

![Sales by Match](HR18.png)

---

## 19. Cut the Sticks

### Problem Description

Repeatedly cut all sticks by the length of the shortest remaining stick and report the number of sticks before each cut.

### Implementation

The remaining sticks are processed repeatedly until all sticks have been removed.

### Approach

The shortest remaining stick length is determined.

That length is subtracted from every remaining stick and sticks that reach zero are removed.

The process continues until no sticks remain.

### Time Complexity

O(N²)

### Space Complexity

O(N)

### HackerRank Problem

https://www.hackerrank.com/challenges/cut-the-sticks/problem

### Submission Screenshot

![Cut the Sticks](HR19.png)

---

## 20. Additional HackerRank Practice

This section documents the additional HackerRank problem represented by `HR20.png`.

### Problem Description

Additional HackerRank problem-solving practice completed as part of the portfolio.

### Implementation

Implemented using Java 8.

### Approach

The problem was solved and submitted successfully on HackerRank.

### Time Complexity

Not documented

### Space Complexity

Not documented

### Submission Screenshot

![Additional HackerRank Practice](HR20.png)

---

# Additional Practice Summary

| No. | Problem | Time Complexity | Space Complexity | Screenshot |
|---:|---|---|---|---|
| 6 | Simple Array Sum | O(N) | O(1) | HR6.png |
| 7 | A Very Big Sum | O(N) | O(1) | HR7.png |
| 8 | Plus Minus | O(N) | O(1) | HR8.png |
| 9 | Staircase | O(N²) | O(1) | HR9.png |
| 10 | Mini-Max Sum | O(N) | O(1) | HR10.png |
| 11 | Birthday Cake Candles | O(N) | O(1) | HR11.png |
| 12 | Grading Students | O(N) | O(1) | HR12.png |
| 13 | Kangaroo | O(1) | O(1) | HR13.png |
| 14 | Breaking the Records | O(N) | O(1) | HR14.png |
| 15 | Apple and Orange | O(A + O) | O(1) | HR15.png |
| 16 | Migratory Birds | O(N) | O(K) | HR16.png |
| 17 | Solve Me First | O(1) | O(1) | HR17.png |
| 18 | Sales by Match | O(N) | O(K) | HR18.png |
| 19 | Cut the Sticks | O(N²) | O(N) | HR19.png |
| 20 | Additional HackerRank Practice | Not documented | Not documented | HR20.png |

# Key Learning Outcomes

This portfolio helped develop practical skills in:

1. Algorithmic problem solving
2. Array and matrix manipulation
3. String processing
4. Frequency counting
5. HashMap usage
6. Dynamic data structures
7. Mathematical problem solving
8. Query processing
9. Time complexity analysis
10. Space complexity analysis
11. Algorithm optimisation
12. Java programming

# Reflection

Through this activity, I developed a more systematic approach to algorithmic problem solving. The HackerRank problems helped me understand how to convert a problem statement into an efficient algorithm and then implement that algorithm using Java 8.

One of the major concepts I learned was the importance of time and space complexity. Instead of focusing only on obtaining the correct output, I learned to consider how an algorithm performs as the input size increases. Problems involving arrays and frequency counting helped me understand how appropriate data structures can reduce unnecessary computation.

I also gained practical experience with matrix traversal, string manipulation, dynamic arrays, hashing, conditional logic and mathematical reasoning. Solving multiple problems on HackerRank improved my ability to identify patterns and choose suitable approaches rather than relying on brute-force solutions.

Maintaining the solutions in a structured GitHub repository also helped me understand the importance of code organisation, documentation and version control. The combination of HackerRank practice and GitHub portfolio development provided practical experience in both competitive programming and professional software development practices.

# Conclusion

This portfolio demonstrates the application of fundamental data structures, algorithms and optimisation techniques through HackerRank problems.

The five mandatory problems and additional practice problems provided hands-on experience with different categories of algorithmic challenges.

The repository serves as a record of my 3rd Semester CSE programming practice and demonstrates my progress in Java-based algorithmic problem solving.

# Author

B.Tech Computer Science and Engineering

3rd Semester

GitHub:

https://github.com/omsai2k7-wq/HackerRank-3rdSem-Portfolio

HackerRank:

https://www.hackerrank.com/profile/omsai2k7
