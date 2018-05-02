import java.util.*;
import java.io.*;

class lexical {
public static void main(String args[])	{
	int i,strlen,j=0,k=0;
	Scanner sc=new Scanner(System.in);
	char operator[]=new char[100];
	char identify1[]=new char[100];
	char a,b,c;
	String ipstring;
	System.out.println("\n Enter the statement:");
	ipstring=sc.next();
	strlen=ipstring.length();
	for(i=0;i<strlen;i++) {
 	if(( ipstring.charAt(i)=='+')||( ipstring.charAt(i)=='/')||( ipstring.charAt(i)=='*')||( ipstring.charAt(i)=='-' )|| ( ipstring.charAt(i)=='=') ||(  ipstring.charAt(i)=='%'))		{
			operator[j]= ipstring.charAt(i);
			j++;		}
		else {
			identify1[k]= ipstring.charAt(i);
			k++;		}			
		}
		System.out.println("\n The identifiers in the expression are:");
		for(i=0;i<=k;i++)	{
			System.out.println(identify1[i]);
		}
		System.out.println("\n The operators in the expression are:");
		for(i=0;i<=k;i++)	{
			System.out.println(operator[i]);
		}
	}
}

