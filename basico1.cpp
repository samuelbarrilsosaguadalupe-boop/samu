/*
*area del rectangulo
*/
#include <stdio.h>
 
	//variables globales
float b;	//base del rectangulo
float a;	//altura
float s;	//superficie


main()
{
	printf ("area del rectangulo");
	printf ("\n base:");
	scanf ("%f",&b);
	printf ("\n altura:");
	scanf ("%f" ,&a);
	s=b*a;
	printf ("\n superficie=%.1f",s);
}