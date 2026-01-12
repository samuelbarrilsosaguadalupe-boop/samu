#include <stdio.h>
#include <string.h>

char frase[]="esto es una frase";
char pal[15];

int i=0,j;
char aux[15];

main(){
	printf ("palabra:");
	scanf("%s",&pal);
	while (frase[i]!='\0'){
		j=0;
		while (frase[i]!=' ' && frase[i]!='\0'){
			aux[j]=frase[i];
			i++;
			j++;
		}
		aux[j]='\0';
		
		if (strcmp(aux,pal)==0){
			frase[i-j]='*';
			pal[0]='*';
		}
		i++;
	}
	printf("%s\n",frase);
	printf("%s",pal);
}