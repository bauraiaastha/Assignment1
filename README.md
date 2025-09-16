# Assignment1
This project solves a matrix-based problem where we draw letters (Z, D, A, X) using numbers inside an N × N matrix.

Problem Statement
In the land of Matricia, the king encodes secret messages in patterns drawn on square
grids.
He gives you:
1. A square matrix of size N × N, filled with numbers from 1 to N×N in row-major
order.
2. A character ch which can be one of the following:
○ Z → Draw letter Z
○ D → Draw letter D
○ A → Draw letter A
○ X → Draw letter X
Your task is to:
● Construct the pattern using matrix elements (not just 0/1).
● Replace all non-pattern positions with 0.
● Print the resulting matrix.
● Print the sum of all numbers used in the pattern.
Input Format
● First line: A character ch (Z, D, A, X).
● Second line: An integer N (3 ≤ N ≤ 20)
Output Format
● The N × N matrix where only the chosen pattern positions keep their values, all
others are 0.
● The sum of all values included in the pattern.
Constraints
● 3 ≤ N ≤ 20
● Pattern is guaranteed to be one of {Z, D, A, X}
