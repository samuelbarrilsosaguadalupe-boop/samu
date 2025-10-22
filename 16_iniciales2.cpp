/*
Ir haciendo porcentajes segun si es menor de x cantidades
*/
#include <stdio.h>
	
	//variables globales
		int n; //numero introducido


main()
{
	printf ("calculo de porcentajes segun el caso");
	//printf ("\nintroduce: ");
	scanf ("%d",&n);
		if (n<500){
			n=n*1.5;
				}
		else{
			if (n<1000){
				n=n*1.07;
						}
			else{
				if (n<=5000){
					n=n*1.15;
							}
					else{
						n=n*0.95;
						}
				}
			}
	printf ("\nel total es=%d",n);		
}
							