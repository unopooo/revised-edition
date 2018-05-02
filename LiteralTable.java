import java.io.*;
import java.util.*;

class exp2c
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n,i,j,lc=-4;
  int match;
  System.out.print("Enter the no. of lines: ");
  n=sc.nextInt();
  String a[][]=new String[n+1][4];
  System.out.println("Enter your code:");
  a[0][0]="Label";
  a[0][1]="Opcode";
  a[0][2]="op1";
  a[0][3]="op2";
  for( i=1 ; i<=n ; i++)
  {
   for( j=0; j<4 ; j++)
     a[i][j]=sc.next();
  }
 System.out.println("\nToken Table\n");
  for( i=0 ; i<=n ; i++)
  {
   for( j=0 ; j<4 ; j++)
    System.out.print("\t"+a[i][j]);
   System.out.println();
  }

  String st[][] = new String[15][3];
  String m=".";
  int top=0;
  st[0][0]="Symbol";
  st[0][1]="Value";
  st[0][2]="Address";
  for(i=1 ; i<=n ; i++)
  {
   if(!m.equals(a[i][0]))
   {
    j=top;
    while( j>0)
    {
	if(a[i][0].equals(st[j][0]))
	  break;
	j--;
    }
    if( j==0 )
     continue;
	else
    {
     if( a[i][1].equals("DC"))
      st[j][1] = a[i][2];
    }
   }
   if( a[i][1] == "START")
       continue;
   
   if (!m.equals(a[i][3]))
    { top++; st[top][0]=a[i][3]; }
  }
  System.out.println("\nLiteral table:\n");
  for( i=0 ; i<=top ; i++)
    System.out.println("\t"+st[i][0]+"\t"+st[i][1]);	
 }
}    

/*
OUTPUT 
Enter the no. of lines: 9
Enter your code:
TEST START 0 .
. L 1 FIVE
. M 1 SIX
. ST 1 TEMP
. PRINT TEMP .
FIVE DC F'2' .
SIX DC F'3' .
TEMP DS 1F .
. END . .

Token Table

        Label   Opcode  op1     op2
        TEST    START   0       .
        .       L       1       FIVE
        .       M       1       SIX
        .       ST      1       TEMP
        .       PRINT   TEMP    .
        FIVE    DC      F'2'    .
        SIX     DC      F'3'    .
        TEMP    DS      1F      .
        .       END     .       .

Literal table:

        Symbol  Value
        FIVE    F'2'
        SIX     F'3'
        TEMP    null
		
*/

