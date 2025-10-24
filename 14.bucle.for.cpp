/*
Visualizar ******
*/
#include <stdio.h>

int i;	//valor inicial del for
int n;  //numero
int x;  //cantidad de *
main()
{
	printf ("* por numero\n");
	do{
		printf("Numero:");
		scanf ("%d",&n);
	}while (n<1);
	for (i=1 ; i<=n && i!=0; i++){
		for (x=1 ; x<=i ; x++){
			printf ("*");
		}
	printf ("\n");
	if (i == n){
		i=i-2;
		n=n-1;
	}
	}
}