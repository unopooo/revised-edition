import java.util.*;
class Pass2{
	public static void main(String args[])
	{
	int MDTC=0,i=0,j=0,k=0,index=0;
	
	String Pass2[][]=new String[10][2];
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
	
	  System.out.println("Source Code:");
	for (String n : program) {
         System.out.println("" + n);
      }
	for (int x=0; x<program.size(); x++)
	{
		String s=program.get(x);
		if(s.equals("MACRO"))
		{
			i=x;
			while(true)
			{
				if(s.equals("MEND"))
				break;
				else
				{
				x++;
				s=program.get(x);
				}
			}
		}
		if(s.equals("ADDM"))
		{
			program.remove(x);
			

			for (int y=0; y<program.size(); y++)
			{
				String r=program.get(y);
				//System.out.println("r:"+r);
				if(r.equals("MACRO"))
				{
					k=0;
					y++;
					r=program.get(y);

					
					if(r.equals(s))
					{
						String r1=program.get(y+1);
						k=x;
						while(!r1.equals("MEND"))
						{
							
								program.add(k,r1);
								k++;
								y++;
								r1=program.get(y);
								
							
						}
					}
				}
				
			}

		}
	} 
	 System.out.println("\n\nExpanded Source Code:");
	for (String n : program) {
         System.out.println("" + n);
      }
	}
}
/*
OUTPUT:

C:\Users\student\Desktop>javac Pass2.java

C:\Users\student\Desktop>java Pass2
Source Code:
MACRO
ADDM
A 1,DATA
A 2,DATA
A 3,DATA
A 4,DATA
MEND
ADDM
DATA DC F5
ADDM
END


Expanded Source Code:
MACRO
ADDM
A 1,DATA
A 2,DATA
A 3,DATA
A 4,DATA
MEND
A 1,DATA
A 1,DATA
A 2,DATA
A 3,DATA
A 4,DATA
DATA DC F5
A 1,DATA
A 1,DATA
A 2,DATA
A 3,DATA
A 4,DATA
END

C:\Users\student\Desktop>
*/
