import java.io.*;
import java.util.*;

class pass1a
{
  public static void main(String args[]) {
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
 System.out.println("\nToken Table:");
  for( i=0 ; i<=n ; i++) 
 {
   for( j=0 ; j<4 ; j++)
    System.out.print("\t"+a[i][j]);
    System.out.println();
  }
 }
}    












/*  OUTPUT 


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


*/

