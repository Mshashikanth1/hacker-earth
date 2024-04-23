static int solve(int N, int[] workload){
       // Write your code here
        int result = 0;

        for(int i=0;i<N;i++){
            int c=0;
            while(i<N &&workload[i]>6 ) {
                i++;
                c++;
            }
            result=Math.max(result,c);
        }
        return result;

        /*
        Employee rating
4960
84%
20
★★★★★3.1
18 votes
Real world, , Algorithms, Linear Search
Share
Details
Submissions
Discussion
Similar Problems
Editorial
Problem
You are an IT company's manager. Based on their performance over the last N working days, you must rate your employee. You are given an array of N integers called workload, where workload[i] represents the number of hours an employee worked on an ith day. The employee must be evaluated using the following criteria:

Rating = the maximum number of consecutive working days when the employee has worked more than 6 hours.
You are given an integer N where N represents the number of working days. You are given an integer array workload where workload[i] represents the number of hours an employee worked on an ith day.

Task

Determine the employee rating.

Example

Assumptions

N = 12
workload = [2, 3, 7, 8, 7, 6, 3, 8, 12, 11, 12, 10]
Approach

Workload with consecutive hours > 6 = [2, 3, 7, 8, 7, 6, 3, 8, 12, 11, 12, 10] =>  Longest Interval =  [8,12,11,12,10]

Therefore return 5.

Function description

Complete the Solve() function provided in the editor below that takes the following arguments and returns the employee rating:

N: Represents the number of working days
workload: where workload[i] represents the number of hours an employee worked on an ith day
Input format

The first line contains an integer N denoting the number of working days.
The second line contains a space-separated integer array workload where workload[i] represents the number of hours an employee worked on an ith day.
Output format

Print the employee rating.

Constraints



Sample Input
7
3 7 8 12 4 9 8
Sample Output
3
Time Limit: 2
Memory Limit: 256
Source Limit:
Explanation
Workload with consecutive hours > 6 = [7 8 12 4 9 8] =>  Longest Interval = [7 8 12]

Therefore, return 3.

Contributers:
avatar
Lakshya Tekwani
avtar
Hasitha Reddy
Enter your code or Upload your code as file.
Save

Java 8 (openjdk 1.8.0_241)


3635343332313029282726252423137
            }
            result=Math.max(result,c);
        }
        return result;
}
}
36:2 vscode


Test against custom input
Submission ID: 91761379 / 8 seconds ago
RESULT:  Accepted Refer judge environment
Score

20

 
Time (sec)

0.65647

 
Memory (KiB)

82816

 
Language

Java 8

Input	Result	Time (sec)	Memory (KiB)	Score	Your Output	Correct Output	Diff
Input #1	 Accepted	0.057847	80504	1			
Input #2	 Accepted	0.058858	80240	1			
Input #3	 Accepted	0.057768	80504	1			
Input #4	 Accepted	0.05887	80240	1			
Input #5	 Accepted	0.058861	80240	1			
Input #6	 Accepted	0.05785	80376	3			
Input #7	 Accepted	0.057733	80504	3			
Input #8	 Accepted	0.057852	80568	3			
Input #9	 Accepted	0.058863	80240	3			
Input #10	 Accepted	0.131964	82816	3			

        */
