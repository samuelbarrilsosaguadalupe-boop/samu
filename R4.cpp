#include <stdio.h>

int na,nb,c,ca,cb;
char s;

main(){
	printf("Compra de entradas\n");
	printf("cuantas entradas hay de A?\n");
	scanf ("%d",&na);
	printf("cuantas entradas hay de B?\n");
	scanf ("%d",&nb);
	while(na>0 || nb>0){
		do{
			printf("cuantas vas a comprar?\n");
			scanf ("%d",&c);
			if(c>5){
				printf("no se pueden comprar mas de 5\n");
			}
		}while(c>5);
		printf("Cuantas quieres de A?\n");
		scanf ("%d",&ca);
		printf("Cuantas quieres de B?\n");
		scanf ("%d",&cb);
		
		if (ca<=na){
			na=na-ca;
		}
		else{
			printf("no hay suficientes entradas de A\n");
			printf("quieres comprar las %d de A que quedan? S/N\n",na);
			scanf(" %c",&s);
			if(s=='S' || s=='s'){
				na=0;
			}
		}
		if (cb<=nb){
			nb=nb-cb;
		}	
		else{
			printf("no hay suficientes entradas de B\n");
			printf("quieres comprar las %d de B que quedan? S/N\n",nb);
			scanf(" %c",&s);
			if(s=='S' || s=='s'){
				nb=0;
			}
		}
	}	
}