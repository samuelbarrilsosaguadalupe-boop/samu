/*
*Precio y cantidad de un producto y calcule el total
*/
#include <stdio.h>


	//variables globales
float cantidad;
float precio;
float total;		


main()
{
	printf ("total de la compra");
	printf ("\n cantidad:  ");
	scanf ("%f",&cantidad);
	printf ("\n precio:   ");
	scanf ("%f",&precio);
	total=precio*cantidad;
	printf ("\n total=%.2f",total);
}
