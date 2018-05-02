//ALA

import java.util.*;
class ALA
{
	public static void main(String args[])
	{
	int ALAC=1,i=0,j=0,k=0,index=0;
	
	String ALA[][]=new String[10][2];
	ArrayList<String> program = new ArrayList<String>();
	program.add("MACRO");
	program.add("ADDM  &arg1,&arg2");
	program.add("A 1,&arg1");
	program.add("A 2,&arg2");
	program.add("MEND");
	program.add("ADDM");
	program.add("DATA DC F5");
	program.add("ADDM");
	program.add("END");
	for (int x=0; x<program.size(); x++)
	{
		String s=program.get(x);
		if(s.equals("MACRO"))
		{
			x++;
			s=program.get(x);
			i=x;
			
				String a[]=s.split("\\s+");
			 	String s1=a[1];	
				String a1[]=s1.split(",");
				for(int u=0;u<a1.length;u++)
				{
				ALA[j][0]=Integer.toString(ALAC);
				ALA[j][1]=a1[u];
				j++;
				ALAC++;}
				
			
			
		}	
	}
	System.out.println("Index\t\tArgument");
	for(k=0;k<ALAC-1;k++)
	{
	System.out.println("#"+ALA[k][0]+"\t\t"+ALA[k][1]);
	}}
	
	
}
/*
OUTPUT:
student@student-HP-Compaq-4000-Pro-SFF-PC:~$ cd Desktop
student@student-HP-Compaq-4000-Pro-SFF-PC:~/Desktop$ javac ALA.java
student@student-HP-Compaq-4000-Pro-SFF-PC:~/Desktop$ java ALA
Index		Argument
#1		&arg1
#2		&arg2
*/
