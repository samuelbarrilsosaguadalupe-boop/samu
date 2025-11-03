#include <stdio.h>

int c, r, q, i;

main()
{
	do{
	scanf ("%d",&c);
	scanf ("%d",&r);
	for (i=1 ; i<r ;i=i+1){
		c=c-1;
		q=i*2;
		if (q==c){
			q=q/2-1;
			i=r;
		}
	}
	}while(i>1);
	if (q>c){
	printf ("PIERDO");
	}	
}