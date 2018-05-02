import java.util.Scanner;

class Macro 
{
static int mntc,mdtc;
public static void main(String args[])
{
int p,j,i=0,n=5;
String name=new String();;
String a[]={ "MACRO", "ADDM", "A 1,DATA", "A 2 DATA", "A 3 DATA", "MEND" ,"DATA DC F5","END"};
mntc=0;
mdtc=0;
System.out.println("INDEX"+"       "+"NAME"+"          "+"MDT INDEX");
while(a[i]!="END")
{
if(a[i]=="MACRO")
{
name=a[i+1];
break;
}
i++;
}
System.out.println(mntc+"           "+name+"           "+mdtc);
mntc++;
}
}
