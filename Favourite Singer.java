/* IMPORTANT: Multiple classes and nested static classes are supported */


/*

Favourite Singer
70874
75%
20
★★★★★3
106 votes
Basics of Input/Output, Input/Output, Basic Programming
Share
Details
Submissions
Discussion
Similar Problems
Editorial
Problem
Bob has a playlist of 
 songs, each song has a singer associated with it (denoted by an integer)

Favourite singer of Bob is the one whose songs are the most on the playlist

Count the number of Favourite Singers of Bob

Input Format 

The first line contains an integer 
, denoting the number of songs in Bob's playlist.

The following input contains 
 integers, 
 integer denoting the singer of the 
 song.

Output Format

Output a single integer, the number of favourite singers of Bob

Note: Use 64 bit data type

Constraints


Sample Input
5
1 1 2 2 4
Sample Output
2
Time Limit: 1
Memory Limit: 256
Source Limit:
Explanation
In this example
Songs of singer 1 and 2 appear 2 times(which is max) in this playlist 
Therefore the answer is 2


*/
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

        Map<Integer,Integer> fhMap=new HashMap<>();
        
        int maxFrq=-1;
        for(int i:arr) {
            fhMap.put(i,fhMap.getOrDefault(i,0)+1);
            maxFrq=Math.max(maxFrq,fhMap.get(i));
        }

        int ans=0;
        for(int i: fhMap.keySet()){
            if(fhMap.get(i)==maxFrq) ans++;
        }
    
    
        System.out.println(ans);

    }
}
