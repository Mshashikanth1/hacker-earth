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
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if((""+n).contains("21") || n%21==0)
            System.out.println("The streak is broken!");
            else
            System.out.println("The streak lives still in our heart!");

        }

    }

    /*
    Rest in peace - 21-1!
38922
83%
20
★★★★★3.5
175 votes
Ad-Hoc, Approved, Basic Programming, Easy, Open
Share
Details
Submissions
Discussion
Similar Problems
Editorial
Problem
The grandest stage of all, Wrestlemania XXX recently happened. And with it, happened one of the biggest heartbreaks for the WWE fans around the world. The Undertaker's undefeated streak was finally over.

Now as an Undertaker fan, you're disappointed, disheartened and shattered to pieces. And Little Jhool doesn't want to upset you in any way possible. (After all you are his only friend, true friend!) Little Jhool knows that you're still sensitive to the loss, so he decides to help you out.

Every time you come across a number, Little Jhool carefully manipulates it. He doesn't want you to face numbers which have "21" as a part of them. Or, in the worst case possible, are divisible by 21.

If you end up facing such a number you feel sad... and no one wants that - because you start chanting "The streak is broken!" , if the number doesn't make you feel sad, you say, "The streak lives still in our heart!"

Help Little Jhool so that he can help you!

Input Format:
The first line contains a number, t, denoting the number of test cases.
After that, for t lines there is one number in every line.

Output Format:
Print the required string, depending on how the number will make you feel.

Constraints:
1 ≤ t ≤ 100
1 ≤ n ≤ 1000000

enter image description here

Sample Input
3
120
121
231

Sample Output
The streak lives still in our heart!
The streak is broken!
The streak is broken!
Time Limit: 1
Memory Limit: 256
Source Limit:
Contributers:
avatar
Arjit Srivastava
Enter your code or Upload your code as file.
Save

Java 8 (openjdk 1.8.0_241)


46

        // Write your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if((""+n).contains("21") || n%21==0)
            System.out.println("The streak is broken!");
            else
            System.out.println("The streak lives still in our heart!");

40:72 vscode


Test against custom input
Submission ID: 91761478
RESULT:  AcceptedRefer judge environment
Score

20

Time (sec)

0.57091

Memory (KiB)

86116

Language

Java 8

Input	Result	Time (sec)	Memory (KiB)	Score	Your output	Correct output	Diff
Input #1	Accepted	0.074842	83472	10			
Input #2	Accepted	0.083751	81304	15			
Input #3	Accepted	0.07481	83472	15			
Input #4	Accepted	0.082061	85888	15			
Input #5	Accepted	0.074126	85528	15			
Input #6	Accepted	0.090328	86116	15			
Input #7	Accepted	0.090988	83484	15			
    
    */
}
