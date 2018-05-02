import java.util.*;
public class Deadcode{
public static void main(String args[]){
	String lhs[] = {"a","b","d"};
	String rhs[] = {"5","c+d","d+b"};
	int a[] = new int[10];
	int l=lhs.length;
	System.out.println("the dead code is \n");
	for(int i=0;i<l;i++)
	{
	 String temp=lhs[i];
	 int flag=0;
		for(int j=0;j<l;j++)
		{
		 if(rhs[j].indexOf(temp)>=0)
		 {
		  flag=1;
		  break;
		 }
		}
	 if(flag==0)
	 {
	  a[i]=0;
	  System.out.println(lhs[i]+"="+rhs[i]+"\n");
	 }
	 else
	 {
	  a[i]=1;
	 }
	}
	System.out.println("the optimized code is\n");
	for(int i=0;i<l;i++)
	{
	 if(a[i]==0)
		continue;
	 System.out.println(lhs[i]+" = "+rhs[i]+"\n");
	}
}
}
