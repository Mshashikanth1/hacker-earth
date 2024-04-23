/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        Set<Integer> his=new HashSet<>();
        int mex=0;

        for(int i=0;i<n;i++) {
            while(arr[i]==mex || his.contains(mex) ){
                mex++;
            }
            his.add(arr[i]);
            System.out.print(mex+" ");
        }
    }
}

/*
Find Mex
4121
67%
10
★★★★★4.2
4 votes
, Algorithms, Brute Force, Implementation, Linear Search, Iterators
Share
Details
Submissions
Discussion
Similar Problems
Editorial
Problem
You are given an integer array of length 
. You have to find 
 of 
 element for all 
.

 of the 
 element is the minimum element greater than or equal to 
 which is not present in array till the 
 index.

 

Input Format:

First line contains an integer 
 denoting the size of array.

Next line contains 
 integers denoting the elements of the array.

 

Output Format:

Print 
 integers. 
 element should be the 
 of the array prefix till 

 

Constraints:


Sample Input
5
1 0 5 5 3
Sample Output
0 2 2 2 2
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
For first test case mex of first index is 0. As it is note present in array
*/
