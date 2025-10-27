/*
Tablas de multiplicar
*/
#include <stdio.h>

int n;	//numero
int r;	//resultado
int m;	//multiplicador

main()
{
	printf ("Tablas de multiplicar\n");
	m=1;
	for (n=1;n<=10;n++){
		r=m*n;
		printf ("%d",m);
		printf ("x""%d",n);
		printf ("=""%d \n",r);
		if (n==10 && m<10){
			m=m+1;
			n=0;
		}		
	}	
}