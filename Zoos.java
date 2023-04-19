/* IMPORTANT: Multiple classes and nested static classes are supported 
Problem
Zoos.java
You are required to enter a word that consists of 
 and  that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if 

.

Determine if the entered word is similar to word zoo.

For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

Input format

    First line: A word that starts with several Zs and continues by several Os.
    Note: The maximum length of this word must be 

    .

Output format

Print Yes if the input word can be considered as the string zoo otherwise, print No.
Sample Input

zzzoooooo

Sample Output

Yes

Time Limit: 0.5
Memory Limit: 256
Source Limit: 

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
import java.util.Scanner;
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
        Scanner sc =new Scanner(System.in);
        String inp=sc.nextLine();
        char[] chr=inp.toCharArray();
        // char a='z',b='o',c='o';
        // int n=chr.length,i=0,j=i+1,k=j+1,flag=0;
        // while(k<n){
        //     if(chr[i]==a && chr[j]==b && chr[k]==c){
        //         flag=1;
        //         break;
        //     }
        //     i++;
        //     j=i+1;
        //     k=j+1;
        // }
        // if(flag==1){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }

        int x=0,y=0,i=0,n=chr.length;
        while(i<n){
            if(chr[i]=='z')x++;
            else if(chr[i]=='o')y++;
            i++;
        }
        if(2*x==y)System.out.println("Yes");
        else System.out.println("No");

    }
}
