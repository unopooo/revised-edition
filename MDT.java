// MDT
import java.util.*;
class MDT
{
	public static void main(String args[])
	{
	int MDTC=0,i=0,j=0,k=0,index=0;	
	String MDT[][]=new String[10][2];
	ArrayList<String> program = new ArrayList<String>();
	program.add("MACRO");
	program.add("ADDM");
	program.add("A 1,DATA");
	program.add("A 2,DATA");
	program.add("A 3,DATA");
	program.add("A 4,DATA");
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
			x=x+2;
			s=program.get(x);
			i=x;
			while(true)
			{
				MDT[j][0]=Integer.toString(MDTC);
				MDT[j][1]=s;
				j++;
				i++;
				MDTC++;
				if(s.equals("MEND"))
				break;
				else
				s=program.get(i);
			}
			x=i;
			
		}	
	}
	System.out.println("Index\t\tCard");
	for(k=0;k<MDTC;k++)
	{
	System.out.println(MDT[k][0]+"\t\t"+MDT[k][1]);
	}
 }
}
/*
OUTPUT:
C:\Users\student\Desktop>javac MDT.java

C:\Users\student\Desktop>java MDT
Index           Card
0               A 1,DATA
1               A 2,DATA
2               A 3,DATA
3               A 4,DATA
4               MEND

C:\Users\student\Desktop>
*/








