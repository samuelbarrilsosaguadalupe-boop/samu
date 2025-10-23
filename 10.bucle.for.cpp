/*
Ejercicio 10 FOR
*/
#include <stdio.h>
	
	//Variables
	int n; //Numero introducido
	int i; //Variable para el for
	int p; //Factoriable
	
main()
{
	printf ("Calcular un factorial");
	printf ("\nNumero:");
	scanf ("%d",&n);
	p=1;
	for (i=n; i>=1 ; i--){
		p=p*i;
	}
	printf ("Factorial= %d",p);
}