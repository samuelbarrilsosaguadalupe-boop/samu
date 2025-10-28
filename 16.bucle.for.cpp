#include <stdio.h>

int b;
int ex;
int r;
int i;

main ()
{
	printf ("base y exponente\n");
	do{
		printf ("base:");
		scanf ("%d",&b);
		printf ("exponente:");
		scanf ("%d",&ex);
	}while (b<1 && ex<0);
	r=1;
	if (ex>1){
		for (i=1;i<=ex;i++){
			r=b*r;
		}
	}
	else{
		if (ex=1){
			r=b;
		}
		else {
			r=1;
		}
	}
	printf ("resultado=%d",r);
}