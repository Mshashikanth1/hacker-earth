/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


Tanya and Lassi
3369
85%
30
★★★★★3.9
183 votes
Dynamic Programming, Approved, Easy-Medium
Share
Details
Submissions
Discussion
Similar Problems
Editorial
Problem
Your friend Tanya has recently launched a new company producing a very tasty version of India traditional drink called Lassi.

It has become very popular, so there are a lot of customers who want to buy it. Recently, she prepared L liters of Lassi ready to sell. Moreover, his marketer sent her a list of L integers corresponding to prices for which bottles of sizes 1, 2, 3, ..., L can be sold.

Since Tanya is good at producing drinks, but not as good as you with algorithms, she asked you to help her to get the maximum possible profit. In more details, you have to decide what is the maximum profit she can get by producing bottles from available L liters of Lassi and selling them to customers for prices given by the marketer. Notice that Tanya can produce any number of bottles of any integer size in a range [1, L], however, she gets money only for bottles full of Lassi.

In one test file, your task is to handle T instances of the above problem.

Constraints:



price for any bottle is a positive integer not greater than 106

Input format:

In the first line there is one integer T denoting the number of cases to solve. Each of these test cases is given by 2 consecutive lines. In the first of them, there is a single integer L denoting the number of available liters of Lassi. In the second one, there are L integers denoting the prices for which bottles of size 1, 2, 3, ..., L can be sold.

Output format:

In one line, output the maximum profit which Tanya can get by selling L liters of Lassi for given prices.

Sample Input
1
3
2 5 6
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        while(n>0){
        int L=sc.nextInt();

        int[] p=new int[L+1];
        for(int i=1;i<=L;i++) p[i]=sc.nextInt();

        int[] dp =new int[L+1];
        for(int i=1;i<=L;i++){
            for(int j=1;j<=i;j++){
                dp[i]=Math.max(dp[i],dp[i-j]+p[j]);
            }
        }

        System.out.println(dp[L]);
        n--;
    }
    }
}
