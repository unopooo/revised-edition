#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void main()
{
	FILE *fp;
	char temp[100];
	char labels[100][100];
	int rloc[100];
	int length[10];
	int scanning=0, labelc=0, opcodec=0, operandc=0, i, lc=0;
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


			scanning = 0;
			lc=lc+4;
		}
	}
	printf("\nlabel\tloc\tlength\tRelocation\n");
	for(i=0; i<labelc; i++)
	{
		printf("%s\t%d\t4\tR\n", labels[i],rloc[i]);
	}
}
