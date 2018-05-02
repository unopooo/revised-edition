import java.io.*; 
import java.lang.*; 

class SymbolTable
 { 
    public static void main(String args[]) throws Exception 
    { 
    FileReader fr = new FileReader("program.asm"); 
    BufferedReader br = new BufferedReader(fr); 
    String s,l; 
    String code[]=new String[100];
    String label[]=new String[100];

    int N=0,i,LOC=0,n=0,j;
    System.out.println("Assembly lang program :\n--------------------------");
    while((s = br.readLine()) != null)
    {
        code[N++]=s;
        System.out.println(s); 
    } 
    fr.close();
    FileReader labels = new FileReader("label.txt"); 
    BufferedReader buff = new BufferedReader(labels); 
    while((s = buff.readLine()) != null)
    {
        label[n++]=s;
    } 
    labels.close();
    System.out.println("\n\n SYMBOL TABLE :\n-------------------------------------------\nLABEL\tLC\tLENGTH\tRELATIVE/ABSOLUTE\n-------------------------------------------");
    for(i=0;i<N;i++)
    {
        for(j=0;j<n;j++)
        {           
                char codearr[]=new char[15];
                codearr=code[i].toCharArray();
                if(code[i].startsWith("USING"))
                {
                 break;
                }
                else if(code[i].startsWith(label[j]))
                {
                    System.out.println(label[j]+"\t"+LOC+"\t4\tR");
                    if(i==0)
                    {}
                    else
                    LOC=LOC+4;
                    break;                  
                }
                else if(codearr[1]=='R')   // for register addressing mode
                    LOC=LOC+2;
                else
                    LOC=LOC+4;
        }   
    }
    } 
 }

