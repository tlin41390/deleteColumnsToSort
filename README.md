# deleteColumnsToSort

Terence Lin

This is the deleteColumnsToSort program. This program will take a series of string from an array and then delete every character except for the first one. Then, it will compare the first characters of each string then return the indicies of the columns in the array that are not in sorted order. The program will return an empty list if it is in sorted order, and finally, the program is going to return -1 if the strings are not in order.

runTime :O(n^2) the program is using nested for loops to "brute force" this problem.

SpaceComplexity:O(1) the program is creating a array for reference then using that to return a list.

