#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void main()
{
	FILE *fp;
	char temp[100];
	char labels[100][100];
	int rloc[100];
	int litloc[100];
	int length[10];
	char literals[100][100];
	int scanning=0, labelc=0, opcodec=0, operandc=0,literalc=0, i,j,k, lc=0;
	printf("Reading file...");
	fp = fopen("prog.txt", "r");
	if(fp == NULL)
	{
		printf("Cannot open file");
		exit(0);
	}
	printf("\nLabel\tOpcode\tOperand\n");
	while(fscanf(fp, "%s", temp)!=EOF)
	{
		if(scanning==0)
		{
			if(temp[0]=='.')
			{
				printf("\t");
			} else {
				strcpy(labels[labelc],temp);
				rloc[labelc] = lc;
				printf("%s\t", temp);
				labelc++;
			}
			scanning++;

		}
		else if(scanning==1)
		{
			printf("%s\t", temp);
			opcodec++;
			scanning++;
		}
		else if(scanning==2)
		{
			if(temp[0]=='.')
			{
				printf("\t\n");
			}else{
				printf("%s\n",temp);
				operandc++;
			}
			for(j=0;j<(int)strlen(temp);j++)
			{
				if(temp[j] == '='){
					j++;
					k=0;	
					while(temp[j]!=',' && temp[j]!='\n' && j<(int)strlen(temp)){
						literals[literalc][k]=temp[j];
						j++;
						k++;
					}
					litloc[literalc]=lc;
					literalc++;
				}
			}
			scanning = 0;
			lc=lc+4;
		}
	}
	printf("\nliteral\tloc\tlength\tRelocation\n");
	for(i=0; i<literalc; i++)
	{
		printf("%s\t%d\t4\tR\n", literals[i],litloc[i]);
	}
}
