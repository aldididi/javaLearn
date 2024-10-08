/*
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

Wikipedia if-else flow chart

Source: Wikipedia

Task
Given an integer,N , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of  6 to 20, print Weird
If  is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, N.

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird

*/

import java.util.*;

public class HackerrankIfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        boolean isOdd = N %2 != 0 ? true : false;
        if (isOdd ){
            System.out.println("Weird");
        } else{
            if (N >= 2 && N <= 5){
                System.out.println("Not Weird");
            }else if (N > 6 && N <= 20){
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }

       /* if (N %2 != 0 ){
            System.out.println("Weird");
        } if (N %2 == 0){
            if (N > 2 && N < 5 || N>20) {
                System.out.println("Not Weird");
            } else if (N > 6 && N < 20) {
                System.out.println("Weird");
            }
        }*/


    }
}
