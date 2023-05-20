# Assignment-1
TOPICS

1.Iteration

2.Recursion

3.Memoization

Pascal Triangle Java program for above methods
   In all the 3 methods, I used main concept coefficient of binomial theorem i.e ncr=n!/((n-r)!*r!) , by using it we can form pascal triangle.

1.Iteration:

    In this method ,I used two functions.
    One function to calculate factorials using for loop.
    Another function for substituting required factorials in formula using for loop.And in this function we use another for loop to form a pascal triangle.

2.Recursion:
    Recursion means function calling itself.
    
    In this method ,I used three functions.
    One function to calculate factorials using recursion(Function calling by itself).
    One function for substituting required factorials in formula using recursion(by calling its function and below function)
    And another function for forming a pascal triangle upto user specified postion by calling above function. 
    
3.Memoization:
     Memoization means remembering known values.
     
     We get program for this by using map function for factorial function for above program.
     Map function gives known factorial values, so it is easy to calculate without using recursion.
     
     

