/*****************************************************************************************************************************************************************
Is there any majority number? 
For this challenge, you need to take integer as input on one line which will tell number of array elements and array elements as an input on another line and find 
the majority number and print that number to the stdout. If not found return -1.

(Majority Element: A majority element in an array A[] of size n is an element that appears more than n/2 times.)

Input Format
In this challenge, you will take number of elements as input on one line and array elements which are space separated as input on another line.

Constraints
1 <= N <= 1000
1 <= Ai <= 10000

Output Format
You will print the majority number to the stdout.

Sample TestCase 1
Input
9
11 11 11 11 23 11 24 13 55
Output
11
*******************************************************************************************************************************************************************/

/* Read input from STDIN. Print your output to STDOUT*/
#include<stdio.h>
int main(int argc, char *ag[])
{
	int n;
	scanf("%d",&n);
	int a[n],b[n],k=0,c[n];
	for(int i=0;i<n;i++){
		scanf("%d",&a[i]);
		int f=0;
		for(int j=0;j<k;j++)
			if(a[i]==b[j]){
				c[j]++;
				f=1;
				break;
			}
		if(f==0){
			b[k]=a[i];
			c[k++]=1;
		}
	}
	int r=-1,m=0;
	if(k==0){
		printf("%d",-1);
		return 0;
	}
	for(int i=0;i<k;i++)
	if(c[i]>m){
		m=c[i];
		r=b[i];
	}
	printf("%d",r);
}
